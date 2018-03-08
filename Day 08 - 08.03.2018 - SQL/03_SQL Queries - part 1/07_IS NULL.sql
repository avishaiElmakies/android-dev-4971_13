/*

--************************* IS NULL *************************

The WHERE clause is used to filter records with a specified condition.

A field with a NULL value is a field with no value.
It is not possible to test for NULL values with comparison operators, such as =, <, or <>.
We will have to use the IS NULL and IS NOT NULL operators instead.
 
Common WHERE Operators:
-----------------------------------
IS NULL			|	displays a record if the specified column element contains NULL
IS NOT NULL		|	displays a record if the specified column element is not NULL

*/

--select all products that have no SupplierID
SELECT* 
FROM Products
WHERE SupplierID IS NULL


--select all products that do have SupplierID
SELECT* 
FROM Products
WHERE SupplierID IS NOT NULL