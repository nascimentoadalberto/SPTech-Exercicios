create database empresas;
use empresas;

create table empresa(
idEmpresa int not null primary key,
nome varchar(50),
responsavel varchar(40)
);

alter table empresa modify column responsavel varchar(50);

insert into empresa (idEmpresa, nome, responsavel)
values (1, "Fleury", "Maria"), (2, "C6", "Pedro"), (3, "Tivit", "Camila"), (4, "Safra", "Natalia");

select * from empresa;

select nome, responsavel from empresa;

select * from empresa order by responsavel desc;

select * from empresa where nome like '%r%';

select * from empresa where nome like 'S%';

select * from empresa where nome like '%r_';

update empresa set responsavel = "Paulo" where nome = "C6";

delete from empresa where nome = "Tivit";

drop table empresa;

drop database empresas;