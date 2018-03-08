/*
SQL STRING FUNCTIONS

*/


/*
==========================================================
ASCII
----------------------------------------------------------
the ASCII() Requires a character paramter and returns the number code for. 
If more than one character is entered, it will return the value for the first character and ignore all the rest.
==========================================================
*/

--select from all Products the ProductName and the number code of the first character in "ProductName"
SELECT ProductName, ASCII(ProductName) AS 'Ascii Num FirstChar'
FROM Products



/*
==========================================================
CHAR
----------------------------------------------------------
The CHAR reqiuers a number and returns the character with this ASCII code
if the number does not represent an ASCII char - a NULL will be returned
==========================================================
*/

--select from all Products the CategoryID and the char of this CategoryID (1 -> "A", 2-> "B" ,etc.)
SELECT CategoryID, CHAR(CategoryID+64) AS 'Category ID Char'
FROM Products
 

/*
==========================================================
CHARINDEX
----------------------------------------------------------
The CHARINDEX reqiuers as parameters:
 
1.	substring -Required - The substring to find
2.	string - Required - The string to search in
3.	start_pos - Optional - The position in string where the search will start. The first position is 1

If substring is not found within string, the CHARINDEX function will return 0
==========================================================
*/

--select from all Products the ProductName and the position of char 'D' in the ProductName
SELECT ProductName, CHARINDEX('D',ProductName) AS 'D Pos In ProductName'
FROM Products

--select ProductName from Products that contain in the ProductName char 'D' (after the third char)  
SELECT ProductName
FROM Products
WHERE CHARINDEX('D',ProductName,3)>0



/*
==========================================================
STR
----------------------------------------------------------
The STR reqiuers as parameters:
 
1.	number	- Required - The numeric value to convert to a string
2.	length	- Optional - The length of the result string. Default value is 10
3.	decimal_places	- Optional - The number of decimals to display. Default value is 0

and Returns a string representation of a number
(if there is not enough length or decimal_places to display the resulting string, The STR will round the result)
==========================================================
*/
SELECT UnitPrice,STR(UnitPrice) AS 'Unit Price STR'
FROM Products


SELECT UnitPrice,STR(UnitPrice,10,2) AS 'Unit Price STR'
FROM Products
