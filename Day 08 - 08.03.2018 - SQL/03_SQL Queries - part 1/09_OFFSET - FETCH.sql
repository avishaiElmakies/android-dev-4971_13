/*
OFFSET - FETCH 

*/


/*
==========================================================
OFFSET - FETCH 
==========================================================
*/


--select 13 Products in ascending order by the "UnitPrice" column 
SELECT TOP 13 ProductID,UnitPrice,ProductName
FROM Products
ORDER BY UnitPrice

--select 13 Products in ascending order by the "UnitPrice" column , and return last the 10 records
SELECT ProductID,UnitPrice,ProductName
FROM Products
ORDER BY UnitPrice
OFFSET 3 ROWS FETCH NEXT 10 ROWS ONLY


