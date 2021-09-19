create database playlist;
use playlist;

create table banda (
idBanda int not null primary key auto_increment,
nome varchar(50) not null
);

create table musica (
idMusica int not null primary key auto_increment,
nome varchar(50) not null,
album varchar(50) not null,
fkBanda int,
foreign key (fkBanda) references banda (idBanda)
);

create table autor (
idAutor int not null primary key auto_increment,
nome varchar(60) not null,
fkBanda int,
foreign key (fkBanda) references banda (idBanda)
);

create table genero (
idGenero int not null primary key auto_increment,
genero varchar(40) not null,
fkBanda int,
foreign key (fkBanda) references banda (idBanda)
);

insert into banda (nome) values ("Metallica"), ("Dream Theater"), ("Pink Floyd");

insert into autor (nome, fkBanda) values ("James Hetfield", 1), ("John Petrucci, Mike Portnoy", 2);

insert into genero (genero, fkBanda) values ("Thrash Metal", 1), ("Progressive Metal", 2), ("Heavy Metal", 1);

insert into musica (nome, album, fkBanda) values 
("Master Of Puppets", "Master Of Puppets", 1),
("Orion", "Master Of Puppets", 1),
("Disposable Heroes", "Master Of Puppets", 1),
("Damage Inc", "Master Of Puppets", 1),
("The Thing That Should Not Be", "Master Of Puppets", 1),
("Suicide And Redemption", "Death Magnetic", 1),
("The Dance Of Eternity", "Scenes From A Memory", 2),
("Home", "Scenes From A Memory", 2),
("Finally Free", "Scenes From A Memory", 2),
("Overture 1928", "Scenes From A Memory", 2);

select * from banda;
select * from musica;

select musica.nome, musica.album, banda.nome, autor.nome, genero.genero from musica 
inner join banda on musica.fkBanda = banda.idBanda
inner join autor on autor.fkBanda = banda.idBanda
inner join genero on genero.fkBanda = banda.idBanda;musica