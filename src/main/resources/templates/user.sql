USE vouvi;

CREATE TABLE users (
    id_user INT PRIMARY KEY AUTO_INCREMENT,
    email_user VARCHAR(30) NOT NULL UNIQUE,
    password_user VARCHAR(30) NOT NULL,
    cep_user int NOT NULL,
    birthdate_user DATE NOT NULL,
    gender_user ENUM('f', 'm', 'o', 'n'),
    pronoun_user VARCHAR(20) NOT NULL,
    username VARCHAR(30) NOT NULL UNIQUE,
    name_user VARCHAR(30) NOT NULL,
    lastname_user VARCHAR(20) NOT NULL
);