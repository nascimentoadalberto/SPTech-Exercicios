create database escola;
use escola;

create table alunos (
idAluno int not null auto_increment primary key,
nomeAluno varchar(45) not null,
bairro varchar(45) not null
);

create table cursos (
idCurso int not null auto_increment primary key,
nomeCurso varchar(45) not null,
nomeCoord varchar(45) not null,
mediaGlobal smallint not null
);

create table alunos_cursos (
idAluno_Curso int not null auto_increment primary key,
fkAluno int not null,
fkCurso int not null,
inicio date not null,
nivelAluno char(1) not null,
check (nivelAluno = "B" or nivelAluno = "M" or nivelAluno = "R"),
alunos_notas int not null,
foreign key (fkAluno) references alunos (idAluno),
foreign key (fkCurso) references cursos (idCurso)
);

insert into alunos (nomeAluno, bairro) values
("Adalberto Nascimento", "Capão Redondo"),
("Guilherme Brandão", "Largo 13"),
("Braian Hudson", "São Mateus"),
("Lucas Osakwe", "Capão Redondo"),
("Alex Barreira", "São Mateus");

insert into cursos (nomeCurso, nomeCoord, mediaGlobal) values
("Tecnologia da Informação", "Thiago Bonacelli", 8),
("Pesquisa e Inovação", "Fernando Brandão", 10),
("Desenvolvimento Socioemocional", "Kaline Barreira", 10),
("Arquitetura Computacional", "Eduardo Verri", 9),
("Algoritmo", "Claudio Frizzarini", 8);

insert into alunos_cursos (fkAluno, fkCurso, inicio, nivelAluno, alunos_notas) values
(1, 1, '2021-06-10', "B", 9),
(2, 2, '2021-03-30', "M", 7),
(3, 2, '2021-08-19', "R", 8),
(1, 4, '2021-04-24', "B", 10),
(4, 3, '2021-05-23', "M", 9),
(5, 5, '2021-09-12', "R", 10);

-- selecionando os dados das tabelas
select * from alunos;
select * from cursos;
select * from alunos_cursos;

-- selecionando os dados dos alunos e cursos correspondentes
select alunos.nomeAluno, cursos.nomeCurso, alunos_cursos.nivelAluno from alunos
inner join alunos_cursos on alunos_cursos.fkAluno = alunos.idAluno
inner join cursos on alunos_cursos.fkCurso = cursos.idCurso
order by cursos.idCurso;

-- selecionando os dados dos alunos de um curso específico
select alunos.*, cursos.nomeCurso, alunos_cursos.nivelAluno from alunos
inner join alunos_cursos on alunos_cursos.fkAluno = alunos.idAluno
inner join cursos on alunos_cursos.fkCurso = cursos.idCurso
where cursos.idCurso = 2;

-- selecionando os dados de um aluno com vários cursos
select alunos.*, cursos.nomeCurso, alunos_cursos.nivelAluno from alunos
inner join alunos_cursos on alunos_cursos.fkAluno = alunos.idAluno
inner join cursos on alunos_cursos.fkCurso = cursos.idCurso
where nomeAluno = "Adalberto Nascimento";

-- exibindo a soma das médias e a média das médias
select sum(mediaGlobal) as Soma, truncate(avg(mediaGlobal), 2) as Média from cursos;

-- exibindo a maior e menor média
select max(mediaGlobal) as Maior_Média, min(mediaGlobal) as Menor_Média from cursos;

-- exibindo a maior e menor média, agrupado por curso
select alunos.nomeAluno, cursos.nomeCurso, max(cursos.mediaGlobal) as Maior_Média, min(cursos.mediaGlobal) as Menor_Média from cursos
inner join alunos_cursos on alunos_cursos.fkCurso = cursos.idCurso
inner join alunos on alunos_cursos.fkAluno = alunos.idAluno
group by cursos.nomeCurso order by cursos.mediaGlobal desc;

-- exibindo a maior e menor média, agrupado por aluno
select alunos.nomeAluno, cursos.nomeCurso, max(cursos.mediaGlobal) as Maior_Média, min(cursos.mediaGlobal) as Menor_Média from cursos
inner join alunos_cursos on alunos_cursos.fkCurso = cursos.idCurso
inner join alunos on alunos_cursos.fkAluno = alunos.idAluno
group by alunos.nomeAluno order by cursos.mediaGlobal desc;

-- exibindo apenas as médias da tabela aluno_curso
select alunos.nomeAluno, alunos_cursos.alunos_notas, alunos_cursos.nivelAluno from alunos_cursos
inner join alunos on alunos_cursos.fkAluno = alunos.idAluno
order by alunos.nomeAluno;

-- exibindo as médias distintas
select distinct alunos_notas from alunos_cursos
order by alunos_notas desc;

-- exibindo a quantidade de médias
select count(alunos_notas) from alunos_cursos;

-- exibindo a quantidade de médias distintas
select count(distinct alunos_notas) from alunos_cursos;



















-- quero meu moranguete hein, ajudei o brandãozinho, osakwe, anthony e guilherme henrique hein kkkkkkkk