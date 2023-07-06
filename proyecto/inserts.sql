use parqueo;

insert into usuarios(usuario,correo,pass,numApartamento,zonaApartamento) values
("Admin","admin@estudiantec.cr","admin",1,"A");
insert into usuarios(usuario,correo,pass,numApartamento,zonaApartamento) values
("Dagger","dagger@estudiantec.cr","123",42,"B");
insert into usuarios(usuario,correo,pass,numApartamento,zonaApartamento) values
("Maria","maria@estudiantec.cr","123",65,"C");

insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (1,"A",22,"Simple",300,false);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (1,"B",43,"Techado",400,false);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (2,"C",4,"Doble",600,false);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (2,"A",73,"Amplio",500,false);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (3,"B",23,"Discapacidad",50,false);

insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (0,"A",54,"Temporal",200,true);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (0,"A",32,"Temporal",200,true);
insert into parqueos(idDuenno,Zona,Numero,Tipo,Precio,disponible) values (0,"C",100,"Doble",600,true);

insert into vehiculos(idDuenno,Tipo,Marca,Placa,Color,Modelo) values(1,"Sedán","BMW","AFD-895","Negro","2012");
insert into vehiculos(idDuenno,Tipo,Marca,Placa,Color,Modelo) values(1,"Pick-Up","RAM","234224","Rojo","2011");


select * from usuarios;
select * from vehiculos;
select * from parqueos;
select * from valletPedidos;
select * from mecanicoPedidos;
