-- 1 - Criar um banco de dados Filme
create database FilmesB;

-- 2 - Selecione o banco de dados Filme
use FilmesB;

/* 3 - Criar a tabela Filme, com os campos: idFilme, titulo, genero e diretor onde idFilme é a chave primária da tabela */
create table filmes (
idFilme int not null auto_increment primary key,
titulo varchar(50),
genero varchar(30),
diretor varchar(40)
);

-- 4 - Exibir os dados da tabela Filme
select * from filmes;

/* 5 - Inserir os dados de um filme, da maneira como já vimos na aula passada e fornecer os dados de todos os campos da tabela, exatamente na ordem em que os campos foram criados */
insert into filmes (titulo, genero, diretor) values
("Vingadores: Ultimato", "Ação e Aventura", "Irmãos Russo");

/* 6 - Inserir os dados de um filme, porém apenas os dados do idFilme e do título */
insert into filmes (idFilme, titulo) values (2, "Interstellar");

/* 7 - Inserir os dados de um filme, porém apenas os dados do titulo e do idFilme */
insert into filmes (titulo, idFilme) values ("Transformers", 3);

/* 8 - Inserir os dados de vários filmes, porém apenas o idFilme e o título */
insert into filmes (idFilme, titulo) values 
(4, "Senhor dos Anéis"), (5, "Escola de Rock"), (6, "Cavaleiro das Trevas");

/* 9 - Atualizar os dados do diretor para os filmes de idFilme = 5 */
update filmes set diretor = "Richard Linklater" where idFilme = 5;

/* 10 - Atualizar os dados do diretor dos filmes de idFilme 6 e 11 */
insert into filmes (idFilme, titulo) values (11, "Liga da Justiça Zack Snyder's Cut");
update filmes set diretor = "Christopher Nolan" where idFilme = 6;
update filmes set diretor = "Zack Snyder" where idFilme = 11;

/* 11 - Atualizar os dados do gênero e diretor dos filmes de idFilme 4 e 9 */
insert into filmes (idFilme, titulo) values (9, "Transformers 2");
update filmes set genero = "Fantasia", diretor = "Peter Jackson" where idFilme = 4;
update filmes set genero = "Ação e Aventura", diretor = "Michael Bay" where idFilme = 9;

/* 12 - Atualizar os dados do gênero dos filmes de idFilme 5 e 6 */
update filmes set genero = "Comédia" where idFilme = 5;
update filmes set genero = "Ação" where idFilme = 6;

/* 13 - Exibir os dados da tabela Filme */
select * from filmes;

/* 14 - Atualizar os dados do gênero para os filmes de idFilme 2 e 11 */
update filmes set genero = "Ficção Científica" where idFilme = 2;
update filmes set genero = "Ação e Aventura" where idFilme = 11;

/* 15 - Atualizar os dados do diretor do filme de idFilme 2 */
update filmes set diretor = "Christopher Nolan" where idFilme = 2;

/* 16 - Atualizar os dados do gênero e do diretor do filme de idFilme 3 */
update filmes set genero = "Ação e Aventura", diretor = "Michael Bay" where idFilme = 3;

/* 17 - Atualizar os dados do gênero e do diretor do filme de idFilme 7 */
insert into filmes (idFilme, titulo) values (7, "Up - Altas Aventuras");
update filmes set genero = "Animação", diretor = "Pete Docter" where idFilme = 7;

/* 18 - Atualizar os dados do gênero e do diretor do filme de idFilme 8 */
insert into filmes (idFilme, titulo) values (8, "Kung Fu Panda");
update filmes set genero = "Animação", diretor = "Mark Osborne" where idFilme = 7;

/* 19 - Atualizar os dados do gênero do filme de idFilme 10 */
insert into filmes (idFilme, titulo) values (10, "Man Of Steel");
update filmes set genero = "Ação e Aventura", diretor = "Zack Snyder" where idFilme = 7;

/* 20 - Exibir os dados da tabela Filme */
select * from filmes;

/* 21- - Excluir o registro do filme de idFilme 5 */
delete from filmes where idFilme = 5;

/* 22 - Excluir os registros dos filmes de idFilme 11 e 4 */
delete from filmes where idFilme = 11;
delete from filmes where idFilme = 4;

/* 23 - Acrescentar a coluna ano na tabela Filme */
alter table filmes add column ano int;

/* 24 - Exibir os dados da tabela Filme para verificar que aumentou uma coluna */
select * from filmes;

/* 25 - Alterar o tamanho da coluna título para 60 caracteres */
alter table filmes modify column titulo varchar(60);

/* 26 - Mostrar a estrutura da tabela */
describe filmes;

/* 27 - Excluir a coluna ano da tabela Filme (a palavra column é opcional) */
alter table filmes drop column ano;

/* 28 - Exibir os dados da tabela ordenados pelo título do filme */
select * from filmes order by titulo;

/* 29 - Exibir os dados da tabela ordenados pelo diretor do filme */
select * from filmes order by diretor;

/* 30 - Exibir os dados da tabela ordenados em forma descendente pelo diretor e se for do mesmo diretor, ordena de forma descendente pelo título */
select * from filmes order by diretor desc, titulo desc;