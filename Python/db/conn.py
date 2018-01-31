import psycopg2
import getpass
import sys
import configparser


# ConfigParser bits
config = configparser.ConfigParser()
config.read('db/connection.ini')

# Bits to connect to Databases
### Using ConfigParser ###
#host = config['DEFAULT']['host']
dbname = config['DEFAULT']['dbname']
user = config['DEFAULT']['user']

### Using user inputs ###
host = input("Hostname: ")
#dbname = input("Database: ")
#user = input("Username: ")
password = getpass.getpass(prompt="DB Password: ", stream=None)

# Bits to determine what to sort (variables for table names).
# These will need to be different for each database.

# Code
try:
    # Connect to an existing database
    conn = psycopg2.connect(database=dbname, user=user, host=host, password=password)
except:
    sys.exit("\nERROR: I am unable to connect to the database, exiting...\n")
