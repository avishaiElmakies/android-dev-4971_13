/*
The ORDER BY is used to sort the result-set in ascending or descending order.
The ORDER BY keyword sorts the records in ascending order by default. 


Common ORDER BY keywords:
-----------------------------------
DESC	|	sort the records in descending order
ASC		|	sort the records in ascending order

*/


/*
==========================================================
ascending order
==========================================================
*/

--select all Products with ProductID greater than 5,  in ascending order by the "ProductName" column
SELECT ProductID,UnitPrice,ProductName
FROM Products
WHERE ProductID>5 
ORDER BY ProductName

--select all Products with ProductID greater than 5,  in ascending order by the "ProductName" column
SELECT ProductID,UnitPrice,ProductName
FROM Products
WHERE ProductID>5 
ORDER BY ProductName ASC


--select all Products in descending order, sorted by the "UnitPrice" and the "ProductID" column
--"UnitPrice" - will be the main indexer in the order, and the "ProductID" will be the sub indexer
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY UnitPrice, ProductID




/*
==========================================================
descending order
==========================================================
*/

--select all Products with ProductID greater than 5,  in descending order by the "ProductName" column
SELECT ProductID,UnitPrice,ProductName
FROM Products
WHERE ProductID>5 
ORDER BY ProductName DESC



--select all Products sorted ascending by the "UnitPrice" and  descending by the "ProductID" column
--"UnitPrice" - will be the main indexer in the order, and the "ProductID" will be the sub indexer
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY UnitPrice ASC, ProductID DESC



/*
==========================================================
order by column number
==========================================================
*/

--select all Products in ascending order by the "ProductName" column (the third in the select column list)
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY 3


--select all Products in ascending order by the "UnitPrice" column (the second in the select column list)
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY 2


--select all Products in descending order by the "UnitPrice" column (the second in the select column list)
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY 2 DESC
