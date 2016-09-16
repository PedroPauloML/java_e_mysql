create database tutorial;

use tutorial;

create table cliente (
	id int primary key auto_increment,
	nome varchar(30) not null,
	cpf varchar(15) not null,
	endereco varchar(50) not null
);