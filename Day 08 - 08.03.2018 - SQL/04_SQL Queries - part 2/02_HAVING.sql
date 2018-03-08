

-- Do it on all rows:
select CategoryID, avg(UnitPrice) as [Average Price per Category]
from Products
group by CategoryID


-- Do it on price of 10-20:
select CategoryID, avg(UnitPrice) as [Average Price per Category]
from Products
where UnitPrice between 10 and 20
group by CategoryID



-- Do it on price of 10-20:
select CategoryID, avg(UnitPrice) as [Average Price per Category]
from Products
group by CategoryID
HAVING avg(UnitPrice) between 10 and 22

-- Do it average >= 30:
select CategoryID, avg(UnitPrice) as [Average Price per Category]
from Products
group by CategoryID
having avg(UnitPrice) >= 30


-- Do it on price of 10-20 and also average >= 15:
select CategoryID, avg(UnitPrice) as [Average Price per Category]
from Products
where UnitPrice between 10 and 20
group by CategoryID
having avg(UnitPrice) >= 15


