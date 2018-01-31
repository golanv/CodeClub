import numpy as np
import matplotlib.pyplot as plt
from matplotlib.ticker import MaxNLocator
from collections import namedtuple
from db.conn import *

alist = [4, 4, 9, 90]
print(np.mean(alist))
print((4 + 4 + 9 + 90) / 4)

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

for rows in results:
    id.append(rows[0])
    name.append(rows[1])
    salary.append(rows[2])
    age.append(rows[3])
    hobbies.append(rows[4])
    job_satisfaction.append(rows[5])
    gender.append(rows[6])

# Correct misspellings
hobbies = [w.replace('knitttting', 'Knitting') for w in hobbies]
# Remove duplicates from hobbies list and reset order
hobbies_clean = list(set(hobbies))
    
a_groups = 8

fig, ax = plt.subplots()

index = np.arange(a_groups)
bar_width = 0.35

opacity = 0.4
error_config = {'ecolor': '0.3'}

rects1 = ax.bar(index, job_satisfaction, bar_width, alpha=opacity, color='b',
                yerr=job_satisfaction, error_kw=error_config,
                label='Salary')

rects2 = ax.bar(index + bar_width, hobbies, bar_width,
                alpha=opacity, color='r',
                yerr=job_satisfaction, error_kw=error_config,
                label='Hobbies')

ax.set_xlabel('Employees')
ax.set_ylabel('Job Satisfaction')
ax.set_title('Job Satisfaction Chart')
ax.set_xticks(index + bar_width / 2)
ax.set_xticklabels(name)
ax.legend()

fig.tight_layout()
plt.show()
    
    


cur.close()
conn.close()
