#!/bin/bash

shopt -s extglob nullglob globstar
FILES=( **/*.conf )
INVALID_FILES=()
PIDS=()
EXIT=""

test_hocon() {
  pyhocon -i $1 > /dev/null
}

for f in "${FILES[@]}"; do
  test_hocon $f &
  PIDS+=( "${!}" )
done

for (( index=0; index < "${#FILES[@]}"; ++index )); do
  # Wait for first one job to complete
  FILE="${FILES[index]}"
  if wait "${PIDS[index]}"; then
    echo "${FILE} is valid HOCON"
  else
    echo "${FILE} is invalid HOCON"
    INVALID_FILES+=("${FILE}")
    EXIT=true
  fi
done

echo ""

if [ "$EXIT" = "true" ]; then
  echo "The following HOCON files are invalid:"
  for f in "${INVALID_FILES[@]}"; do
    echo $f
  done
  exit 1
else
  echo "All HOCON is valid."
  exit 0
fi
