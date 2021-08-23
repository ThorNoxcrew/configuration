#!/bin/bash
set -euo pipefail

compile_script() {
	java -Dkotlin.environment.keepalive=true -jar /mcc-script-cli.jar $1 compiled/$1
}

SCRIPT_DIRECTORIES=$(find . -type f -name "*.mcc.kts" -printf "%h\n" | cut -c 3- | uniq)

for i in $SCRIPT_DIRECTORIES; do
	compile_script $i
done

