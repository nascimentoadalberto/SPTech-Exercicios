-- 1 - Criar um banco de dados Filme
create database Filmes;

-- 2 - Selecione o banco de dados Filme
use Filmes;

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
insert into filmes (idFilme, titulo) values (4, "Senhor dos Anéis"), (5, "Escola de Rock"), (6, "Cavaleiro das Trevas");

/* 9 - Exibir os dados da tabela Filme */
select * from filmes;
