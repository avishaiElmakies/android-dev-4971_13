/*

--************************* LIKE *************************

The WHERE clause is used to filter records with a specified condition.
 
Common WHERE Operator:
-----------------------------------
LIKE		|	Specify pattern



Wildcard characters used with the LIKE operator:
-----------------------------------
%				|	The percent represents zero or more characters
_				|	The underscore represents a single character
[charlist]		|	Defines sets and ranges of characters to match
[^charlist]		|	Defines sets and ranges of characters NOT to match 


*/


--selects all Products with a ProductName starting with the pattern "b"
SELECT * 
FROM Products
WHERE ProductName LIKE 'b%';

--selects all Products with a ProductName ending with the pattern "b"
SELECT * 
FROM Products
WHERE ProductName LIKE '%b';

--selects all Products with a ProductName containing the pattern "b"
SELECT * 
FROM Products
WHERE ProductName LIKE '%b%';


--selects all Products with a ProductName starting with any character, followed by "b"
SELECT * 
FROM Products
WHERE ProductName LIKE '_b'

--selects all Products with a ProductName starting with "b", followed by any character, followed by "n"
SELECT * 
FROM Products
WHERE ProductName LIKE 'b_n'

--selects all Products with a ProductName starting with "b", "s", or "d"
SELECT * 
FROM Products
WHERE ProductName LIKE '[bsd]%'

--selects all Products with a ProductName starting with "a", "b", "c", or "d"
SELECT * 
FROM Products
WHERE ProductName LIKE '[a-d]%'

--selects all Products with a ProductName NOT between "b"to "z"
SELECT * 
FROM Products
WHERE ProductName LIKE '[^b-z]%'

--selects all Products with a ProductName NOT starting with "b", "s", or "d"
SELECT * 
FROM Products
WHERE ProductName LIKE '[^bsd]%'

--selects all Products with a ProductName NOT starting with "b", "s", or "d"
SELECT * 
FROM Products
WHERE ProductName NOT LIKE '[bsd]%'

