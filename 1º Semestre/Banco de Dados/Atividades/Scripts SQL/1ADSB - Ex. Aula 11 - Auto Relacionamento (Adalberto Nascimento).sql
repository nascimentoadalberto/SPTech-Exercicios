create database if not exists alunosProjetos;
use alunosProjetos;

create table if not exists projetos (
idProjeto int not null primary key auto_increment,
nomeProjeto varchar(45) not null,
descricao varchar(500)
);

create table if not exists alunos (
idAluno int not null auto_increment,
nomeAluno varchar(45) not null,
telefone varchar(11),
fkRepresentante int,
fkProjetos int not null,
primary key (idAluno, fkRepresentante),
foreign key (fkRepresentante) references alunos (idAluno),
foreign key (fkProjetos) references projetos (idProjeto)
);

create table if not exists acompanhantes (
idAcompanhante int not null primary key auto_increment,
nomeAcompanhante varchar(45) not null,
relacao varchar(45) not null,
fkAlunos int,
primary key (idAcompanhante, fkAlunos),
foreign key (fkAlunos) references alunos (idAluno)
);

insert into projetos values
(null, "Hiveward", "Projeto de Apicultura"), (null, "One Piece", "Projeto de GPS"), 
(null, "Brick Breaker", "Projeto de Escavação"), (null, "Master Of Puppets", "Projeto de Música");

insert into alunos values
(null, "Adalberto Nascimento", "123456789", 1, 1), (null, "Guilherme Brandão", "987654321", 2, 2),
(null, "Guilherme Henrique", "987456321", 2, 3), (null, "Lucas Osakwe", "321654987", 1, 1),
(null, "Cindy Kanashiro", "789456123", 1, 1), (null, "Gustavo (Jesus)", "456789123", 2, 4);

insert into acompanhantes values 
(null, "Leo", "namorado", 5), (null, "Gisele", "mãe", 1), 
(null, "Marcelo", "irmão", 4), (null, "Fernando Brandão", "tio", 2);

-- selecionar tudo das tabelas, individualmente
select * from projetos;
select * from alunos;
select * from acompanhantes;

-- selecionar as informações dos alunos e projetos
select alunos.nomeAluno, projetos.nomeProjeto, projetos.descricao from alunos
inner join projetos on alunos.fkProjetos = projetos.idProjeto;

-- selecionar as informações dos alunos e acompanhantes
select alunos.nomeAluno, acompanhantes.nomeAcompanhante, acompanhantes.relacao from alunos
inner join acompanhantes on acompanhantes.fkAlunos = alunos.idAluno;

-- selecionar as informações dos alunos e representantes
select alunos.idAluno, alunos.nomeAluno, alunos.fkRepresentante from alunos
inner join projetos on alunos.fkRepresentante = alunos.idAluno
group by alunos.nomeAluno;

-- selecionar as informações dos alunos de um projeto específico
select alunos.nomeAluno, projetos.nomeProjeto, projetos.descricao from alunos
inner join projetos on alunos.fkProjetos = projetos.idProjeto
where nomeProjeto = "Hiveward";

-- selecionar as informações dos alunos, projetos e acompanhantes
select alunos.nomeAluno, projetos.nomeProjeto, projetos.descricao, acompanhantes.nomeAcompanhante, acompanhantes.relacao from alunos
inner join projetos on alunos.fkProjetos = projetos.idProjeto
inner join acompanhantes on acompanhantes.fkAlunos = alunos.idAluno;

