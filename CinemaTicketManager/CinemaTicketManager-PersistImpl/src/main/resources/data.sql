INSERT INTO User (id, username, password, firstname, lastname, age, email)
	VALUES (1, 'test', 'test', 'John', 'Smith', 23, 'john.smith@gmail.com');

INSERT INTO Cinema (id, address, name) VALUES
	(1, '3525. Miskolc, Miskolc Pláza, Szentpáli út 2-4.', 'Cinema City Miskolc'),
	(2, '4026. Debrecen, Debrecen Pláza, Péterfia utca 18.', 'Cinema City Debrecen'),
	(3, '1062. Budapest, Westend City Center, Váci út 1 - 3.', 'Cinema City Debrecen');

INSERT INTO Movie (id, title, cost, genre, age_resctriction, screen_type) VALUES
	(1, 'Warcraft', 1500, 'FANTASY', 'PG', '2D'),
	(2, 'Warcraft', 2000, 'FANTASY', 'PG', '3D'),
	(3, 'Zootopia', 1000, 'ANIMATION', 'G', '2D'),
	(4, 'Démonok között 2.', 3000, 'HORROR', 'R', '2D');

INSERT INTO Screening_Room (id, cinem_Id) VALUES
	(1, 1),
	(2, 1),
	(3, 2),
	(4, 3);

INSERT INTO Seat (id, row_Number, seat_Number, is_Taken, screening_Room_Id) VALUES
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