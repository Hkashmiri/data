#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 29 13:29:38 2023

@author: hkashmiri23
"""
cardunion = 9
cardintersection = 5
cardsymetrical = 4
cardinfected = 3 
cardremoved = 4
cardsuseptible = 7

names = ["Rick", "Shane", "Dale", "Carl", "Glenn", "Hershel", "Lori", "Jackie", "Maggie"]
intersection = ["Shane", "Dale", "Lori", "Jackie", "Hershel"]
symmetrical = ["Rick", "Carl", "Glenn", "Maggie"]

susceptible = ["Rick", "Lori", "Carl", "Glenn", "Jackie", "Hershel", "Maggie"]
infected = ["Shane", "Dale", "Hershel"]
removed = ["Lori", "Shane", "Dale", "Jackie"]

def killedAsHuman(name):
    if (susceptible.count(name) > 0) and (removed.count(name) > 0):
        return True
    else:
        return False
    
def killedAsZombie(name):
    if (infected.count(name) > 0) and (removed.count(name) > 0):
        return True
    else:
        return False

def asZombie(name):
    if (infected.count(name) > 0) and (susceptible.count(name) > 0):
        return True
    else:
        return False
    
def died(name):
    if (infected.count(name) > 0) and (susceptible.count(name) > 0) and (removed.count(name) > 0):
        return True
    else:
        return False
print(killedAsHuman(names[1]))

print(killedAsZombie(names[1]))

print(asZombie(names[1]))

print(died(names[1]))

#name = input("Nuber corrasponding to name \n0. Rick\n1.Shane\n2.Dale\n3.Carl\n4.Glenn\n5.Hershell\n6.Lori\n7.Jackie\n8.Maggie\n")

#print(killedAsHuman(name))
#print(killedAsZombie(name))
#print(asZombie(name))
#print(died(name))