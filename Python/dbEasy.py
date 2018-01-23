#!/usr/bin/env python3
from db.conn import *

# Open a cursor to perform database operations
cur = conn.cursor()

# Execute query
cur.execute("SELECT * FROM employee")

# Retrieve results
results = cur.fetchall()

# Print results
print(results)
print()
print("Printing a cleaner version...")
print()
for row in results:
    print(row)


cur.close()
conn.close()
