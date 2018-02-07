#!/usr/bin/env python3
from db.conn import *
from matplotlib import pyplot as plt
import numpy as np


# Open a cursor to perform database operations
cur = conn.cursor()

# Execute query
cur.execute("SELECT * FROM employee")

# Retrieve results
results = cur.fetchall()

# Create lists of table data
id = [] 
name = [] 
salary = [] 
age = []
hobbies = []
job_satisfaction = []
gender = []
myArray = []
data = []

for rows in results:
    data.append((rows[1], rows[5]))
    data.append((rows[4], rows[5]))
    id.append(rows[0])
    name.append(rows[1])
    salary.append(rows[2])
    age.append(rows[3])
    hobbies.append(rows[4])
    job_satisfaction.append(rows[5])
    gender.append(rows[6])


hobbies = [w.replace('knitttting', 'Knitting') for w in hobbies]
# Remove duplicates from hobbies list and reset order
hobbies_clean = list(set(hobbies))
print("Hobbies...")
print(hobbies)
print("IDs...")
print(id)
print("Job Satisfaction scores...")
print(job_satisfaction)

y_pos = np.arange(len(hobbies))

plt.bar(y_pos, job_satisfaction)
plt.xticks(y_pos, hobbies)
plt.ylabel('Job Satisfaction')
plt.xlabel('Hobby')
plt.title('Job Satisfaction by Hobby')

#plt.plot(hobbies)

plt.show()

cur.close()
conn.close()
