create database if not exists campeonato;
use campeonato;

create table if not exists Clube (
idClube int not null auto_increment primary key,
nome varchar(50) not null,
fundacao date,
esporte varchar(30) not null,
tecnico varchar(40)
);

create table if not exists Jogador (
idJogador int not null primary key auto_increment,
nome varchar(50) not null,
nascimento date,
titulos varchar(100),
fkClube int not null,
foreign key (fkClube) references Clube (idClube)
);