CREATE DATABASE megabazar
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE megabazar;

CREATE TABLE antique_store(
id int NOT NULL AUTO_INCREMENT,
category varchar(30),
antique_type varchar(30),
quantity int,
antique_year year,
PRIMARY KEY(id)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO antique_store
VALUES
(DEFAULT,'Muzic','Vinyl Reord','40','1960'),
(DEFAULT,'Mirror','Glass','20','1980'),
(DEFAULT,'Video games','Tape','10','1950'),
(DEFAULT,'Ta-cup','Clay','40','1940'),
(DEFAULT,'Drinky','Vodka','10','1930');

UPDATE antique_store
SET category = 'Drink'
WHERE id = '5'; -- Change values on a row in a table

UPDATE antique_store
SET category = 'Mirror', quantity = '30'
WHERE id = '2'
LIMIT 1; -- limits how many values you're changing

DELETE FROM antique_store
WHERE antique_year > 1930
LIMIT 2;

TRUNCATE antique_store;

SELECT * FROM antique_store;