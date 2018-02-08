#!/usr/bin/env python3
#import classes.projectP
from classes.projectP import *

pp = projectP()

# Collect Data
data = []
count = []
i = 0
flow = True
while (flow):
    try:
        num = float(input("Enter mean (as float): "))
        data.append(num)
        count.append(i)
        i = i + 1
    except:
        print("Loser.")
        break;
        #flow = False
print(count)
print(data)
        

# Send data to projectP.regScore for additional processing
pp.regScore(data, count)
