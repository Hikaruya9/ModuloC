-- DB ecommerce
CREATE DATABASE ecommerce
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE ecommerce;

-- TABLE products
CREATE TABLE products(
id int NOT NULL AUTO_INCREMENT,
product_name varchar(100),
price decimal(9,2),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE products
ADD COLUMN product_desc text AFTER product_name;

INSERT INTO products
VALUES
(DEFAULT, 'Camiseta', 'Camiseta de algodão, tamanho M', '29.90');

ALTER TABLE products
DROP COLUMN product_desc;

-- TABLE clients (users)
CREATE TABLE clients(
id int NOT NULL AUTO_INCREMENT,
client_name varchar(30),
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE clients
ADD COLUMN email varchar(100) FIRST,
ADD COLUMN phone_number tinyint(20) AFTER client_name;

ALTER TABLE users
MODIFY COLUMN phone_number decimal(15,0) UNSIGNED;

INSERT INTO clients
VALUES
('sla@gmail.com' , DEFAULT, 'Gordon', 551193315418),
('juninho_bacana552@gmail.com', DEFAULT, 'Gilson', 5521991871143);

RENAME TABLE clients TO users;



-- DB library
CREATE DATABASE livraria
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE livraria;

-- TABLE books
CREATE TABLE books(
title varchar(50),
author varchar(50),
publish_date DATE
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE books
ADD COLUMN id int NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST;

ALTER TABLE books
ADD COLUMN stock int DEFAULT 0;

INSERT INTO books
VALUES
(DEFAULT, 'Musashi', 'Eiji Yoshikawa', '1935-11-19', DEFAULT),
(DEFAULT, '1984', 'George Orwell', '1949-06-08', DEFAULT),
(DEFAULT, 'Crime and Punishment', 'Fyodor Dostoevsky', '1866-03-25', DEFAULT);

DROP TABLE IF EXISTS books;



-- DB rh
CREATE DATABASE rh
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE rh;

-- TABLE workers
CREATE TABLE workers(
worker_name varchar(30),
worker_role varchar(30),
worker_salary decimal(8,2)
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE workers
ADD COLUMN id int NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST;

INSERT INTO workers
VALUES
(DEFAULT, 'Jorge', 'Cleaner', '1424.57');

ALTER TABLE workers
RENAME COLUMN worker_salary TO worker_wage;



-- DB streaming
CREATE DATABASE streaming
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

-- TABLE series
CREATE TABLE series(
id int NOT NULL AUTO_INCREMENT,
title varchar(100) UNIQUE,
genre varchar(100),
seasons_num int(50) DEFAULT 1,
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO series
VALUES
(DEFAULT, 'The Boys', 'Action, Black comedy, Superhero', '4'),
(DEFAULT, 'Twin Peaks', 'Drama, Mystery, Horror', '3');



-- DB restaurant
CREATE DATABASE restaurant
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE restaurant;

-- TABLE restaurant
CREATE TABLE menu(
menu_name varchar(50),
menu_desc text,
menu_price decimal(7,2)
)DEFAULT CHARSET = utf8mb4;

ALTER TABLE menu
ADD COLUMN id int NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST;