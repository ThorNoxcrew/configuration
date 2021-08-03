#!/bin/bash

set -euo pipefail

CSV_DIRECTORIES=$(find . -type f -name "*.csv" -printf "%h\n" | cut -c 3- | uniq)

for i in $CSV_DIRECTORIES; do
	zstd -f $i/*.csv
        rm $i/*.csv
done
