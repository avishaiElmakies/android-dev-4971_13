/*
--************************* IN *************************

The WHERE clause is used to filter records with a specified condition.
 

Common WHERE Operator:
-----------------------------------
IN			|	Specify multiple possible values


*/


--select all products that are named "Chai", "Chang" or "Aniseed Syrup"
SELECT * 
FROM Products
WHERE ProductName IN ('Chai', 'Chang', 'Aniseed Syrup')



--select all products that are NOT named "Chai", "Chang" or "Aniseed Syrup"
SELECT * 
FROM Products
WHERE ProductName NOT IN ('Chai', 'Chang', 'Aniseed Syrup')



