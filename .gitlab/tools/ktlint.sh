#!/bin/bash
shopt -s extglob nullglob globstar

rm -rf /tmp/configuration-ktlint || true
mkdir -p /tmp/configuration-ktlint
cp -R * /tmp/configuration-ktlint

ktlint **/+(*.mcc.kts|*.kts|*.kt) # Run once for errors

cd /tmp/configuration-ktlint # KtLint does not support absolute path in globs:

ktlint -F **/+(*.mcc.kts|*.kts|*.kt) # Format file afterwards

echo "Comparing repository with Kotlin formatted one"
DIFF=$(diff -ru --color=always -x '.*' $CI_PROJECT_DIR /tmp/configuration-ktlint)

echo "$DIFF"

if [ "$DIFF" != "" ]; then
	echo "Kotlin formatting issues found!"
	exit 1
else
	echo "No issues found with Kotlin formatting."
	exit 0
fi

