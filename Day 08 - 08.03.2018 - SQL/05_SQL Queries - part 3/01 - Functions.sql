
-- Create function: 
go
create function GetFullName(@firstName nvarchar(10), 
							@lastName nvarchar(20)) returns nvarchar(31) 
							as

--start of function's body
begin
	declare @fullName nvarchar(31) 
	set @fullName = @firstName + ' ' + @lastName 
	return @fullName 
end
--end of function's body
go


-- Call function: 
select FirstName, LastName, City, Country from Employees


select FirstName+LastName as [Full Name], 
		City, 
		Country 
from Employees



select dbo.GetFullName(FirstName,LastName) as [Full Name], 
		City, 
		Country 
from Employees


-- Create function: 
go
create function GetPriceWithVat(@price money) returns money as
begin
	return @price * 1.17
end
go

-- Call function: 
select ProductName as [Product Name], 
	   UnitPrice as Price,
	   dbo.GetPriceWithVat(UnitPrice) as [Price with VAT]
from Products


-- Create function: 
go
create function GetFormattedPrice(@price money) returns varchar(10) as
begin
	return '$' + cast(@price as nvarchar(9))
end
go

-- Call function: 
select ProductName as [Product Name], 
	   dbo.GetFormattedPrice(UnitPrice) as Price
from Products