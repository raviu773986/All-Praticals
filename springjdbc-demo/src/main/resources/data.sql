create table person
(	id int not null,
	name varchar(255) not null,
	location varchar(255) not null,
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES(101,'Akhil','UK',sysdate() );
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES(102,'popo','India',sysdate() );
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE) VALUES(103,'Akhil','CANADA',sysdate() );