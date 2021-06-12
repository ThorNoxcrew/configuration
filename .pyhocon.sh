#!/bin/bash
shopt -s extglob nullglob globstar
INVALID_HOCON=()

for f in **/*.conf; do
  if pyhocon -i $f > /dev/null; then
    echo "$f is valid HOCON"
  else
    echo "$f is invalid HOCON"
    INVALID_HOCON+=("$f")
    EXIT=true
  fi
done

echo ""

if [ "$EXIT" = "true" ]; then
  echo "The following HOCON files are invalid:"
  for f in "${INVALID_HOCON[@]}"; do
    echo $f
  done
  exit 1
else
  echo "All HOCON is valid."
  exit 0
fi
