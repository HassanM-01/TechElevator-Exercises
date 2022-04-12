BEGIN TRANSACTION;

DROP TABLE IF EXISTS artist, painting, customer, purchase, transaction, customer_transaction, customer_address, address CASCADE;

CREATE TABLE artist(
	artist_id serial,
	artist_name VARCHAR(20) NOT NULL
	CONSTRAINT PK_artist PRIMARY KEY (artist_id)
);

CREATE TABLE painting(
	painting_id serial,
	artist_id int NOT NULL,
	painting_name VARCHAR(30) NOT NULL
	CONSTRAINT PK_painting PRIMARY KEY (painting_id)
);

CREATE TABLE customer(
	
);

CREATE TABLE purchase (

);

CREATE TABLE transaction(

);

CREATE TABLE customer_transaction(

);

CREATE TABLE customer_address(

);

---- foreign key
ALTER TABLE painting ADD CONSTRAINT FK_painting_artist FOREIGN KEY (artist_id) REFERENCES artist(artist_id)


COMMIT;