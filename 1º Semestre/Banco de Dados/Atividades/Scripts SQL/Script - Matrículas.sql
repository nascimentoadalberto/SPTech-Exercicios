create database if not exists matriculas;
use matriculas;

create table if not exists responsavel (
	idResponsavel int not null,
    nomeResponsavel varchar(45),
    relacaoResponsavel varchar(45),
    primary key (idResponsavel)
);

create table if not exists aluno (
	idAluno int not null,
    nomeAluno varchar(45) not null,
    indicacao int,
    fkResponsavel int,
    primary key (idAluno),
    foreign key (fkResponsavel) references responsavel (idResponsavel),
    foreign key (indicacao) references aluno (idAluno)
);

create table if not exists curso (
	idCurso int not null,
    nomeCurso varchar(45) not null,
    primary key (idCurso)
);

create table if not exists matricula (
	idMatricula int not null,
    fkAluno int,
    fkCurso int,
    dataMatricula date,
    primary key (idMatricula, fkAluno, fkCurso),
    foreign key (fkAluno) references aluno (idAluno),
    foreign key (fkCurso) references curso (idCurso)
);

insert into responsavel values
(1, "Joaquim Soares", "Pai"), (2, "Roberta Costa", "Mãe"), (3, "Cláudio Marques", "Irmão");

insert into aluno values
(1, "Pedro Silva", 1, 1), (2, "Cindy Kanashiro", null, 2), (3, "Guilherme Brandão", 2, 3), (4, "Marcelo Costa", 2, 1);

insert into curso values
(1, "Algoritmos"), (2, "Arquitetura Computacional"), (3, "Banco de Dados"), (4, "Desenvolvimento Socioemocional"), (5, "Pesquisa e Inovação"), (6, "Tecnologia da Informação");

insert into matricula values
(1, 1, 1, '2021-06-10'), (2, 1, 2, '2021-06-10'), (3, 2, 3, '2021-06-10'), (4, 3, 4, '2021-06-10'), (5, 2, 2, '2021-06-10'), (6, 4, 6, '2021-06-10');

alter table matricula add column preco decimal(15,2);
update matricula set preco = 1000.00 where fkCurso = 2;
update matricula set preco = 1500.00 where fkCurso = 4;
update matricula set preco = 300.00 where fkCurso = 1;
update matricula set preco = 1800.00 where fkCurso = 6;
update matricula set preco = 2000.00 where fkCurso = 3;

select matricula.idMatricula, curso.nomeCurso, aluno.nomeAluno, responsavel.nomeResponsavel, responsavel.relacaoResponsavel, matricula.preco from matricula
inner join curso on matricula.fkCurso = curso.idCurso
inner join aluno on matricula.fkAluno = aluno.idAluno
inner join responsavel on aluno.fkResponsavel = responsavel.idResponsavel;

select aluno.nomeAluno, sum(matricula.preco), matricula.dataMatricula, curso.nomeCurso from aluno
inner join matricula on matricula.fkAluno = aluno.idAluno
inner join curso on matricula.fkCurso = curso.idCurso
where aluno.indicacao is null and month(dataMatricula) = 06;

