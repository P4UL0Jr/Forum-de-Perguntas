create table topicos(

id bigint not null auto_increment,
titulo VARCHAR (100) NOT NULL,
tema VARCHAR (100) NOT NULL,
dataCriacao VARCHAR (100) NOT NULL,
nomeAutor VARCHAR (100) NOT NULL,
status VARCHAR (100) NOT NULL,
respostas VARCHAR (100) NOT NULL,

PRIMARY KEY (id)
);