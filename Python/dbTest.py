#!/usr/bin/env python3
from db.conn import *
from bokeh.plotting import figure, output_file, show
#import seaborn as sns
#import pandas as pd


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

output_file("lines.html")

hobbies = [w.replace('knitttting', 'Knitting') for w in hobbies]
print(hobbies)
print(id)
print(job_satisfaction)


p = figure(x_range=hobbies, y_range=(1, 10), plot_height=250, title="Job Satisfaction by Name", x_axis_label='Name', y_axis_label='Job Satisfaction')
p.vbar(x=hobbies, top=job_satisfaction, width=0.9)
p.y_range.start = 0
#show(p)

q = figure(plot_width=400, plot_height=400)
q.circle(hobbies, job_satisfaction, size=20, color="navy", alpha=0.5)
show(q)

cur.close()
conn.close()
