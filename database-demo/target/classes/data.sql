
create table person
(
	id int not null,
	name varchar(255) not null,
	location varchar(255) not null,
	birth_date timestamp,
	primary key(id)
);


INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) VALUES(1002, 'Ranga', 'hyderabad', sysdate());
INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) VALUES(1003, 'Peter', 'NY', sysdate());
INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) VALUES(1004, 'james', 'Russis', sysdate());