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
(DEFAULT, 'Until We Have Faces', 'Red', 'Rob Graves', '2011-02-01', 11, 47, TRUE),
(DEFAULT, 'Phobia', 'Breaking Benjamin', 'David Bendeth', '2006-08-08', 13, 44, DEFAULT),
(DEFAULT, 'The Sicks Sense', 'End of Green', 'Corni Bartels', '2008-08-15', 12, 58, DEFAULT),
(DEFAULT, 'The End Is Where We Begin', 'Thousand Foot Krutch', 'Aaron Sprinkle, Trevor McNevan', '2012-04-17', 15, 49, TRUE),
(DEFAULT, 'End of Silence', 'Red', 'Rob Graves', '2006-06-06', 11, 47, DEFAULT),
(DEFAULT, 'Dark Before Dawn', 'Breaking Benjamin', 'Benjamin Burnley', '2015-06-23', 12, 43, DEFAULT);

TRUNCATE albums;

SELECT * FROM albums
WHERE artist = 'Breaking Benjamin';
SELECT * FROM albums
WHERE album_name IN ('The', 'We'); -- doesn't work with half string
SELECT * FROM albums
WHERE artist LIKE 'Thousand%'; -- select everything that have 'Thousand'
SELECT * FROM albums
WHERE album_name REGEXP '^T.*he.*'; -- select everything that starts with T and have he afterwards

ALTER TABLE albums
ADD UNIQUE (album_name); -- Add UNIQUE constraint to a column value be unrepeatable

ALTER TABLE albums
DROP COLUMN collab;

ALTER TABLE albums
ADD COLUMN billboard_position decimal(3,0) DEFAULT 0; -- 0 if album can't make it to billboard

ALTER TABLE albums
RENAME COLUMN producer TO main_producers; -- rename to something else

ALTER TABLE albums
MODIFY COLUMN main_artist varchar(60); -- change only primitive type

ALTER TABLE albums
CHANGE COLUMN artist main_artist varchar(55); -- Change name and primitive type in same of a column

-- SELECT
SELECT * FROM albums; -- Show all values in the table

SELECT album_name FROM albums;

SELECT album_name FROM albums
ORDER BY album_name DESC; -- order by descending

SELECT album_name, main_artist, release_date FROM albums;

SELECT * FROM albums
WHERE release_date <= '2016-11-25';

SELECT * FROM albums
WHERE track_list != 11  && main_artist != 'Eminem';

SELECT * FROM albums
WHERE album_length BETWEEN 40 AND 50;

SELECT * FROM albums
WHERE track_list BETWEEN 8 AND 11 OR album_length BETWEEN 45 AND 50;

SELECT * FROM albums
WHERE track_list IN('11','12');

SELECT * FROM albums
WHERE main_artist = 'Eminem' || main_artist = 'Red';

SELECT * FROM albums
WHERE album_length LIKE '_7' OR main_artist LIKE 'B%';

UPDATE albums
SET main_producers = 'Eminem'
WHERE album_name LIKE '%Death%'
LIMIT 1;

SELECT DISTINCT main_artist FROM albums
WHERE track_list > 10;

SELECT main_artist, COUNT(main_artist) FROM albums
GROUP BY main_artist;

SELECT MIN(album_length) FROM albums;

SELECT MAX(album_length) FROM albums;

SELECT AVG(album_length) FROM albums;

DESC albums; -- Describe table columns

DROP TABLE albums;