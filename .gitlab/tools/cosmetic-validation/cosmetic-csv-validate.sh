#!/bin/bash

find . -name "*.csv" -exec python3 .gitlab/tools/cosmetic-validation/validate.py -i {} \;