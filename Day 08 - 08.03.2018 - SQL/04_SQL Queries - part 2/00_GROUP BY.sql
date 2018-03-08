/*
GROUP BY works with:
	-AVG
	-COUNT
	-SUM
	-MAX
	-MIN
*/
--GET 77 ROWS OF SupplierID
SELECT SupplierID, UnitPrice
FROM Products


--GET 29 ROWS OF DISTINCT SupplierID
SELECT DISTINCT SupplierID
FROM Products

--GET 29 ROWS OF DISTINCT SupplierID and show their avrage UnitPrice
SELECT SupplierID, AVG(UnitPrice) AS [Supplier Average]
FROM Products
GROUP BY SupplierID


SELECT country, COUNT(*) AS [Customers per Country]
FROM Customers
GROUP BY Country

