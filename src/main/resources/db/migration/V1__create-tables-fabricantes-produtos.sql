CREATE TABLE fabricantes (
     id int NOT NULL AUTO_INCREMENT COMENT 'Primary key',
     nome varchar(255) unique,
     Primary KEY (id)
);

CREATE TABLE produtos (
id int NO NULL AUTO_INCREMENT Primary KEY,
nome VARCHAR(100),
preco FLOAT,
descricao VARCHAR(100),
fabricante_id int,
FOREIGN KEY (fabricante_id) REFERENCES fabricantes (id)
);