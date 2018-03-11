USE [BookStore]
GO


DELETE FROM [dbo].[Books]
      WHERE [AuthorID]=2
GO

DELETE FROM [dbo].[Authors]
      WHERE [AuthorID]=2
GO


