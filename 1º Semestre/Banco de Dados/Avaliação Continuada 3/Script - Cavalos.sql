/* 	Avaliação Continuada 3 - Final
	Adalberto Nascimento
	RA: 01212091
    Quero meu moranguete hein Alex kkkkkkkkkkkkk
*/

/*-- Adalberto Nascimento
	1b. Criar um banco de dados chamado Competição.
	1c. Selecionar esse banco de dados. */
create database if not exists Competicao;
use Competicao;

/*  Adalberto Nascimento
	1d. Criar as tabelas correspondentes à sua modelagem. */
create table if not exists Dono (
	idDono int not null auto_increment,
    nomeDono varchar(45) not null,
    telDono varchar(45) not null,
    emailDono varchar(70) not null,
    fkOrientador int,
    primary key (idDono),
    foreign key (fkOrientador) references Dono (idDono)
);

create table if not exists Cavalo (
	idCavalo int not null auto_increment,
    nomeCavalo varchar(45) not null,
    racaCavalo varchar(45) not null,
    nascimento date not null,
    fkDono int,
    primary key (idCavalo),
    foreign key (fkDono) references Dono (idDono)
);

create table if not exists Campeonato (
	idCampeonato int not null auto_increment,
    nomeCampeonato varchar(45) not null,
    cidade varchar(45) not null,
    premio decimal(10,2),
    primary key (idCampeonato)
);

create table if not exists ResultadosCampeonato (
	idResultado int not null auto_increment,
    fkCavalo int,
    fkCampeonato int,
    primary key (idResultado)
);

/* 	Adalberto Nascimento
	1e) Inserir dados nas tabelas, de forma que exista mais de uma competição para algum Cavalo, e mais de um proprietário novato sendo orientado por 
    algum proprietário mais experiente. */
insert into Dono values 
(null, "Joaquim Silva", "(11)912345678", "silvajoaquim@gmail.com", 1), (null, "Pedro Soares", "(11)998765432", "pedrosoares@outlook.com", 1),
(null, "João Dias", "(11)945612378", "joaodiascavalos@gmail.com", 3), (null, "Paulo Santos", "(11)954326178", "paulo.santos@gmail.com", 3),
(null, "Victor Gomes", "(11)965432187", "gomess.victor32@gmail.com", 3), (null, "Denis Carvalho", "(11)952416378", "carvalho123denis@gmail.com", 1);

insert into Cavalo values
(null, "Pangaré", "Alpino", '1999-09-26', 1), (null, "Trovão", "Roceiro", '2002-10-08', 2), (null, "Pepe Legal", "Cavalo de Tração", '1998-04-20', 5), 
(null, "Pé de Pano", "Roceiro", '2000-07-30', 2), (null, "Banguela", "Mustang", '2002-11-07', 4), (null, "Foxy", "Alpino", '2003-03-12', 3), 
(null, "Trem Bala", "Mustang", '1999-01-16', 3);

insert into Campeonato values
(null, "Copa Relâmpago", "Santa Catarina", 300.00), (null, "Jockey Club", "São Paulo", 50000.00),
(null, "Equinox Race", "Campinas", 950.00), (null, "Ferradura Quente", "Fortaleza", 15000.00);

insert into ResultadosCampeonato values
(null, 2, 1), (null, 3, 2), (null, 1, 2), (null, 5, 4), (null, 2, 3), (null, 6, 2), (null, 3, 2), (null, 7, 1), (null, 4, 3);


/*	Adalberto Nascimento
	1f) Exibir todos os dados de cada tabela criada, separadamente. */
select * from Dono;
select * from Cavalo;
select * from Campeonato;
select * from ResultadosCampeonato;

/*	Adalberto Nascimento
	1g) Inserir FKs na criação da tabela ou realizar alter table */
    -- Todas as FKs foram inseridas no momento da criação das tabelas e inserção dos dados.

/*	Adalberto Nascimento
	2) Altere a estrutura da tabela Cavalos com um campo que identifique sua nacionalidade e atualize os cavalos inseridos com essa informação. */
alter table Cavalo add column nacionalidade varchar(45);
desc Cavalo;
update Cavalo set nacionalidade = "Brasileiro" where idCavalo = 1;
update Cavalo set nacionalidade = "Americano" where idCavalo = 2;
update Cavalo set nacionalidade = "Brasileiro" where idCavalo = 3;
update Cavalo set nacionalidade = "Brasileiro" where idCavalo = 4;
update Cavalo set nacionalidade = "Irlandês" where idCavalo = 5;
update Cavalo set nacionalidade = "Russo" where idCavalo = 6;
update Cavalo set nacionalidade = "Brasileiro" where idCavalo = 7;
select * from Cavalo;

