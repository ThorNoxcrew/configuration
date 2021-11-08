from pyhocon import ConfigFactory
from loguru import logger
import os
import sys
import logging

@logger.catch
def main():
    logger.remove()
    logger.add(
        sys.stderr,
        colorize=True,
        level="INFO",
        backtrace=True,
        diagnose=True,
    )

    class InterceptHandler(logging.Handler):
        def emit(self, record):
            # Get corresponding Loguru level if it exists
            try:
                level = logger.level(record.levelname).name
            except ValueError:
                level = record.levelno
            # Find caller from where originated the logged message
            frame, depth = logging.currentframe(), 2
            while frame.f_code.co_filename == logging.__file__:
                frame = frame.f_back
                depth += 1
            logger.opt(depth=depth, exception=record.exc_info).log(
                level, record.getMessage()
            )

    logging.basicConfig(
        handlers=[InterceptHandler()], level=logging.getLevelName("INFO")
    )

    logger.info("Parsing HOCON files...")

    dir = os.walk(os.getcwd())
    valid_count = 0
    invalid_count = 0

    for r, d, f in dir:
        for file in f:
            if file.endswith(".conf"):
                try:
                    ConfigFactory.parse_file(os.path.join(r, file))
                    valid_count += 1
                    # logger.success(os.path.join(r, file) + " is a valid HOCON file")
                except Exception as e:
                    invalid_count += 1
                    logger.error("Exception parsing HOCON file at {}: {}".format(os.path.join(r, file), str(sys.exc_info()[:2])))

    logger.info("{} valid, {} invalid".format(valid_count, invalid_count))

if __name__ == "__main__":
    main()