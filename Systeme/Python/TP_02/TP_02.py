#!/usr/bin/env python3
# -*- coding: utf-8 -*-

##########################
#                        #
#                        #
#      TP 02 Python      #
#                        #
#                        #
##########################


""" 
    Quizz game on countries and theirs capitals  
"""

# Import modules
import sys, re, random

# System parameters
pyScriptName = sys.argv[0]
fileName = sys.argv[1]
question = sys.argv[2]

# Variables
pays = []
capitales = []
attempt = 1
responseOK = 0 # count the good answers

# Read a file
with open(fileName, "r") as capital_file:
    for line in capital_file:
        test = line.rstrip().rsplit(",") # remove the 
        pays.append(test[0])
        capitales.append(test[1])


### MAIN

# Ask a question to the player
print("\n Welcome to the Super Quizz! \n")

print("You have " , question , " question(s). \n")

while attempt <= int(question):
    # Choose randomly a country
    alea = random.randint(1,len(pays)-1)
    
    print("Do you know the capital of:", pays[alea] + "\n")

    # Player answer:
    answer = input("Your answer:")

    # Test the player answer
    if answer == capitales[alea]:
        print("\n Good response!")
        responseOK += 1
        percentage = (responseOK / attempt) * 100
        print("You have {} good answers ({:.2f}%).".format(responseOK, percentage))
    else:
        print("Wrong. Try again! \n")
        print(capitales[alea])
        percentage = (responseOK / attempt) * 100
        print("You have {} good answers ({:.2f}%).".format(responseOK, percentage))

    attempt += 1
