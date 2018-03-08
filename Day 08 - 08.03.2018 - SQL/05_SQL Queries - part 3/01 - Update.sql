SELECT * 
FROM Employees
WHERE EmployeeID = 9

-- UPDATE
UPDATE Employees 
SET City = 'Haifa', Country = 'Israel' 
WHERE EmployeeID = 9


-- SET NULL: 
UPDATE Employees 
SET City = 'Haifa', Country = NULL 
WHERE EmployeeID < 5



UPDATE Products 
SET UnitPrice = UnitPrice * 1.2 
WHERE SupplierID = 7


UPDATE products 
SET UnitPrice = UnitPrice * 1.05 
WHERE left(ProductName, 1) = 'a'

UPDATE products 
SET UnitPrice = UnitPrice * 1.05 
WHERE ProductName LIKE 'a%' 
