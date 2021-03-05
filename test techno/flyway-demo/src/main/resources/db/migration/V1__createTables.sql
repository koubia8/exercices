CREATE TABLE REGISTRATION_USERS (ma
    id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(100) NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name varchar (100) DEFAULT NULL,
    email varchar (50) NOT NULL,
    PRIMARY KEY(id),
    UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
