/*
constrains:
--------------------------
IDENTITY (1, 1) - insert to every record a number - starting by 1 and inc every time by 1

NOT NULL - the field can not be empty

UNIQUE - can appear only once in a table

*/

--CREATE NEW TABLES TO THE "BookStore" DB
USE BookStore
GO
CREATE TABLE [dbo].[Authors] (
    [AuthorID]   INT           IDENTITY (1, 1) NOT NULL,
    [AuthorAge] INT  NOT NULL,
    [AuthorName] NVARCHAR (20) NOT  NULL UNIQUE, 
    [AuthorImage] NVARCHAR (MAX) NOT  NULL, 
    CONSTRAINT [PK_Author] PRIMARY KEY ([AuthorID])
);



CREATE TABLE [dbo].[Books] (
    [BookID]     INT           IDENTITY (1, 1) NOT NULL,
    [BookName]   NVARCHAR (15) NOT NULL UNIQUE,
	[BookPrice]  DECIMAL           NOT NULL,
    [AuthorID]   INT           NOT NULL,
    CONSTRAINT [PK_Books] PRIMARY KEY ([BookID]),
    CONSTRAINT [FK_Books_ToTable] FOREIGN KEY ([AuthorID]) REFERENCES [dbo].[Authors]([AuthorID])

);
