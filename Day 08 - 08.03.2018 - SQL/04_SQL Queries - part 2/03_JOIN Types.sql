--77 ROWS
select *
from Products

--9 ROWS
select *
from  Categories 
---------------------------------------
--77 ROWS
-- Inner Join
select ProductName, UnitPrice, CategoryName
from Products as P join Categories as C
on P.CategoryID = C.CategoryID

--77 ROWS
-- Left Join = Get all rows from the "left" table (Products)
select ProductName, UnitPrice, CategoryName
from Products as P left join Categories as C
on P.CategoryID = C.CategoryID



-- Right Join = Get all rows from the "right" table (Categories)
select ProductName, UnitPrice, CategoryName
from Products as P right join Categories as C
on P.CategoryID = C.CategoryID


-- Full outer Join = Get all rows from both tables
select ProductName, UnitPrice, CategoryName
from Products as P full outer join Categories as C
on P.CategoryID = C.CategoryID

-- Cross Join: 
select ProductName, UnitPrice, CategoryName
from Products as P cross join Categories as C

