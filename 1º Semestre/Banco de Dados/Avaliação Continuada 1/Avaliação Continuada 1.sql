/*
Nome: Adalberto Nascimento
RA: 01212091 
*/


/* Avaliação Continuada 1 - Criar um banco de dados de séries */
-- Criando o banco
create database ac1;
use ac1;

-- Criando a tabela principal
create table Series (
idSerie int not null auto_increment primary key,
nome varchar(50),
genero varchar(40),
nroEpisodio int
);

-- Alimentando a tabela com dados
insert into Series (nome, genero, nroEpisodio)
values ("Justiceiro", "Ação", 26), ("The End Of The Fxxxing World", "Drama", 16), ("Neon Genesis Evangelion", "Anime", 26),
("Shingeki No Kyojin", "Anime", 75), ("Demolidor", "Ação", 39), ("Dark", "Ficção Cientifíca", 26), ("Black Mirror", "Ficção Científica", 22),
("Game Of Thrones", "Fantasia", 63), ("CSI", "Ação", 337), ("One Piece", "Anime", 981);

/* ----- SELECTS ----- */
-- 1) Exibir todos os dados da tabela.
select * from Series;

-- 2) Exibir apenas os nomes e os gêneros das séries.
select nome, genero from Series;

-- 3) Exibir apenas os dados das séries de um determinado gênero.
select * from Series where genero = "Anime";

-- 4) Exibir apenas os dados das séries que tem 10 ou mais episódios.
select * from Series where nroEpisodio > 10;

-- 5) Exibir os dados da tabela ordenados pelo gênero da série.
select * from Series order by genero asc;

-- 6) Exibir os dados da tabela ordenados pelo nº Episódio em ordem decrescente.
select * from Series order by nroEpisodio desc;

-- 7) Exibir os dados das séries cujo nome termine com uma determinada letra.
select * from Series where nome like '%e';

-- 8) Exibir os dados das séries cujo gênero comece com uma determinada letra.
select * from Series where nome like "D%";

-- 9) Exibir os dados das séries cujo nome tenha como segunda letra uma determinada letra.
select * from Series where nome like "_e%";

-- 10) Exibir os dados das séries cujo gênero tenha como penúltima letra uma determinada letra.
select * from Series where nome like "%o_";

-- 11) Atualize a quantidade de episódios de alguma série. Exiba novamente os dados da tabela após a atualização.
update Series set nroEpisodio = 60 where nome = "Demolidor";
select * from Series where nome = "Demolidor";

-- 12) Exclua alguma série da tabela. Exiba novamente os dados da tabela após a exclusão.
delete from Series where nome = "CSI";
select * from Series;

-- 13) Altere o tamanho do campo nome para 60.
alter table Series modify column nome varchar(60);
describe Series;

-- 14) Elimine a tabela.
drop table Series;
drop database ac1;