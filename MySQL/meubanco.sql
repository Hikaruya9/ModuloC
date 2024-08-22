CREATE DATABASE meubanco
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

-- CONSTRAINTS: REGRAS

USE meubanco;

CREATE TABLE persons(
id int NOT NULL AUTO_INCREMENT,
personName varchar(30) NOT NULL,
birthday DATE,
sex enum('M','W'),
weight decimal (5,2), -- |1|0|4,4|2
height decimal (3,2), -- |1,4|2
nationality varchar(20) DEFAULT 'BRAZIL',
PRIMARY KEY(id) -- UNIQUE registry
)DEFAULT CHARSET = utf8mb4;

SELECT * FROM persons;
DESC persons;

RENAME TABLE person TO persons;

DROP TABLE persons;
DROP DATABASE meubanco;

-- INSERT DATA

-- DEFAULT
INSERT INTO persons
(id, personName, birthday, sex, weight, height, nationality)
VALUES
(DEFAULT, 'Jorge', '1985-10-02', 'M', '75.2', '1.67', DEFAULT);

-- SIMPLIFIED
INSERT INTO persons VALUES
(DEFAULT, 'Guts', '2003-04-05', 'M', '130.2', '2.21', 'Midland');

-- DYNAMIC
INSERT INTO persons VALUES
(DEFAULT, 'Guts', '2003-04-05', 'M', '130.2', '2.04', 'Midland'),
(DEFAULT, 'Griffith', '1999-10-09', 'M', '66.0', '1.78', 'Midland'),
(DEFAULT, 'Caska', '2001-02-25', 'W', '85.7', '1.80', 'Midland');