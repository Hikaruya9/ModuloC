CREATE DATABASE locadora
DEFAULT CHARACTER SET utf8mb4
DEFAULT COLLATE utf8mb4_general_ci;

USE locadora;

CREATE TABLE filmes(
idmovie int NOT NULL AUTO_INCREMENT,
titulo varchar(30) NOT NULL,
ano year,
PRIMARY KEY(idmovie)
)DEFAULT CHARSET = utf8mb4;
DROP TABLE filmes;

CREATE TABLE clientes(
idclient int NOT NULL AUTO_INCREMENT,
nome varchar(30) NOT NULL,
PRIMARY KEY(idclient)
) DEFAULT CHARSET = utf8mb4;
DROP TABLE clientes;

INSERT INTO filmes (titulo, ano) VALUES
('Matrix', '1999'),
('A Origem', '2010'),
('Blade Runner', '1982');

SELECT * FROM filmes;

INSERT INTO clientes (nome) VALUES
('Benjamin'),
('Guts'),
('Musashi');

SELECT * FROM clientes;

ALTER TABLE clientes ADD COLUMN favourite_movie int;

ALTER TABLE clientes ADD FOREIGN KEY (favourite_movie)
REFERENCES filmes(idmovie);

UPDATE clientes SET favourite_movie = '2'
WHERE idclient = 1;

DELETE FROM filmes
WHERE idmovie = 2; -- can't delete 'cause there's a foreign key on its ID

SELECT nome, favourite_movie FROM clientes;
SELECT titulo, ano FROM filmes;

SELECT clientes.nome, clientes.favourite_movie, filmes.titulo, filmes.ano
FROM clientes JOIN filmes ON filmes.idmovie = clientes.favourite_movie;

SELECT c.nome, f.titulo, f.ano FROM clientes AS c JOIN filmes AS f
ON f.idmovie = c.favourite_movie;

SELECT c.nome, c.favourite_movie, f.titulo, f.ano
FROM clientes AS c LEFT JOIN filmes AS f
ON f.idmovie = c.favourite_movie;


CREATE TABLE cliente_assiste_filme(
id_caf int NOT NULL AUTO_INCREMENT,
data DATE,
idcliente int,
idfilme int,
PRIMARY KEY(id_caf),
foreign key(idclient) references clientes(idclient),
foreign key(idmovie) references filmes(idmovie)
) DEFAULT CHARSET = utf8mb4;

DROP TABLE cliente_assiste_filme;

