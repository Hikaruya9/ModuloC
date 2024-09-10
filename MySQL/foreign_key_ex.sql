CREATE DATABASE animation
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE animation;

CREATE TABLE characters(
charid int not null auto_increment,
char_name varchar(30),
age int DEFAULT 0,
animationid int,
PRIMARY KEY(charid)
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE characters
MODIFY COLUMN animationid int;

INSERT INTO characters (char_name, age, animationid) VALUES
('Guts', '24', 3),
('Kenzo Tenma', '37', 1),
('Courier', '27', 5),
('Thorfinn', '27', 2),
('Johan Liebert', '24', 1),
('Askeladd', '44', 2),
('Griffith', '24', 3),
('Gintoki Sakata', '29', 4),
('Ordinary Person', '20', 5);

INSERT INTO characters (char_name, age) VALUES
('Miyamoto Musashi', '22');

INSERT INTO characters (char_name, age, animationid) VALUES
('Dieter', '13', 1);

DELETE FROM characters
WHERE age = 13;


ALTER TABLE characters ADD FOREIGN KEY (animationid)
REFERENCES animations(animid);

SELECT c.char_name, a.animation_name FROM characters AS c
JOIN animations AS a ON a.animid = c.animationid; -- characters and animation

SELECT * FROM characters
LEFT JOIN animations ON animations.animid = characters.animationid; -- characters

SELECT c.char_name, a.animation_name FROM characters AS c
LEFT JOIN animations AS a ON a.animid = c.animationid
WHERE age > 18;

SELECT c.char_name, a.animation_name FROM characters AS c
LEFT JOIN animations AS a ON a.animid = c.animationid
ORDER BY a.animation_name;

SELECT a.animation_name, COUNT(c.animationid) AS 'Characters' FROM characters AS c
LEFT JOIN animations AS a ON a.animid = c.animationid
GROUP BY c.animationid;

SELECT a.animation_name, ROUND(AVG(c.age)) AS 'Average' FROM characters AS c
LEFT JOIN animations AS a ON a.animid = c.animationid
GROUP BY c.animationid;

SELECT a.animation_name AS 'Animation', ROUND(AVG(c.age)) AS 'Average' FROM characters AS c
LEFT JOIN animations AS a ON a.animid = c.animationid
GROUP BY c.animationid HAVING Average > 25;




CREATE TABLE animations(
animid int not null auto_increment,
animation_name varchar(100),
creator varchar(100),
release_year year,
PRIMARY KEY(animid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO animations (animation_name, creator, release_year) VALUES
('Monster', 'Naoki Urasawa', '2004'),
('Vinland Saga', 'Makoto Yukimura', '2005'),
('Berserk', 'Kentaro Miura', '1989'),
('Gintama', 'Hideaki Sorachi', '2004'),
('Akudama Drive', 'Kazutaka Kodaka', '2020');

INSERT INTO animations (animation_name, creator, release_year) VALUES
('Jujutsu Kaisen', 'Gege Akutami', '2018');

SELECT * FROM animations
LEFT JOIN characters ON animations.animid = characters.animationid; -- animations










CREATE DATABASE songs
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE songs;

CREATE TABLE artists(
artid int not null auto_increment,
artist_name varchar(100),
genre varchar(50),
PRIMARY KEY(artid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO artists (artist_name, genre) VALUES
('Breaking Benjamin', 'Hard rock'),
('Red', 'Christian metal'),
('Thousand Foot Krutch', 'Christian rock'),
('Shinedown', 'Alternative metal');

INSERT INTO artists (artist_name, genre) VALUES
('Sabaton', 'Heavy metal');

SELECT * FROM artists
LEFT JOIN albums ON artists.artid = albums.artistid; -- artists



CREATE TABLE albums(
albumid int not null auto_increment,
title varchar(100),
release_year year,
artistid int,
PRIMARY KEY(albumid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO albums (title, release_year, artistid) VALUES
('Until We Have Faces', '2011', 2),
('Phobia', '2006', 1),
('The Sound of Madness', '2008', 4),
('Oxygen: Inhale', '2014', 3),
('Dear Agony', '2009', 1),
('The End Is Where We Begin', '2012', 3),
('End of Silence', '2006', 2),
('Dark Before Dawn', '2015', 1);

INSERT INTO albums (title, release_year) VALUES
('The Death of Slim Shady', '2024');

ALTER TABLE albums ADD FOREIGN KEY (artistid)
REFERENCES artists(artid);

SELECT albums.title, artists.artist_name FROM albums
JOIN artists ON artists.artid = albums.artistid; -- album and artist

SELECT * FROM albums AS al
LEFT JOIN artists AS ar ON ar.artid = al.artistid;

SELECT al.title, art.artist_name FROM albums AS al
LEFT JOIN artists AS art ON art.artid = al.artistid
WHERE release_year > 2010;

SELECT al.title, art.artist_name FROM albums AS al
LEFT JOIN artists AS art ON art.artid = al.artistid
ORDER BY al.release_year DESC;

SELECT art.artist_name AS 'Artist', COUNT(al.artistid) AS 'Albums' FROM albums AS al
LEFT JOIN artists AS art ON art.artid = al.artistid
GROUP BY al.artistid HAVING COUNT(al.artistid) >= 3;









CREATE DATABASE books
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE books;

CREATE TABLE authors(
authid int not null auto_increment,
author_name varchar(100),
nationality varchar(30),
PRIMARY KEY(authid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO authors (author_name, nationality) VALUES
('Eiji Yoshikawa', 'Japanese'),
('Fiodor Dostoievski', 'Russian'),
('Sun Tzu', 'Chinese'),
('Plato', 'Ancient Greece'),
('George Orwell', 'Indian'),
('Greg McKeown', 'England');

INSERT INTO authors (author_name, nationality) VALUES
('Jordan Peterson', 'Canadian');

SELECT * FROM authors AS au
LEFT JOIN books AS bks ON au.authid = bks.bookid; -- authors



CREATE TABLE books(
bookid int not null auto_increment,
title varchar(100),
genre varchar(100),
authorid int,
PRIMARY KEY(bookid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO books (title, genre, authorid) VALUES
('Essentialism', 'Self-help', 6),
('Musashi', 'Historical novel', 1),
('Animal Farm', 'Political satire', 5),
('The Idiot', 'Literary fiction', 2),
('Art of War', 'Militar strategy', 3),
('Republic', 'Political philosophy', 4),
('1984', 'Dystopian', 5),
('Crime and Punishment', 'Literary fiction', 2);

INSERT INTO books (title, genre) VALUES
('12 Rules to Life: An Antidote to Chaos', 'Self-help');

ALTER TABLE books ADD FOREIGN KEY (authorid)
REFERENCES authors(authid);

SELECT books.title, authors.nationality FROM books
JOIN authors ON authors.authid = books.authorid; -- books and nationality

SELECT * FROM books AS bks
LEFT JOIN authors AS au ON au.authid = bks.authorid;

SELECT books.title FROM books
JOIN authors ON authors.authid = books.authorid
WHERE authors.nationality = 'Russian';

SELECT bks.title, au.author_name FROM books AS bks
LEFT JOIN authors AS au ON au.authid = bks.authorid
ORDER BY bks.title;

SELECT DISTINCT au.author_name AS 'Authors', COUNT(DISTINCT bks.genre) AS 'Books' FROM books AS bks
LEFT JOIN authors AS au ON au.authid = bks.authorid
GROUP BY bks.authorid HAVING Books > 1;