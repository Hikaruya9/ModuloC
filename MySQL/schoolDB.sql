-- DB SCHOOL
CREATE DATABASE school
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE school;

-- TABLE STUDENTS
CREATE TABLE students(
id int NOT NULL AUTO_INCREMENT,
student_name varchar(30) NOT NULL,
birthday DATE,
class varchar(3),
email varchar(60),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO students
VALUES
(DEFAULT, 'João Silva', '2005-03-15', '8A', 'joao.silva@email.com');

SELECT * FROM students;
DESC students;

-- TABLE TEACHERS
CREATE TABLE teachers(
id int NOT NULL AUTO_INCREMENT,
teacher_name varchar(30) NOT NULL,
teacher_subject varchar(40),
salary decimal (5,2),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO teachers
VALUES
(DEFAULT, 'Paulo', 'Physics', '950.00'),
(DEFAULT, 'Magda', 'Math', '875.00');

SELECT * FROM teachers;

-- DROP
DROP DATABASE school;
DROP TABLE students;
DROP TABLE teachers;



-- DB LIBRARY
CREATE DATABASE library
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE library;

-- TABLE BOOKS
CREATE TABLE books(
id int AUTO_INCREMENT NOT NULL,
title varchar(50),
author varchar(30),
publication_date DATE,
available boolean DEFAULT TRUE,
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO books
VALUES
(DEFAULT, '1984', 'George Orwell', '1949-06-08', DEFAULT),
(DEFAULT, 'Rich Dad Poor Dad', 'Robert Kiyosaki', '1997-04-01', FALSE),
(DEFAULT, 'The Lord of the Rings', 'J. R. R. Tolkien', '1954-07-29', FALSE);

SELECT * FROM books;



-- DB ENTERPRISE
CREATE DATABASE enterprise
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE enterprise;

-- TABLE WORKERS
CREATE TABLE workers(
id int AUTO_INCREMENT NOT NULL,
worker_name varchar(30),
worker_role varchar(50),
salary decimal(8,2),
admission_date DATE,
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO workers
VALUES
(DEFAULT, 'Jorge', 'Cleaner', '4520.00', '2022-04-25');



-- DB CINEMA
CREATE DATABASE cinema
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE cinema;

-- TABLE MOVIES
CREATE TABLE movies(
id int AUTO_INCREMENT NOT NULL,
title varchar(50),
director varchar(50),
genre varchar(100),
duration tinyint(3),
rating varchar(3),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO movies
VALUES
(DEFAULT, 'Drive', 'Nicolas Winding Refn', 'Crime, Drama, Action', 100, 'R'),
(DEFAULT, 'Blade Runner', 'Ridley Scott', 'Sci-fi, Mystery & Thriller', 122, 'R');

SELECT * FROM movies;



-- DB MUSIC
CREATE DATABASE music2
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE music2;

-- TABLE ALBUMS
CREATE TABLE albums(
id int AUTO_INCREMENT NOT NULL,
album_name varchar(100),
artist varchar(50),
release_date DATE,
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO albums
VALUES
(DEFAULT,'The End is Where We Begin', 'Thousand Foot Krutch', '2012-04-17'),
(DEFAULT,'Until We Have Faces', 'Red', '2011-02-01'),
(DEFAULT,'Dark Before Dawn', 'Breaking Benjamin', '2015-06-23');

SELECT * FROM albums;

-- DROP
DROP DATABASE music;
DROP TABLE albums;