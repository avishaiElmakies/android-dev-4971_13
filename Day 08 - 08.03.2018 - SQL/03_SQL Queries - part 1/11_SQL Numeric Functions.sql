/*
SQL NUMERIC FUNCTIONS

*/


/*
==========================================================
AVG
----------------------------------------------------------
AVG requires A numeric value and returns the average value
==========================================================
*/

--Select the average value for the "UnitPrice" column in the "Products" table
SELECT AVG(UnitPrice) AS 'Average Price' 
FROM Products



/*
==========================================================
COUNT
----------------------------------------------------------
COUNT requires A field or a string value as a parameter
returns the number of records in a select query (counts only NOT NULL values)

==========================================================
*/

--return the number of products in the "Products" table
SELECT COUNT(ProductID) AS 'Number Of Products' 
FROM Products


/*
==========================================================
SUM
----------------------------------------------------------
SUM requires A numeric value (can be a field or a formula)  
returns the summed value of an expression.

==========================================================
*/

--SUM of the "UnitPrice" field in the "Products" table
SELECT SUM(UnitPrice) AS 'Sum Unit Price' FROM Products



/*
==========================================================
MAX
----------------------------------------------------------
MAX equires A numeric value (can be a field or a formula)  
returns the maximum value of an expression

==========================================================
*/

--returns the price of the most expensive product in the "Products" table
SELECT MAX(UnitPrice) AS 'Expensive Product ' 
FROM Products



/*
==========================================================
MIN
----------------------------------------------------------
MIN equires A numeric value (can be a field or a formula)  
returns the minimum value of an expression

==========================================================
*/

--returns the price of the most low cost product in the "Products" table
SELECT MIN(UnitPrice) AS 'Low Cost Product ' 
FROM Products


/*
==========================================================
ABS
----------------------------------------------------------
ABS requires A numeric value and returns the absolute value of a number
==========================================================
*/

--select from all Products the UnitPrice as positive and negative
SELECT UnitPrice, (-UnitPrice) AS 'Neg UnitPrice', ABS(-UnitPrice) AS 'Pos UnitPrice'
FROM Products


/*
==========================================================
CEILING
----------------------------------------------------------
CEILING requires A numeric value 
and returns the smallest integer value that is greater than or equal to a number
==========================================================
*/

--select from all Products the UnitPrice and the CEILING(UnitPrice)
SELECT UnitPrice, CEILING(UnitPrice) AS 'Ceil UnitPrice'
FROM Products



/*
==========================================================
FLOOR
----------------------------------------------------------
FLOOR requires A numeric value 
and returns the largest integer value that is equal to or less than the number
==========================================================
*/

--select from all Products the UnitPrice and the FLOOR(UnitPrice)
SELECT UnitPrice, FLOOR(UnitPrice) AS 'Floor UnitPrice'
FROM Products



/*
==========================================================
ROUND
----------------------------------------------------------
ROUND requires the following parameters:

1.	number - Required - The number to round
2.	decimal_places - Required - The number of decimal places to round to
3.	operation - Optional - Can be any other numeric value - Default value is 0
(When 0,  ROUND will round the result to the number of decimal_places. 
When another value than 0, ROUND will truncate the result to the number of decimal_places. )

and returns a number rounded to a certain number of decimal places.

==========================================================
*/

--select from all Products the UnitPrice and the CEILING(UnitPrice)
SELECT UnitPrice, ROUND(UnitPrice,1) AS 'Round UnitPrice'
FROM Products



/*
==========================================================
RAND
----------------------------------------------------------
RAND has an Optional parameter that can take A numeric value (seed) 
RAND will return a value between 0 (inclusive) and 1 (exclusive) if no seed is provided, 
and a repeatable sequence of random numbers if a seed value is used 

==========================================================
*/

--Return a random decimal number (no seed value - so it returns a random number >= 0 and <1)
SELECT RAND() AS 'Round Num'

--Return a random decimal number >= 0 and <5
SELECT RAND(5) AS 'Round Num'

--Return a random decimal number >= 5 and <10
SELECT RAND()*(10-5)+5 AS 'Round Num'

--Return a random number >= 5 and <=10
SELECT FLOOR(RAND()*(10-5+1)+5) AS 'Round Num'



/*
==========================================================
SIGN
----------------------------------------------------------
SIGN requires A numeric value and returns a value indicating the sign of a number.

This function will return one of the following:
If number > 0, it returns 1
If number = 0, it returns 0
If number < 0, it returns -1

==========================================================
*/

--returns : 1	0	-1

SELECT SIGN(3) AS 'Sign Pos', SIGN(0) AS 'Sign Zero', SIGN(-3) AS 'Sign Neg'