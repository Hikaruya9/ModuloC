CREATE DATABASE dbtest
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE dbtest;

CREATE TABLE test_table(
id int AUTO_INCREMENT NOT NULL,
nome varchar(30),
adress varchar(30),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

SELECT * FROM test_table;
DESC test_table;

ALTER TABLE test_table
ADD COLUMN birthday DATE FIRST;

ALTER TABLE test_table
ADD COLUMN birthday DATE AFTER nome;

ALTER TABLE test_table
DROP COLUMN birthday;

ALTER TABLE test_table
MODIFY COLUMN birthday DATE;

ALTER TABLE test_table
CHANGE COLUMN nome test_name varchar(40); 

ALTER TABLE tabela_teste
RENAME TO test_table;


CREATE TABLE IF NOT EXISTS courses(
name_course varchar(30) NOT NULL UNIQUE,
description_course text,
length int unsigned,
actual_year YEAR DEFAULT '2024'
)DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS courses;