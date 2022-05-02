create database if not exists petshop;
use petshop;

create table if not exists clientes (
idCliente int not null primary key auto_increment,
nome varchar(50) not null,
telefone varchar(12),
celular char(9),
endereco varchar (100)
);

create table if not exists pets (
idPet int not null primary key auto_increment,
nome varchar(45) not null,
especie varchar(40),
raca varchar(30),
nascimento date,
fkCliente int,
foreign key (fkCliente) references clientes (idCliente)
) auto_increment = 101;

insert into clientes (nome, celular) values
("Adalberto Nascimento", "123456789"),
("Marcelo Santos", "456789123"),
("Carol Santos", "987654321"),
("Thiago Silva", "123789456"),
("Neymar Jr.", "789456123");

insert into pets (nome, especie, fkCliente) values 
("Bisnaguinha", "Cachorro", 1),
("Nina", "Gato", 1),
("Rex", "Cachorro", 2),
("Pipoca", "Pássaro", 3),
("Tortuguita", "Tartaruga", 4);

select * from clientes;
select * from pets;

alter table clientes modify column nome varchar(60) not null;
describe clientes;

select * from pets where especie = "cachorro";

select nome, nascimento from pets;

select * from pets order by nome asc;

select * from clientes order by endereco desc;

select * from pets where nome like "B%";

select * from clientes where nome like "%Santos";

update clientes set celular = "741852963" where nome = "Adalberto Nascimento";

select * from clientes;

select clientes.nome, pets.nome, pets.especie from clientes
inner join pets on fkCliente = idCliente;

select clientes.nome, pets.nome, pets.especie from clientes
inner join pets on fkCliente = idCliente
where clientes.nome = "Adalberto Nascimento";

delete from pets where nome = "Tortuguita";
select * from pets;

-- drop database petshop;