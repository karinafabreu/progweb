createa database petshop;

use petshop;

create table cliente(
	id int primary key auto_increment,
	nome varchar(120) not null
);

create table especie(
	id int primary key auto_increment,
	especie varchar(120) not null
);

create table raca(
	id int primary key auto_increment,
	raca varchar(120) not null,
	id_especie int not null,
	foreign key(id_especie) references especie(id)
);

create table animal(
id int primary key auto_increment,
	nome varchar(120) not null,
	idade int not null,
	peso float not null,
	id_dono int not null,
	foreign key(id_dono) references dono(id),
	id_especie int not null,
	foreign key(id_especie) references especie(id)
);

create table endereco(
id int primary key auto_increment,
	logradouro varchar(120) not null,
	bairro varchar(120) not null,
	cidade varchar(120) not null,
	cep int not null,
	id_dono int not null,
	foreign key(id_dono) references dono(id)
);

create table telefone(
	id int primary key auto_increment,
	numero varchar(20) not null,
	id_dono int not null,
	foreign key(id_dono) references dono(id)
);