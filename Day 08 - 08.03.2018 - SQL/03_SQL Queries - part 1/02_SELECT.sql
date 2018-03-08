/*
************Basic SELECT*************

The SELECT statement is used to select data from a database
The data returned is stored in a result table, called the result-set.

--SQL requires single quotes around text values

*/


--Select specific columns from the table 
SELECT UnitPrice, ProductName 
FROM Products


--Select all columns from the table 
SELECT *
FROM Products

--SQL aliases for column in a table, 
--An alias is temporary name - only exists for the duration of the query
SELECT UnitPrice AS 'Unit Price', ProductName AS 'Product Name'
FROM Products


SELECT UnitPrice*1.18 AS 'Market Price', ProductName AS 'Product Name'
FROM Products

SELECT UnitPrice*1.18 AS 'Market Price', ProductName+' costs: '+UnitPrice AS 'Product Info'
FROM Products


--The SELECT DISTINCT statement is used to return only distinct (different) UnitPrices
SELECT DISTINCT UnitPrice
FROM Products

--when we use SELECT DISTINCT with few columns, only distinct combinations will be returned  
SELECT DISTINCT UnitPrice, ProductName
FROM Products

--The SELECT TOP is used to specify the number / precent of records to return
SELECT TOP 4 * FROM Products;

SELECT TOP 50 PERCENT * FROM Products;