/*	Adalberto Nascimento
	3) Exibir os dados dos cavalos e os dados de suas respectivas competições. */
select Cavalo.*, Campeonato.* from Cavalo
join ResultadosCampeonato on ResultadosCampeonato.fkCavalo = Cavalo.idCavalo
join Campeonato on ResultadosCampeonato.fkCampeonato = Campeonato.idCampeonato;

/*	Adalberto Nascimento
	4) Exibir os dados de um determinado cavalo (informar o nome do cavalo na 
    consulta) e os dados de suas respectivas competições. */
select Cavalo.*, Campeonato.* from Cavalo
join ResultadosCampeonato on ResultadosCampeonato.fkCavalo = Cavalo.idCavalo
join Campeonato on ResultadosCampeonato.fkCampeonato = Campeonato.idCampeonato
where Cavalo.nomeCavalo = "Trovão";

/*	Adalberto Nascimento
	5) Exibir os dados dos proprietários novatos e os dados dos respectivos proprietários orientadores. */
select don.idDono, don.nomeDono as 'Nome', don.telDono as 'Telefone', prop.nomeDono as 'Nome do Aprendiz' from Dono don
join Dono prop on prop.fkOrientador = don.idDono;
    
/*	Adalberto Nascimento
	6) Exibir os dados dos proprietários novatos e os dados dos respectivos proprietários orientadores, porém somente de um determinado 
    proprietário orientador (informar o nome do proprietário orientador na consulta). */
select don.idDono, don.nomeDono as 'Nome', prop.nomeDono as 'Nome do Aprendiz' from Dono don
join Dono prop on prop.fkOrientador = don.idDono
where don.nomeDono = "João Dias";

/*	Adalberto Nascimento
	7) Exibir os dados dos proprietários novatos, os dados dos respectivos proprietários orientadores, os dados dos respectivos cavalos dos 
    proprietários e das competições que cada cavalo participou. */
select don.idDono, prop.nomeDono as 'Nome do Aprendiz', don.nomeDono as 'Nome', 
	Cavalo.nomeCavalo as 'Nome do Cavalo', Campeonato.nomeCampeonato as 'Nome das Competições' from Dono don
join Dono prop on prop.fkOrientador = don.idDono
join Cavalo on Cavalo.fkDono = don.idDono
join ResultadosCampeonato on ResultadosCampeonato.fkCavalo = Cavalo.idCavalo
join Campeonato on Campeonato.idCampeonato = ResultadosCampeonato.fkCampeonato;

/*	Adalberto Nascimento
	8) Exibir apenas o nome do proprietário, o nome do cavalo e a colocação que o cavalo teve em uma determinada competição. */
alter table ResultadosCampeonato add column posicaoCavalo varchar(45);
update ResultadosCampeonato set posicaoCavalo = '2' where ResultadosCampeonato.fkCavalo = 2;

select Dono.nomeDono as 'Nome do Dono', Cavalo.nomeCavalo as 'Nome do Cavalo', ResultadosCampeonato.posicaoCavalo as 'Posição do Cavalo', 
Campeonato.nomeCampeonato as 'Nome do Campeonato' from Dono
join Cavalo on Cavalo.fkDono = Dono.idDono
join ResultadosCampeonato on ResultadosCampeonato.fkCavalo = Cavalo.idCavalo
join Campeonato on Campeonato.idCampeonato = ResultadosCampeonato.fkCampeonato
where ResultadosCampeonato.posicaoCavalo = '2';
    
/*	Adalberto Nascimento
	9) Exibir apenas o nome da competição, a raça do cavalo e a média do valor da premiação agrupado pelo nome da competição. */
select Campeonato.nomeCampeonato as 'Campeonato', Cavalo.racaCavalo as 'Raça do Cavalo', round(Campeonato.premio) as 'Média do prêmio' from Campeonato
join ResultadosCampeonato on ResultadosCampeonato.fkCampeonato = Campeonato.idCampeonato
join Cavalo on Cavalo.idCavalo = ResultadosCampeonato.fkCavalo
group by Campeonato.nomeCampeonato;

/*	Adalberto Nascimento
	10) Inserir dados de novo cavalo. Exibir os dados dos cavalos, das respectivas competições, e os cavalos que não participam de nenhuma competição. */
insert into Cavalo values (null, "Colombo", "Mustang", '1999-07-06', 3, "Britânico");
select Cavalo.nomeCavalo, Cavalo.nacionalidade, Campeonato.nomeCampeonato from Cavalo
join ResultadosCampeonato on Cavalo.idCavalo = ResultadosCampeonato.fkCavalo
join Campeonato on Campeonato.idCampeonato = ResultadosCampeonato.fkCampeonato;