#!/usr/bin/env python3
from db.conn import *
from bokeh.plotting import figure, output_file, show
from bokeh.models import NumeralTickFormatter, HoverTool
from bokeh.layouts import row, column
from bokeh.charts import Bar

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

for rows in results:
    id.append(rows[0])
    name.append(rows[1])
    salary.append(rows[2])
    age.append(rows[3])
    hobbies.append(rows[4])
    job_satisfaction.append(rows[5])
    gender.append(rows[6])

output_file("lines.html")
print(name)
print(job_satisfaction)


# Correct misspellings
hobbies = [w.replace('knitttting', 'Knitting') for w in hobbies]
print(hobbies)
# Remove duplicates from hobbies list and reset order
hobbies_clean = list(set(hobbies))
print("Cleaned Hobbies List:")
print(hobbies_clean)

#hoverp = HoverTool(tooltips=[("Job Satisfaction Score", "$y")])
#hoverq = HoverTool(tooltips=[("Job Satisfaction Score", "$y")])
#hoverr = HoverTool(tooltips=[("Salary", "$y")])
#hover = HoverTool()

p = figure(x_range=name, y_range=(1, 10), plot_height=250, title="Job Satisfaction by Name", x_axis_label='Name', y_axis_label='Job Satisfaction')
p.vbar(x=name, top=job_satisfaction, width=0.9)
p.y_range.start = 0
#show(p)

q = figure(x_range=hobbies_clean, y_range=(1, 10), plot_height=250, title="Job Satisfaction by Hobby", x_axis_label='Hobby', y_axis_label='Job Satisfaction')
q.vbar(x=hobbies, top=job_satisfaction, width=0.9)
#q.left[0].formatter.use_scientific = False
#q.left[0].formatter = NumeralTickFormatter(format=",000")
q.y_range.start = 0

r = figure(x_range=name, y_range=(1, 250000), plot_height=250, title="Salary by name", x_axis_label='Employee', y_axis_label='Salary')
r.vbar(x=name, top=salary, width=0.9)
#r.left[0].formatter.use_scientific = False
r.left[0].formatter = NumeralTickFormatter(format="$,000")
r.y_range.start = 0

show(column(p, r, q))


cur.close()
conn.close()
