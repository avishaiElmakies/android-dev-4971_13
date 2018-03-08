

select ProductName, UnitPrice, CompanyName, ContactName
from Products as P join Suppliers as S
on P.SupplierID = S.SupplierID

select ProductName, UnitPrice, CompanyName, ContactName
from Products as P join Suppliers as S
on P.SupplierID = S.SupplierID
where S.SupplierID = 7

select ProductName, UnitPrice, CompanyName, ContactName
from Products as P join Suppliers as S
on P.SupplierID = S.SupplierID
where UnitPrice BETWEEN 10 and 20
order by P.UnitPrice

SELECT CustomerID, convert(varchar, OrderDate, 103) as [Order Date],
	FirstName + ' ' + LastName as [Handled by which Employee]
from Orders as O join Employees as E
on O.EmployeeID = E.EmployeeID

