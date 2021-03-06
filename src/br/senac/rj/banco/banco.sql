create databse banco1;

use banco1;

create table funcionario(
	id int primary key auto_increment,
	nome varchar(150) not null,
	matricula int not null,
	salario double not null
);

create table dependente(
	id int primary key auto_increment,
	nome varchar(150) not null,
	idade int not null,
	id_funcionario int not null,
	foreign key(id_funcionario) references funcionario(id)
);
