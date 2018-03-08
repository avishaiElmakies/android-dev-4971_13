
-- Create stored procedure:
go
create procedure InsertCategory(@categoryName nvarchar(15), @description ntext) 
								as
	insert into Categories(CategoryName, Description)
	values(@categoryName, @description)
go

-- Call the stored procedure:
EXECUTE InsertCategory 'Drinks','Water is the best'


-- Create stored procedure:
go
create procedure InsertEmployee(@firstName nvarchar(10), @lastName nvarchar(20), 
								@city nvarchar(15), @country nvarchar(15)) 
								as
	insert into Employees(FirstName, LastName, City, Country)
	values(@firstName, @lastName, @city, @country)
go

-- Call the stored procedure: 
execute InsertEmployee '914482', 'fullStack', 'Jerusalem', 'Israel'


-- Create stored procedure:
go
create procedure GetEmployeesByCity(@city nvarchar(15)) as
select * from Employees where City = @city
go

-- Call the stored procedure: 
execute GetEmployeesByCity 'London'


-- Create stored procedure:
go
ALTER procedure GetProducts(@categoryID int) as
select ProductName, UnitPrice, CategoryName
from Products as P join Categories as C
on P.CategoryID = C.CategoryID
where C.CategoryID = @categoryID
go

execute GetProducts 2

-- Create stored procedure:
go
create procedure GetOrdersByYear(@year int) as
select * from Orders where Year(OrderDate) = @year
go

execute GetOrdersByYear 1996
