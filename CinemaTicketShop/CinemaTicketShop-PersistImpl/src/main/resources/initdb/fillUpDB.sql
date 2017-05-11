use cinematicketshop;

INSERT INTO Users (Username, Password, Firstname, Lastname, Age, Email, Enabled) VALUES
	('user', 'user', 'John', 'Smith', 23, 'john.smith@gmail.com', true),
	('test1', 'test1', 'Michael', 'Smith', 22, 'michael.smith@gmail.com', true),
	('test2', 'test2', 'Jane', 'Sheperd', 20, 'jane.sheperd@gmail.com', true),
	('test3', 'test3', 'John', 'Cooper', 20, 'jane.sheperd@gmail.com', true);

INSERT INTO UserRoles(ID, Username, Role) VALUES
	(1, 'user', 'USER'),
	(2, 'test1', 'USER'),
	(3, 'test2', 'USER'),
	(4, 'test3', 'USER');

INSERT INTO Cinemas (ID, Address, Name) VALUES
	(1, '3525. Miskolc, Miskolc Pláza, Szentpáli út 2-4.', 'Cinema City Miskolc'),
	(2, '4026. Debrecen, Debrecen Pláza, Péterfia utca 18.', 'Cinema City Debrecen'),
	(3, '1062. Budapest, Westend City Center, Váci út 1 - 3.', 'Cinema City Debrecen');

INSERT INTO Movies (ID, Title, Cost, Genre, AgeResctriction, ScreenType) VALUES
	(1, 'Warcraft', 1500, 'FANTASY', 'PG', '2D'),
	(2, 'Warcraft', 2000, 'FANTASY', 'PG', '3D'),
	(3, 'Zootopia', 1000, 'ANIMATION', 'G', '2D'),
	(4, 'Démonok között 2.', 3000, 'HORROR', 'R', '2D');

INSERT INTO ScreeningRooms (ID, CinemaID) VALUES
	(1, 1),
	(2, 1),
	(3, 2),
	(4, 3);

INSERT INTO Seats (ID, RowNumber, SeatNumber, IsTaken, ScreeningRoomID) VALUES
	(1, 1, 1, false, 1),
	(2, 1, 2, false, 1),
	(3, 1, 3, true, 1),
	(4, 1, 4, true, 1),
	(5, 1, 5, false, 1),
	(6, 1, 1, false, 2),
	(7, 1, 2, false, 2),
	(8, 1, 3, true, 2),
	(9, 1, 4, true, 2),
	(10, 1, 5, false, 2),
	(11, 1, 1, false, 3),
	(12, 1, 2, false, 3),
	(13, 1, 3, false, 3),
	(14, 1, 4, false, 3),
	(15, 1, 5, false, 3),
	(16, 1, 1, true, 4),
	(17, 1, 2, true, 4),
	(18, 1, 3, true, 4),
	(19, 1, 4, true, 4),
	(20, 1, 5, true, 4);	

INSERT INTO Shows (ID, ScreeningRoomID, MovieID, Date) VALUES
	(1, 1, 1, "2017-05-12 10:00:00"),
	(2, 2, 4, "2017-05-12 12:00:00"),
	(3, 3, 2, "2017-05-12 10:00:00"),
	(4, 4, 3, "2017-05-12 12:00:00");

INSERT INTO Tickets (ID, UserID, ShowID, SeatID) VALUES
	(1, 2, 1, 3),
	(2, 2, 1, 4),
	(3, 3, 2, 8),
	(4, 3, 2, 9),
	(5, 4, 4, 16),
	(6, 4, 4, 17),
	(7, 4, 4, 18),
	(8, 4, 4, 19),
	(9, 4, 4, 20);
