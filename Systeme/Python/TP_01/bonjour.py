#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import sys

pyScriptName = sys.argv[0]
firstParam = sys.argv[1]
factParam = sys.argv[2]
nbrPrem = sys.argv[3]

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

print("\n")

print("Factorielle \n")

def fact(x):
    if x == 0:
        return 1
    else:
        return x * fact(x-1)
    
print(fact(int(factParam)))    

print("\n")
print("Nombres Premiers \n")

# n premiers entiers positifs

print("{} est-il un nombre premier ?".format(nbrPrem))

def premier(x):
    if x == 0 or x == 1:
        print("C'est un nombre premier")
    else:
        assert x >= 2
        for i in range(2, x):
            if x%i  == 0:
                return "Ce n'est pas un nombre premier."
        return "C'est un nombre premier"

print(premier(int(nbrPrem)))

# Autre solution pour les nombres premiers

def premiers2(x):
    premiers = []
    for n in range(2,x+1):
        diviseurs = []
        for i in range(1,n+1):
            if n % i == 0:
                diviseurs.append(i)
        if diviseurs == [1, i]:
            premiers.append(i)
    return premiers

print(premiers2(int(nbrPrem)))
