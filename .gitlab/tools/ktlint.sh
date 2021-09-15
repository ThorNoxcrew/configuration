#!/bin/bash
shopt -s extglob nullglob globstar

rm -rf /tmp/configuration-ktlint || true
mkdir -p /tmp/configuration-ktlint
cp -R * /tmp/configuration-ktlint

for f in /tmp/configuration-ktlint/**/+(*.mcc.kts|*.kts|*.kt); do
  ktlint $f
done

echo "Comparing repository with Kotlin formatted one"
DIFF=$(diff -ru --color=always -x '.*' . /tmp/configuration-ktlint)

echo "$DIFF"

if [ "$DIFF" != "" ]; then
	echo "Kotlin formatting issues found!"
	exit 1
else
	echo "No issues found with Kotlin formatting."
	exit 0
fi

