#!/usr/bin/env python3
from db.conn import *

# Open a cursor to perform database operations
cur = conn.cursor()


# Collecting column names
columns = []

# Execute query
cur.execute("select column_name from information_schema.columns where table_schema = 'public' and table_name = 'employee';")
results = cur.fetchall()

print()
print("Printing column names...")
columns = []
for i in results:
    columns.append(i[0])
print(columns)
print()

# Collecting table data
# Execute query
cur.execute("SELECT * FROM employee")

# Retrieve results
results = cur.fetchall()

# Print results
print("Printing employee table...")
print()
for row in results:
    print(row)


cur.close()
conn.close()
