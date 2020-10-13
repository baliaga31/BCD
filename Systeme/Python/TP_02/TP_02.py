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

# Variables
pays = []
capitales = []

# Read a file
with open(fileName, "r") as capital_file:
    for line in capital_file:
        test = line.rstrip().rsplit(",")
        pays.append(test[0])
        capitales.append(test[1])
        
# Choose randomly a country
alea = random.randint(1,len(pays)-1)

# Ask a question to the player
print("\n Welcome to the Super Quizz! \n")
print("Do you know the capital of:", pays[alea] + "\n")

# Player answer:
answer = input("Your answer:")

# Test the player answer
if answer == capitales[alea]:
    print("Good response!")
else:
    print("Wrong. Try again")
    print(capitales[alea])

