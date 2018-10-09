-- Cleanup DB

DROP TABLE IF EXISTS schema_name.useractions;
DROP TABLE IF EXISTS schema_name.fixedpriceprojects;
DROP TABLE IF EXISTS schema_name.surchargecustomers;
DROP TABLE IF EXISTS schema_name.surchargecustomersrates;
DROP TABLE IF EXISTS schema_name.payernodes;
DROP TABLE IF EXISTS schema_name.customerbase;

DROP SEQUENCE IF EXISTS schema_name.hibernate_sequence;
DROP SCHEMA schema_name;

-- Create DB

CREATE SCHEMA schema_name;

  CREATE SEQUENCE schema_name.hibernate_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;  
  
 CREATE TABLE schema_name.useractions(
	id BIGINT PRIMARY KEY,
	timestamp TIMESTAMP with time zone NOT NULL,
	userid VARCHAR(20) NOT NULL,
	action VARCHAR(30) NOT NULL
);

CREATE TABLE schema_name.fixedpriceprojects(
	id BIGINT PRIMARY KEY,
	projectnumberplanmill VARCHAR(20) NOT NULL,
	projectidtagetik VARCHAR(20) NOT NULL,
	projectdescription VARCHAR(200) NOT NULL,
	customernumber VARCHAR(10) NOT NULL,
	price DOUBLE PRECISION NOT NULL
);

CREATE TABLE schema_name.surchargecustomers(
	id BIGINT PRIMARY KEY,
	debitornumber VARCHAR(10) NOT NULL,
	debitorname VARCHAR(100) NOT NULL,
	type VARCHAR(20) NOT NULL,
	customernumber VARCHAR(10) NOT NULL,
	customername VARCHAR(100) NOT NULL
);

CREATE TABLE schema_name.surchargecustomersrates(
	id BIGINT PRIMARY KEY,
	customernumber VARCHAR(10)NOT NULL,
	year SMALLINT NOT NULL,
	dailyrate DOUBLE PRECISION NOT NULL
);

CREATE TABLE schema_name.payernodes(
	id BIGINT PRIMARY KEY,
	customernumber VARCHAR(10) NOT NULL,
	customername VARCHAR(100) NOT NULL,
	hierarchy VARCHAR(5) NOT NULL,
	payernodenumber SMALLINT NOT NULL,
	payernodedescription VARCHAR(50) NOT NULL,
	payernodecode VARCHAR(30) NOT NULL
);

CREATE TABLE schema_name.customerbase(
	id BIGINT PRIMARY KEY,
	blz SMALLINT NOT NULL,
	block VARCHAR(20) NOT NULL,
	node VARCHAR(30) NOT NULL,
	customername VARCHAR(100) NOT NULL,
	bankgroup VARCHAR(50) NOT NULL,
	cluster VARCHAR(20) NOT NULL
);
