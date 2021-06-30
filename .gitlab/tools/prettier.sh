#!/bin/bash
rm -rf /tmp/configuration-prettier || true
mkdir -p /tmp/configuration-prettier
cp -R * /tmp/configuration-prettier

prettier --config .prettierrc.js -w /tmp/configuration-prettier

echo "Comparing repository with Prettier formatted one"
DIFF=$(diff -ru --color=always -x '.*' . /tmp/configuration-prettier)

echo "$DIFF"

if [ "$DIFF" != "" ]; then
	echo "Prettier formatting issues found!"
	exit 1
else
	echo "No issues found with Prettier formatting."
	exit 0
fi

