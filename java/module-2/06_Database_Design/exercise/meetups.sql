BEGIN TRANSACTION;

DROP TABLE IF EXISTS member, interest_group, event, group_member, event_member CASCADE;

CREATE TABLE member (
	member_number serial,
	last_name VARCHAR(15) NOT NULL,
	first_name VARCHAR(15) NOT NULL,
	email VARCHAR,
	phone_number VARCHAR,
	birthdate date NOT NULL,
	want_email boolean, 
	CONSTRAINT pk_member PRIMARY KEY (member_number)
	
);

CREATE TABLE interest_group (
	group_number int,
	group_name VARCHAR NOT NULL,
	CONSTRAINT pk_interest_group PRIMARY KEY (group_number),
	CONSTRAINT UQ_group_name UNIQUE(group_name)
);

CREATE TABLE event (
	event_number int,
	event_name VARCHAR NOT NULL,
	description VARCHAR,
	start_date_time TIMESTAMP NOT NULL,
	duration int,
	group_name VARCHAR,
	CONSTRAINT pk_event PRIMARY KEY (event_number),
	CONSTRAINT CHK_duration CHECK (duration > 30)
);

CREATE TABLE group_member (
	group_memberid serial,
	group_number int,
	member_number int,
	CONSTRAINT pk_group_member PRIMARY KEY (group_memberid)
);

CREATE TABLE event_member (
	event_memberid serial,
	event_number int,
	member_number int,
	CONSTRAINT pk_event_member PRIMARY KEY (event_memberid)
);

INSERT INTO member (last_name, first_name, email, phone_number, birthdate, want_email)
VALUES ('lee', 'thomas', 'tlee@gmail.com', '1112223333', '10/10/1994', true),
 ('linardakis', 'jeremy', 'jermeyl@gmail.com', '4442228888', '11/11/1994', false),
 ('feeny', 'chuck', 'cfeeny@gmail.com', '2224445555', '10/12/1994', true),
 ('momin', 'hassan', 'hmomin@gmail.com', '7772223333', '09/19/2001', true),
 ('jordan', 'michael', 'mj23@gmail.com', '1235559999', '07/12/1965', false),
 ('morant', 'ja', 'jmorant@gmail.com', '4448880000', '02/02/1996', false),
 ('rose', 'derrick', 'drose@gmail.com', '1115558888', '03/13/1990', true),
 ('james', 'bron', 'kingjames@akronohio.com', '2123437667', '02/19/1985', true);

INSERT INTO interest_group (group_number, group_name)
VALUES (1, 'Mathaletes'),
 (2, 'Debate'),
 (3, 'Basketball');

INSERT INTO event (event_number, event_name, description, start_date_time, duration)
VALUES (1, 'Multiplication Madness', 'who knows their multiplication tables the best', '2001-03-12 12:24:22', 45),
 (2, 'Politcal Debate', 'debate hot button political issues', '2001-03-13 11:22:34', 43),
 (3, '3v3 tournament', 'teams of 3 play to 11', '2001-04-20 10:12:24', 35),
 (4, '1v1 tournament', 'whos the king of the court?', '2001-02-25 09:43:23', 32);


---foreign keys
ALTER TABLE event ADD CONSTRAINT FK_event_interest_group FOREIGN KEY(group_name) REFERENCES interest_group(group_name);
ALTER TABLE group_member ADD CONSTRAINT FK_group_member_interest_group FOREIGN KEY(group_number) REFERENCES interest_group(group_number);
ALTER TABLE group_member ADD CONSTRAINT FK_group_member_member FOREIGN KEY(member_number) REFERENCES member(member_number);
ALTER TABLE event_member ADD CONSTRAINT FK_event_member_event FOREIGN KEY(event_number) REFERENCES event(event_number);
ALTER TABLE event_member ADD CONSTRAINT FK_event_member_member FOREIGN KEY(member_number) REFERENCES member(member_number);

COMMIT;