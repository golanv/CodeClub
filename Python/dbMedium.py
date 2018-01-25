#!/usr/bin/env python3
from db.conn import *
from bokeh.plotting import figure, output_file, show


# Open a cursor to perform database operations
cur = conn.cursor()

# Execute query
cur.execute("SELECT * FROM employee")

# Retrieve results
results = cur.fetchall()

a = [] # Job Satisfaction Score
b = [] # Name

for row in results:
#    print(row[6])
    a.append(row[5])
    b.append(row[1])

output_file("lines.html")

p = figure(x_range=b, y_range=(1, 10), plot_height=250, title="Job Satisfaction Chart", x_axis_label='Name', y_axis_label='Job Satisfaction')

#p.line(x, y, legend="Temp.", line_width=2)
p.vbar(x=b, top=a, width=0.9)
p.y_range.start = 0

show(p)


cur.close()
conn.close()
