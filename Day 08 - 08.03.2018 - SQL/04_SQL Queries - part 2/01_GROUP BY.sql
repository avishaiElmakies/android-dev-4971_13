
select City, count(*) as [Number of Employees per City] 
from Employees
group by City


select CategoryID, avg(UnitPrice) 
from Products
group by CategoryID


select CategoryName, avg(UnitPrice) as [Average Price]
from Products as P join Categories as C
on P.CategoryID = C.CategoryID
group by CategoryName


select CustomerID, count(*) as [Number of Orders per Customer]
from Orders
group by CustomerID

