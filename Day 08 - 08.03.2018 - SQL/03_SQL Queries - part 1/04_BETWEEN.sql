/*

--************************* BETWEEN *************************

The WHERE clause is used to filter records with a specified condition.
 
Common WHERE Operator:
-----------------------------------
BETWEEN		|	Between an inclusive range

*/



--select all products with a UnitPrice BETWEEN 10 and 20:
SELECT * 
FROM Products
WHERE UnitPrice BETWEEN 10 AND 20



--select all products with a UnitPrice outside the range of 10 and 20:
--(including 10 and including 20)
SELECT * 
FROM Products
WHERE UnitPrice NOT BETWEEN 10 AND 20



--select all products with a ProductName BETWEEN 'A' AND 'C'
SELECT * 
FROM Products
WHERE ProductName BETWEEN 'A' AND 'C'



--select all products with a ProductName BETWEEN 'Chai' AND 'Ikura' 
--(will select all the products with a ProductName starting with char BETWEEN 'C' AND 'I')
SELECT * 
FROM Products
WHERE ProductName BETWEEN 'Chai' AND 'Ikura'



--selects all products with a ProductName outside the range of 'Chai' AND 'Ikura'
--(will select all the products with a ProductName starting with vlue NOT BETWEEN 'Chai' AND 'Ikura')
SELECT * 
FROM Products
WHERE ProductName NOT BETWEEN 'Chai' AND 'Ikura'



