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
(DEFAULT, 'João Silva', '2005-03-15', '8A', 'joao.silva@email.com'),
(DEFAULT, 'Cleiton Silva', '2003-07-06', '11A', 'cleitao@email.com'),
(DEFAULT, 'Ronaldo Pinheiro', '2005-09-27', '8B', 'reinaldinho@email.com'),
(DEFAULT, 'Roberto Silveira', '2007-03-24', '6C', 'robertinho@email.com'),
(DEFAULT, 'Gustavo Chagas', '2006-05-12', '7B', 'gustavin@email.com'),
(DEFAULT, 'Jorge Humberto', '2004-08-03', '11B', null),
(DEFAULT, 'Valdir Romero', '2007-01-24', '7A', null);

DELETE FROM students
WHERE class = '8B'; -- delete values with '8B' class

TRUNCATE students; -- clean table

UPDATE students
SET birthday = '2004-07-06', class = '9B'
WHERE id = 2;

UPDATE students
SET email = 'joaosilva@novoemail.com'
WHERE id = 1; -- update email values if id = 1;

DELETE FROM students
WHERE id = 5
LIMIT 1; -- delete only one value with id = 5;

UPDATE students
SET birthday = date_sub(birthday, INTERVAL 1 YEAR); -- decreases 1 year in all students' birthday on the table

DELETE FROM students
WHERE email IS null; -- deletes students that has no email on the table

UPDATE students
SET class = '7B'
WHERE class = '7A'; -- change class from students in 7A to 7B

SELECT * FROM students
WHERE class = '8A';

SELECT * FROM students
WHERE birthday > 2000;

SELECT * FROM students
WHERE class = '9B' AND birthday > 2003;

SELECT DISTINCT class FROM students;

SELECT * FROM students;
DESC students;


-- TABLE TEACHERS
CREATE TABLE teachers(
id int NOT NULL AUTO_INCREMENT,
teacher_name varchar(30) NOT NULL,
position varchar(40),
salary decimal (6,2),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO teachers
VALUES
(DEFAULT, 'Paulo', 'Physics', '9500.00','paulo@gmail.com'),
(DEFAULT, 'Magda', 'Math', '4500.00','magda@gmail.com'),
(DEFAULT, 'Marines', 'Chemistry', '8000.00','marines@email.com'),
(DEFAULT, 'Serginho', 'Math', '6225.00','serginho@email.com');

ALTER TABLE teachers
ADD COLUMN email varchar(100);

UPDATE teachers
SET salary = salary * 1.1
WHERE id <= 2; -- increases salary by 10%

DELETE FROM teachers
WHERE id between 1 and 3; -- removes ids between 1 and 3

UPDATE teachers
SET position = 'Manager'
WHERE salary > 5000
LIMIT 2; -- promote 2 workers that has salary above 5000 to manager

TRUNCATE teachers;
SELECT * FROM teachers;

SELECT teacher_name, email FROM teachers;

SELECT * FROM teachers
WHERE salary > 3000.7;

SELECT * FROM teachers
WHERE position = 'Math' OR position = 'Physics';

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

ALTER TABLE books
MODIFY COLUMN publication_date YEAR;

ALTER TABLE books
ADD COLUMN genre varchar(40) AFTER author;

INSERT INTO books
VALUES
(DEFAULT, '1984', 'George Orwell', 'Dystopian, Political fiction', '1949', DEFAULT),
(DEFAULT, 'Rich Dad Poor Dad', 'Robert Kiyosaki', 'Personal Finance', '1997', FALSE),
(DEFAULT, 'The Lord of the Rings', 'J. R. R. Tolkien', 'High Fantasy, Adventure', '1954', FALSE),
(DEFAULT, 'Musashi', 'Eiji Yoshikawa', 'Epic, Historical novel, Martial Arts', '1935', DEFAULT),
(DEFAULT, 'Harry Potter and the Philosophers Stone', 'J.K. Rowling', 'Fantasy', '1997', DEFAULT),
(DEFAULT, 'A Game of Thrones', 'George R.R. Martin', 'Political novel, Epic Fantasy', '1996', FALSE);

SELECT * FROM books
WHERE available = TRUE;

SELECT * FROM books
WHERE publication_date BETWEEN 1990 AND 2000;

SELECT * FROM books
WHERE author IN('J.K. Rowling', 'George R.R. Martin');

SELECT * FROM books
WHERE title LIKE '%love%';

SELECT DISTINCT * FROM books;

TRUNCATE books;
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

ALTER TABLE workers
MODIFY COLUMN admission_date YEAR;

INSERT INTO workers
VALUES
(DEFAULT, 'Jorge', 'Cleaner', '4520.00', '2022'),
(DEFAULT, 'Jane', 'Manager', '21940.00', '2023'),
(DEFAULT, 'Benjamin', 'Marketing', '10380.00', '2021'),
(DEFAULT, 'John', 'Seller', '12850.00', '2020'),
(DEFAULT, 'Leonard', 'Analyst', '14740.00', '2022'),
(DEFAULT, 'Alan', 'Supervisor', '15590.00', '2021');

SELECT * FROM workers;

SELECT worker_name, salary FROM workers
ORDER BY salary DESC;

SELECT * FROM workers
WHERE admission_date < 2022;

SELECT * FROM workers
WHERE worker_role IN('Manager', 'Analyst');

SELECT * FROM workers
WHERE worker_name LIKE 'A%';

SELECT * FROM workers
WHERE worker_role LIKE '%s';

TRUNCATE workers;




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
duration int(3),
rating varchar(3),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO movies
VALUES
(DEFAULT, 'Drive', 'Nicolas Winding Refn', 'Crime, Drama', 100, 'R'),
(DEFAULT, 'Blade Runner', 'Ridley Scott', 'Sci-fi, Mystery, Thriller', 122, 'R'),
(DEFAULT, 'The Godfather', 'Francis Ford Coppola', 'Crime, Drama', 177, 'R'),
(DEFAULT, 'Taxi Driver', 'Martin Scorsese', 'Drama', 113, 'R'),
(DEFAULT, 'Blade Runner 2049', 'Denis Villeneuve', 'Sci-Fi, Mystery, Thriller', 164, 'R');

SELECT COUNT(title) FROM movies;

SELECT AVG(duration) FROM movies;

SELECT * FROM movies;
TRUNCATE movies;

DROP TABLE movies;


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

SELECT MIN(release_date) FROM albums;

SELECT * FROM albums;

-- DROP
DROP DATABASE music;
DROP TABLE albums;