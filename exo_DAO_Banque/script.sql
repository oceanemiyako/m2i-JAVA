 CREATE TABLE client(
   id INT PRIMARY KEY NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
	numberPhone VARCHAR(250),
	account FLOAT
 );

CREATE TYPE Statut AS ENUM ('deposit', 'whithdrawla');

CREATE TABLE compte(
	id serial PRIMARY KEY ,
    pay DECIMAL(10, 2),
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES Client(id)

);

CREATE TABLE operation(
    id serial PRIMARY KEY ,
    number INT,
    rising DECIMAL(10, 2),
    status Statut,
    compte_id INT,
    FOREIGN KEY (compte_id) REFERENCES Compte(id)

);
