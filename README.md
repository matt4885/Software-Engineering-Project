Stock Broker Application
Outline
Team 5: Knee Deep in the Thread
Overview
The program takes the point of view of the stock broker, where in the user will be the stock broker and take in customer information regarding their name, phone number, account number; where the broker will establish stocks and shares to each customer, where the user will receive “buy” and “sell” commands from a “user” and provided a stock, with the number of shares for that stock. All of this information, both customer and financial, will be stored in a database, such that the program will be able to save and load “profiles”. These profiles will contain the customer and financial information.
The program “Stock Broker” will provide the following functions
GUI Interface
Provide ability to create/save/load/edit customer’s information/financials
Create - Establish a new customer, with required items:
Name
First
Last
Middle Initial
Telephone Number
Address
Account Number
4 digit number for ease of presentation
Current Stocks
A tuple (dictionary) of the following order
stock_Symbol number_Of_Shares
Empty, if no stocks currently
Save
Store all data into new Strings or tuple
Compare previous data in DB to new data entered
If new data != previous data:
data_In_DB = new_data;
Load
Present list of saved profiles
Double click to load
Pull data from DB
Edit
Not necessarily a distinct feature, but will be a product of loading a new profile and overwriting data
Database
Relation database vs non-relational database
If relational:
SQL 
mySQL 
postgreSQL
Database Design
Customer
First Name
Last Name
Middle Initial
Account Number (Maybe primary key?)
Address
Telephone Number
Current Stocks
If not relational:
MongoDB
Yahoo Finance API
Will pull data for stocks
Current price
Can be used to calculate difference in money earned/lost through a customer’s stock

	This is just a generic outline at the moment, but I want the rest of the team to add to this, or rather, think of things that I have missed or that you think should be included. 
