USE [noknok]
GO
/****** Object:  Table [dbo].[ward]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ward](
	[wardid] [int] NOT NULL,
	[name] [nvarchar](100) NOT NULL,
	[type] [nvarchar](30) NOT NULL,
	[location] [nvarchar](30) NOT NULL,
	[districtid] [int] NOT NULL,
 CONSTRAINT [PK__ward__A14F20380F624AF8] PRIMARY KEY CLUSTERED 
(
	[wardid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Image]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Image](
	[postid] [int] NULL,
	[url] [nvarchar](150) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Group]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Group](
	[gid] [int] NOT NULL,
	[gname] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Group] PRIMARY KEY CLUSTERED 
(
	[gid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Feature]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Feature](
	[fid] [int] NOT NULL,
	[url] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Feature] PRIMARY KEY CLUSTERED 
(
	[fid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[district]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[district](
	[districtid] [int] NOT NULL,
	[name] [nvarchar](100) NOT NULL,
	[type] [nvarchar](30) NOT NULL,
	[location] [nvarchar](30) NOT NULL,
	[provinceid] [int] NOT NULL,
 CONSTRAINT [PK__district__2BD06FC807C12930] PRIMARY KEY CLUSTERED 
(
	[districtid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryid] [int] NOT NULL,
	[cname] [nvarchar](150) NOT NULL,
 CONSTRAINT [PK_TypeOfRoom] PRIMARY KEY CLUSTERED 
(
	[categoryid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[displayname] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Utility]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Utility](
	[uid] [int] NOT NULL,
	[uname] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Utility] PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[province]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[province](
	[provinceid] [int] NOT NULL,
	[name] [nvarchar](100) NOT NULL,
	[type] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK__province__20BE03170B91BA14] PRIMARY KEY CLUSTERED 
(
	[provinceid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PostAccount]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PostAccount](
	[username] [nvarchar](50) NOT NULL,
	[postid] [int] NOT NULL,
 CONSTRAINT [PK_PostAccount] PRIMARY KEY CLUSTERED 
(
	[username] ASC,
	[postid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Post]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Post](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](500) NULL,
	[description] [nvarchar](1500) NULL,
	[categoryid] [int] NULL,
	[address] [nvarchar](1000) NULL,
	[wardid] [int] NULL,
	[districtid] [int] NULL,
	[provinceid] [int] NULL,
	[area] [float] NULL,
	[price] [float] NULL,
	[status] [bit] NULL,
	[contactname] [nvarchar](50) NULL,
	[contactphone] [int] NULL,
	[contactemail] [nchar](150) NULL,
	[contactaddress] [nvarchar](1000) NULL,
 CONSTRAINT [PK_Room] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[AccountInformation]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[AccountInformation](
	[username] [nvarchar](50) NOT NULL,
	[email] [nvarchar](150) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [bit] NOT NULL,
	[phone] [varchar](50) NOT NULL,
 CONSTRAINT [PK_AccountInformation] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[GroupFeature]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GroupFeature](
	[gid] [int] NOT NULL,
	[fid] [int] NOT NULL,
 CONSTRAINT [PK_GroupFeature] PRIMARY KEY CLUSTERED 
(
	[gid] ASC,
	[fid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[GroupAccount]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GroupAccount](
	[gid] [int] NOT NULL,
	[username] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_GroupAccount] PRIMARY KEY CLUSTERED 
(
	[gid] ASC,
	[username] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Utility_Room]    Script Date: 11/04/2021 20:08:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Utility_Room](
	[room_id] [int] NOT NULL,
	[ulitity_id] [int] NOT NULL,
 CONSTRAINT [PK_Utility_Host] PRIMARY KEY CLUSTERED 
(
	[room_id] ASC,
	[ulitity_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  ForeignKey [FK_AccountInformation_Account]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[AccountInformation]  WITH CHECK ADD  CONSTRAINT [FK_AccountInformation_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[AccountInformation] CHECK CONSTRAINT [FK_AccountInformation_Account]
GO
/****** Object:  ForeignKey [FK_GroupAccount_Account]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[GroupAccount]  WITH CHECK ADD  CONSTRAINT [FK_GroupAccount_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[GroupAccount] CHECK CONSTRAINT [FK_GroupAccount_Account]
GO
/****** Object:  ForeignKey [FK_GroupAccount_Group]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[GroupAccount]  WITH CHECK ADD  CONSTRAINT [FK_GroupAccount_Group] FOREIGN KEY([gid])
REFERENCES [dbo].[Group] ([gid])
GO
ALTER TABLE [dbo].[GroupAccount] CHECK CONSTRAINT [FK_GroupAccount_Group]
GO
/****** Object:  ForeignKey [FK_GroupFeature_Feature]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[GroupFeature]  WITH CHECK ADD  CONSTRAINT [FK_GroupFeature_Feature] FOREIGN KEY([fid])
REFERENCES [dbo].[Feature] ([fid])
GO
ALTER TABLE [dbo].[GroupFeature] CHECK CONSTRAINT [FK_GroupFeature_Feature]
GO
/****** Object:  ForeignKey [FK_GroupFeature_Group]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[GroupFeature]  WITH CHECK ADD  CONSTRAINT [FK_GroupFeature_Group] FOREIGN KEY([gid])
REFERENCES [dbo].[Group] ([gid])
GO
ALTER TABLE [dbo].[GroupFeature] CHECK CONSTRAINT [FK_GroupFeature_Group]
GO
/****** Object:  ForeignKey [FK_Post_Category]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_Post_Category] FOREIGN KEY([categoryid])
REFERENCES [dbo].[Category] ([categoryid])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_Post_Category]
GO
/****** Object:  ForeignKey [FK_Post_district]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_Post_district] FOREIGN KEY([districtid])
REFERENCES [dbo].[district] ([districtid])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_Post_district]
GO
/****** Object:  ForeignKey [FK_Post_province]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_Post_province] FOREIGN KEY([provinceid])
REFERENCES [dbo].[province] ([provinceid])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_Post_province]
GO
/****** Object:  ForeignKey [FK_Post_ward]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_Post_ward] FOREIGN KEY([wardid])
REFERENCES [dbo].[ward] ([wardid])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_Post_ward]
GO
/****** Object:  ForeignKey [FK_PostAccount_Account]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[PostAccount]  WITH CHECK ADD  CONSTRAINT [FK_PostAccount_Account] FOREIGN KEY([username])
REFERENCES [dbo].[Account] ([username])
GO
ALTER TABLE [dbo].[PostAccount] CHECK CONSTRAINT [FK_PostAccount_Account]
GO
/****** Object:  ForeignKey [FK_Utility_Host_Utility]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Utility_Room]  WITH CHECK ADD  CONSTRAINT [FK_Utility_Host_Utility] FOREIGN KEY([ulitity_id])
REFERENCES [dbo].[Utility] ([uid])
GO
ALTER TABLE [dbo].[Utility_Room] CHECK CONSTRAINT [FK_Utility_Host_Utility]
GO
/****** Object:  ForeignKey [FK_Utility_Room_Room]    Script Date: 11/04/2021 20:08:02 ******/
ALTER TABLE [dbo].[Utility_Room]  WITH CHECK ADD  CONSTRAINT [FK_Utility_Room_Room] FOREIGN KEY([room_id])
REFERENCES [dbo].[Post] ([id])
GO
ALTER TABLE [dbo].[Utility_Room] CHECK CONSTRAINT [FK_Utility_Room_Room]
GO
