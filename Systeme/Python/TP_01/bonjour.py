#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import sys

pyScriptName = sys.argv[0]
firstParam = sys.argv[1]
factParam = sys.argv[2]

#if len(sys.argv) == 1:
#    print("Vous devez donner un parametre au script.")
#else:
#    print(sys.argv[1])
    
#print("bonjour ")

for i in sys.argv:
    print(i)

# afficher tous les parametres sauf le premier

print("sauf premier parametre. \n")

for i in sys.argv[1:]:
    print(i)

# factorielle

#n = int(input("rentrez votre n \n"))

def fact(x):
    if x == 1:
        return 1
    else:
        return x * fact(x-1)
    
print(fact(int(factParam)))    

print("\n")

# n premiers entiers positifs

def premier(x):
    if x == 0 and x == 1:
        print("c'est un nombre premier")
    else:
        
