-- DB MUSIC
CREATE DATABASE music
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE music;

-- TABLE ALBUMS
CREATE TABLE albums(
id int AUTO_INCREMENT NOT NULL,
album_name varchar(100),
artist varchar(50), -- or band
producer varchar(100), -- or producers
release_date DATE, -- yyyy-mm-dd
track_list tinyint(3), -- how many tracks are in the album
album_length tinyint(3), -- in minutes (round ceiling)
collab boolean DEFAULT FALSE, -- TRUE if it has at least one collab track
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;


INSERT INTO albums
VALUES
(DEFAULT, 'The Death of Slim Shady', 'Eminem', 'Eminem, Luis Resto, Dr.Dre', '2024-07-12', 19, 65, TRUE),
(DEFAULT, 'We Are Not Alone', 'Breaking Benjamin', 'David Bendeth', '2004-06-29', 11, 40, DEFAULT),
(DEFAULT, 'Welcome to the Masquerade', 'Thousand Foot Krutch', 'Aaron Sprinkle, Trevor McNevan', '2009-09-08', 13, 47, DEFAULT),
(DEFAULT, 'Until We Have Faces', 'Red', 'Rob Graves', '2011-02-01', 11, 47, DEFAULT),
(DEFAULT, 'Phobia', 'Breaking Benjamin', 'David Bendeth', '2006-08-08', 13, 44, DEFAULT),
(DEFAULT, 'The Sicks Sense', 'End of Green', 'Corni Bartels', '2008-08-15', 12, 58, DEFAULT),
(DEFAULT, 'The End Is Where We Begin', 'Thousand Foot Krutch', 'Aaron Sprinkle, Trevor McNevan', '2012-04-17', 15, 49, DEFAULT),
(DEFAULT, 'Dark Before Dawn', 'Breaking Benjamin', 'Benjamin Burnley', '2015-06-23', 12, 43, DEFAULT),
(DEFAULT, 'Oxygen: Inhale', 'Thousand Foot Krutch', 'Aaron Sprinkle, Trevor McNevan', '2014-08-26', 10, 38, DEFAULT);


SELECT * FROM albums WHERE artist = 'Breaking Benjamin';
SELECT * FROM albums WHERE album_name IN ('The', 'We'); -- doesn't work with half string
SELECT * FROM albums WHERE artist LIKE 'Thousand%'; -- select everything that have 'Thousand'
SELECT * FROM albums WHERE album_name REGEXP '^T.*he.*'; -- select everything that starts with T and have he afterwards

ALTER TABLE albums
ADD UNIQUE (album_name);

ALTER TABLE albums
ADD COLUMN billboard_position decimal(4,0);