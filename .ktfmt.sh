#!/bin/bash
shopt -s extglob nullglob globstar

rm -rf /tmp/configuration-ktfmt || true
mkdir -p /tmp/configuration-ktfmt
cp -R * /tmp/configuration-ktfmt

for f in /tmp/configuration-ktfmt/**/+(*.mcc.kts|*.kts|*.kt); do
  java -jar .ktfmt-0.25.jar $f
done

echo "Comparing repository with Kotlin formatted one"
DIFF=$(diff -ru --color=always -x '.*' . /tmp/configuration-ktfmt)

echo "$DIFF"

if [ "$DIFF" != "" ]; then
	echo "Kotlin formatting issues found!"
	exit 1
else
	echo "No issues found with Kotlin formatting."
	exit 0
fi

