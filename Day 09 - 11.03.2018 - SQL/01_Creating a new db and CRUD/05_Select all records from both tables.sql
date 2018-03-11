/****** Script for SelectTopNRows command from SSMS  ******/
SELECT * FROM [BookStore].[dbo].[Authors]

SELECT * FROM [BookStore].[dbo].[Books]


SELECT [BookName], [BookPrice], [AuthorName]
FROM [BookStore].[dbo].[Books] AS B JOIN [BookStore].[dbo].[Authors] AS A
ON B.[AuthorID]=A.[AuthorID]