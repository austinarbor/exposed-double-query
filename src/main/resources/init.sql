CREATE DATABASE exposed_dev;

CREATE TABLE parents(
    id BIGSERIAL PRIMARY KEY,
    name varchar(255) NOT NULL
);

CREATE TABLE childs (
    id BIGSERIAL PRIMARY KEY ,
    name varchar(255) NOT NULL,
    parent_id BIGINT NOT NULL references parents(id)
);

INSERT INTO parents(name) VALUES('a');
INSERT INTO childs(name, parent_id) values('b', 1);
