CREATE TABLE IF NOT EXISTS 'employee' (
    'id' BIGINT(10) NOT NULL AUTO_INCREMENT,
    'ssn' int(11),
    'fname' varchar(25),
    'lname' varchar(25),
    'bdate' varchar(30),
    'address' varchar(50),
    'sex' varchar(5),
    'salary' int(11),
    'superssn' int(11),
    'dno' int(10),
    'pnumber' int(10),
    'hours' int(10),
    'dnumber' int(10),
    'dname' varchar(25),
    'mgrstartdate' varchar(30),
    'dlocation' varchar(50),
    'pname' varchar(20),
    'plocation' varchar(30),
    PRIMARY KEY('id')
    )
    ENGINE = InnoDB;

INSERT INTO $employee(ssn, fname, lname, bdate, address, sex, salary, superssn, dno, pnumber, hours, dnumber, dname, mgrstartdate, dlocation, pname, plocation) values (110,'Donald','Oconnell','1959.2.7','YONGIN','M',2600,146,3,3388,25,3,'IT','2005.3.2','SEOUL','Y','SEOUL');