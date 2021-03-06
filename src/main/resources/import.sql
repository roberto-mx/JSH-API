/*
CREATE TABLE ACCOUNT_GRANTED_AUTHORITY (ID INTEGER PRIMARY KEY, AUTHORITY VARCHAR(100) NOT NULL );
CREATE TABLE ACCOUNT (ID INTEGER, NICKNAME VARCHAR(100) NOT NULL , ENABLED TINYINT, EMAIL VARCHAR(100) NOT NULL , PASSWORD VARCHAR(100) NOT NULL );
CREATE TABLE ACCOUNT_GRANTED_AUTHORITIES (ACCOUNT INTEGER NOT NULL , AUTHORITY INTEGER NOT NULL );
*/


INSERT INTO ACCOUNT_GRANTED_AUTHORITY (ID, AUTHORITY) VALUES(1, 'ADMIN');

INSERT INTO ACCOUNT (ID, NICKNAME, ENABLED, EMAIL, PASSWORD) VALUES(1, 'jshuser', true, 'user@jsh.gob.mx', 'testpasswd');

INSERT INTO ACCOUNT_GRANTED_AUTHORITIES (ACCOUNT, AUTHORITY) VALUES(1,1);

insert into ClasificacionProducto (nombre, valorNutrimental) values ('Carbohidratos', 15);
insert into ClasificacionProducto (nombre, valorNutrimental) values ('Lípidos', 14);
insert into ClasificacionProducto (nombre, valorNutrimental) values ('Proteínas', 23);
insert into ClasificacionProducto (nombre, valorNutrimental) values ('Vitaminas', 133);
insert into ClasificacionProducto (nombre, valorNutrimental) values ('Minerales', 244);
insert into ClasificacionProducto (nombre, valorNutrimental) values ('Agua', 0);

insert into Producto values (1, 'Agua embotellada', '0', 6);
insert into Producto values (2, 'Donas', '1', 1);

insert into Embalaje values (1, 'Bandeja');
insert into Embalaje values (2, 'Caja dispensadore de líquidos');
insert into Embalaje values (3, 'Caja envolvente o Wrap around');
insert into Embalaje values (4, 'Caja expositora');
insert into Embalaje values (5, 'Caja de fondo automático');
insert into Embalaje values (6, 'Caja de fondo semiautomático');
insert into Embalaje values (7, 'Caja de madera');
insert into Embalaje values (8, 'Caja de plástico');
insert into Embalaje values (9, 'Caja con rejilla incorporada');
insert into Embalaje values (10, 'Caja con tapa');
insert into Embalaje values (11, 'Caja de tapa y fondo');
insert into Embalaje values (12, 'Caja de solapas');
insert into Embalaje values (13, 'Cartón ondulado');
insert into Embalaje values (14, 'Cesta');
insert into Embalaje values (15, 'Estuche');
insert into Embalaje values (16, 'Film plástico');
insert into Embalaje values (17, 'Plástico de burbujas');
insert into Embalaje values (18, 'Plató agrícola');
insert into Embalaje values (19, 'Saco de papel');

insert into TransportesCajas values (1, 'Caja de solapas');
insert into TransportesCajas values (2, 'Caja troquelada automontable');
insert into TransportesCajas values (3, 'Troquel');

insert into TransportesUnidades values (1, 'Tráiler');
insert into TransportesUnidades values (2, 'Van');

insert into Donador (razonsocial, recibofiscal, rfc, folioacuseconvenio, vigenciaconvenio, comentarios, calificacion, fecharegistro, habilitado ) values ('NUEVA WAL MART DE MEXICO S DE RL DE C V.', 0, 'NWM-970924-4W4', 'FolioAcuse', current_date, 'SIN COMENTARIOS', '6', current_date, 1);

insert into Donativo (remisionba, fecharegistro, fechaacopio, requerimientosdonador, condicionestransporte, coordinaciontransporte, costooperativo, distribucionregional, especificaciones, donador, transportescajas, transportesunidades) values ('RemisionBA', current_date, current_date, 'RequerimientosDonador', 'CondicionesTransporte', 'CoordinacionTransporte', 1024, 'DR', 'Especificaciones', 1, 1, 1);

insert into DetalleDonativo (cantidadkg, cantidadpza, fechaconsumolimite, cosecha, pagocosecha, cantidadembalaje, status, fechasolicitud, fechaconfirmacion, fecharecepcion, cantidadrecibida, cantidadrecibidabuenestado, costooperativoacopio, comentarios, calificacion, donativo, producto, embalaje) values (14, 32, now(), 1, 700, 14, 1, '2018-03-20 00:00:00', '2018-03-22 00:00:00', '2018-03-22 00:00:00', '14 cajas', '2 cajas', 'costo op', 'comentarios', '4', 1, 1, 1);

insert into EntradaAlmacen ( foliointerno, cantidadoriginal, cantidadactual, seccionalmacenamiento, fechaentrada, status, detalleDonativo) values ( 1, 5, 4, 'SeccionAlmacenamiento', '2018-03-22 00:00:00', 1, 1);

insert into Direccion (calle, numero, cp, ciudad, estado, latitud, longitud) values ('calle', 'num', '45020', 'ciudad', 'Jalisco', '12.123434', '41.081347');

insert into TipoContacto (nombre) values ('tipo contacto');

insert into Contacto (valor, tipoContacto, nombre, apellido, telefono, extension, celular, email, password, grupo, ultimoLogin,fechaRegistro,habilitado,datosExtra) values ('valor', 1, 'nombre', 'apellido', '5555800301', 227, '5585616164', 'plebe@gmail.com', 'pwd', 401, current_date, current_date, 1, '{"id": 1,"name": "A green onion"');

insert into Region (nombre, habilitado) values ('Región', 1);

insert into BancoAlimentos (administrativo, nombre, RazonSocial, Calificacion, fechaAfiliacion, fechaRegistro, habilitado, region, direccion, contacto) values (1,'TEST BANCO ALIMENTOS','RAZON SOCIAL TEST BA','CAL','2018-03-17','2018-03-17',1,1,1,1)

insert into CentroComunitario (nombre, fechaRegistro, indicemarginacion, habilitado, direccion, idBancoAlimentosPerteneciente) values ('Centro comunitario', '2018-03-20 00:00:00', 37.2, 1, 1, 1);


insert into curso ( nombre, Descripcion, IDBancoAlimentos, IDDonador) values ( 'Curso de pintura', 'Curso de pintura dirigido a personas de 0 a 100 a;os', 1, 1)