drop schema if exists parqueo;
create schema parqueo;
use parqueo;

create table usuarios(
	id int primary key auto_increment,
	usuario varchar(20),
    correo varchar(25),
    pass varchar(15),
    numApartamento tinyint,
    zonaApartamento tinytext
);

create table vehiculos(
	id int primary key auto_increment,
    idDuenno int,
    tipo varchar (15),
    Marca varchar(15),
    Placa varchar(8),
    Color varchar(10),
    Modelo varchar(4)
);

create table parqueos(
	id int primary key auto_increment,
    idDuenno int,
    Zona varchar(2),
    Numero tinyint,
    tipo varchar(12),
    Precio int,
    disponible bool
);

create table parqueosCambio(
	id int primary key auto_increment,
    idDueño int,
    idParqueo int,
    estado bool
);

create table parqueosVenta(
	id int primary key auto_increment,
    idDueño int,
    idParqueo int,
    estado bool
);

create table valletPedidos(
	id int primary key auto_increment,
    idCliente int,
    idVehiculo int,
    lugarEntrega tinyint,
    tiempoEntrega tinyint
);

drop table mecanicoPedidos;
create table mecanicoPedidos(
	id int primary key auto_increment,
    idCliente int,
    idVehiculo int,
    descripcion varchar(100),
    fecha date
);

