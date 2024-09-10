CREATE DATABASE enterprise
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE enterprise;

CREATE TABLE department(
depid int AUTO_INCREMENT NOT NULL,
dep_name varchar(50),
n_workers int,
PRIMARY KEY(depid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO department (dep_name, n_workers) VALUES
('Marketing', 15),
('Adm', 10),
('Managers', 3),
('Director', 1);

DROP TABLE department;


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

ALTER TABLE workers
DROP COLUMN worker_role;

ALTER TABLE workers
ADD COLUMN workerid int AFTER worker_name;

ALTER TABLE workers
ADD FOREIGN KEY (workerid) REFERENCES department(depid);

INSERT INTO workers VALUES
(DEFAULT, 'Jorge', 2, '4520.00', '2022'),
(DEFAULT, 'Jane', 4, '21940.00', '2023'),
(DEFAULT, 'Benjamin', 3, '10380.00', '2021'),
(DEFAULT, 'John', 1, '12850.00', '2020'),
(DEFAULT, 'Leonard', 1, '14740.00', '2022'),
(DEFAULT, 'Alan', 3, '15590.00', '2021');

SELECT w.worker_name AS 'Name', d.dep_name AS 'Department' FROM workers AS w
JOIN department AS d ON d.depid = w.workerid;


TRUNCATE workers;







CREATE DATABASE cars
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE cars;

CREATE TABLE brands(
brdid int not null auto_increment,
brand varchar(100),
price decimal(8,2),
PRIMARY KEY(brdid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO brands (brand, price) VALUES
('Toyota', 9200.00),
('Wolksvagen', 24560.00),
('Fiat', 15380.00),
('Kwid', 18324.00);




CREATE TABLE owners(
ownerid int not null auto_increment,
owner_name varchar(100),
purchase_year year,
brandid int DEFAULT null,
PRIMARY KEY(ownerid),
FOREIGN KEY (brandid) REFERENCES brands(brdid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO owners (owner_name, purchase_year, brandid) VALUES
('Jorge', 2002, 1),
('Gerson', 2015, 4),
('Sergio', 2010, 1),
('Gustavo', 2020, 2),
('Igor', 2022, 3),
('Cleiton', 2005, DEFAULT);

SELECT o.owner_name AS 'Owners', b.brand AS 'Brand' FROM owners AS o
LEFT JOIN brands AS b ON b.brdid = o.brandid;








CREATE DATABASE mobiles
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE mobiles;

CREATE TABLE hardware(
hwid int not null auto_increment,
mob_name varchar(30),
android_version int,
ram decimal(8,2),
PRIMARY KEY(hwid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO hardware (mob_name, android_version, ram) VALUES
('Motorola G5', 12, 4),
('Samsung M24', 9, 2),
('Motorola G6 Play', 13, 6),
('Samsung M34 Plus', 14, 8);



CREATE TABLE owners(
ownerid int not null auto_increment,
owner_name varchar(100),
purchase_year year,
posts int DEFAULT 0,
hardwareid int DEFAULT null,
PRIMARY KEY(ownerid),
FOREIGN KEY (hardwareid) REFERENCES hardware(hwid)
)DEFAULT CHARSET = utf8mb4;

INSERT INTO owners (owner_name, purchase_year, posts, hardwareid) VALUES
('Jorge', 2002, 2, 2),
('Gerson', 2015, 24, 1),
('Sergio', 2010, 10, 2),
('Gustavo', 2020, 16, 1),
('Igor', 2022, 20, 4),
('Cleiton', 2005, 1, DEFAULT);

SELECT o.owner_name FROM owners AS o
JOIN hardware AS h ON h.hwid = o.hardwareid
WHERE h.android_version > 12 AND h.ram > 4;

SELECT h.mob_name AS 'Mobile', o.owner_name AS 'Owner' FROM owners AS o
LEFT JOIN hardware AS h ON h.hwid = o.hardwareid;