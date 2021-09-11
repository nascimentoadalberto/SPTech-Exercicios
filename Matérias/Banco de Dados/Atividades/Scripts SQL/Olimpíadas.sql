create database exercicio_d;
use exercicio_d;

create table País (
	idPais int not null auto_increment primary key,
    nomePais varchar(30) not null,
    continente varchar(10) not null,
    populacao int,
    atletas int
);

create table Modalidade (
	idModal int not null auto_increment primary key,
    fkPais int,
    modalidade varchar(30),
    foreign key (fkPais) references País (idPais)
);

create table Atleta (
	idAtleta int not null auto_increment primary key,
    fkPais int,
    fkModal int,
    nome varchar(80),
    medalhas int,
    idade int,
    altura decimal(10,2),
    foreign key (fkPais) references País (idPais),
    foreign key (fkModal) references Modalidade (idModal)
);

insert into País (nomePais, continente) values ("Brasil", "América"), ("Estados Unidos","América"), ("China", "Ásia"), ("Austrália", "Oceania"), ("Japão", "Ásia"), ("África do Sul", "África");
insert into Atleta (fkPais, nome, medalhas) values (2, "Michael Phelps", 28), (1, "Rebeca Andrade", 3), (5, "Akinori Nakayama", 10);
insert into Modalidade (fkPais, modalidade) values (2, "Natação"), (1, "Ginástica"), (3, "Boxe");

select País.nomePais, País.continente, Atleta.nome from País right join Atleta on Atleta.fkPais = País.idPais;
select País.nomePais, Atleta.nome, Atleta.medalhas from País inner join Atleta on Atleta.fkPais = País.idPais;


/*
ESQUELETO DA REGRA DE NEGÓCIO

-> Nem todo País tem um Atleta, mas todo Atleta pertence a um País.
-> Nem todo Atleta possui medalhas.
-> Nem toda Modalidade possui um Atleta.
-> Nem toda a população de um País será composta por Atletas.
-> Todo Atleta, País e Modalidade possuem um nome.
*/

