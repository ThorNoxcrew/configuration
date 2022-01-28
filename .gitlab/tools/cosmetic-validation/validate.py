#!/usr/bin/python

import sys, getopt, json
from pprint import pprint

# SpreadSheet & Column check offset.
# We have a different offset depending on which spreadsheet we are 
# using because the *master* contains another column 'For Launch' 
# after 'Active', so we have to accommodate for it.
VALIDATE_FILES = [
    ['Cosmetic Master - Master.csv', 0], 
    ['Cosmetic Master - _Gadget.csv', 0]
]

inputfile = ''

class COLOR:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKCYAN = '\033[96m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'

def throwError(lineNum, issue):
    print(COLOR.WARNING + "  Error at line: " + COLOR.FAIL + COLOR.UNDERLINE + str(lineNum) + COLOR.ENDC + COLOR.WARNING + " Issue:", issue)

def main(argv):
    try:
      opts, args = getopt.getopt(argv,"hi:o:")
    except getopt.GetoptError:
      print('Usage: -i <inputfile*.csv>')
      sys.exit(2)

    for opt, arg in opts:
        if opt == '-h':
            print('Usage: -i <inputfile*.csv>')
            sys.exit(2)
        elif opt in ("-i"):
            inputfile = arg

    # Make sure we are not give an empty path.
    if inputfile == '':
        print('No input file provided!')
        print('Try: -i <inputfile*.csv>')
        sys.exit(2)

    print('Input file:', inputfile)
    
    for elem in VALIDATE_FILES: 
        # Check if the inputfile is one we should validate.
        if (inputfile.endswith(elem[0])): 
            print('Validating File', inputfile, '\n')
            file = open(inputfile, 'r')
            lines = file.readlines()

            lineNum = 0
            for line in lines:
                lineNum += 1
                if (lineNum == 1):
                    continue

                # print("Line{}: {}".format(lineNum, line))
                columns = line.split(',')

                columnOffset = elem[1]

                COLUMN_ACTIVE = columns[0]
                COLUMN_SYSTEM = columns[1 + columnOffset]
                COLUMN_ITEM_ID = columns[2 + columnOffset]
                COLUMN_CATEGORY = columns[3 + columnOffset]
                COLUMN_ITEM_NAME = columns[4 + columnOffset]
                COLUMN_NAME = columns[5 + columnOffset]
                COLUMN_DESCRIPTION = columns[6 + columnOffset]
                COLUMN_USE = columns[7 + columnOffset]
                COLUMN_RARITY = columns[8 + columnOffset]
                COLUMN_ICON_ID = columns[9 + columnOffset]

                valueChecks = [
                    ["System", COLUMN_SYSTEM],
                    ["Item ID", COLUMN_ITEM_ID],
                    ["Category", COLUMN_CATEGORY],
                    ["Item Name", COLUMN_ITEM_NAME],
                    ["Name Translation", COLUMN_NAME],
                    ["Description Translation", COLUMN_DESCRIPTION],
                    # ["Use Translation", COLUMN_USE],
                    ["Rarity", COLUMN_RARITY],
                    ["Icon ID", COLUMN_ICON_ID],
                ]

                # Check if the cosmetic is set as 'Active'.
                if (columns[0] == 'TRUE'):
                    for value in valueChecks: 
                        if (len(value[1]) == 0):
                            print('File', COLOR.ENDC + inputfile + COLOR.ENDC, 'is not valid!')
                            #pprint(valueChecks)
                            throwError(lineNum, str(COLOR.FAIL + 'No value was defined in the column \'' + COLOR.WARNING + value[0] + COLOR.FAIL + '\'!' + COLOR.ENDC))
                            print(COLOR.OKCYAN + 'Column Data:')    
                            print(json.dumps(valueChecks, indent=1))
                            print(COLOR.ENDC)

if __name__ == "__main__":
    main(sys.argv[1:])