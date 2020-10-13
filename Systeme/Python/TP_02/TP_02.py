#!/usr/bin/env python3
# -*- coding: utf-8 -*-

##########################
#                        #
#                        #
#      TP 02 Python      #
#                        #
#                        #
##########################

# Import modules
import sys, re, random


# System parameters
pyScriptName = sys.argv[0]
fileName = sys.argv[1]
outputFilePays = sys.argv[2]
outputFileCapital = sys.argv[3]

# Variables
pays = []
capitales = []

# Read a file
print(fileName)
with open(fileName, "r") as capital_file, open(outputFilePays, "w") as output_pays, open(outputFileCapital, "w") as output_capital:
    for line in capital_file:
        test = line.rsplit(",")
        #pays = test[0]
        pays.append(test[0])
        #output_pays.write(pays + "\n")
        #capital = test[1]
        capitales.append(test[1])
        #output_capital.write(capital)

#print(pays)
#print(capitales)

# Save the list into a txt file
capital_file.close()
output_pays.close()
output_capital.close()

# Print randomly a country
print(len(pays))
alea = random.randint(1,len(pays))
print(pays[alea])
