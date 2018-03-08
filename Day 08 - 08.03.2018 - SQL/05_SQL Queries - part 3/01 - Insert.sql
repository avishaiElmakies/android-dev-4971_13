
-- INSERT: 
INSERT INTO Employees(FirstName, LastName, BirthDate) 
VALUES	('Jhon', 'Bryce', '1999-05-05')

-- Error - Last name can't be null:
INSERT INTO Employees(FirstName, BirthDate) 
VALUES('Test', '1995-07-03')

