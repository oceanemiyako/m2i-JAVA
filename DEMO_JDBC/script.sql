-- Creation de la table student en BDD PostgresSQL

CREATE TABLE student (
id serial PRIMARY KEY,
first_name VARCHAR(255),
last_name VARCHAR(255),
date_degree DATE,
class_number INT
);