/*
	AUTOR: Daniel Beltran
	OBJETIVO: CREACION Y POBLADO DE TABLAS
	ASUNTO: IBM-TEST-GenserDanielBeltranGarcia
	FECHA: 19/01/2023
*/

# Creación del Esquema

CREATE SCHEMA ibm;

COMMIT;

# Creación Tabla Proveedores 

CREATE TABLE ibm.proveedores (
	id_proveedor INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(45) DEFAULT NULL,
	fecha_alta DATE DEFAULT NULL,
	id_cliente INT DEFAULT NULL,
	PRIMARY KEY(id_proveedor)
	);

COMMIT;
	
# Poblado Tabla Proveedores 

INSERT INTO ibm.proveedores (nombre, fecha_alta, id_cliente)VALUES ('Coca-cola','2020-01-10',5);
INSERT INTO ibm.proveedores (nombre, fecha_alta, id_cliente)VALUES ('Pepsi','2021-02-20',5);
INSERT INTO ibm.proveedores (nombre, fecha_alta, id_cliente)VALUES ('Redbull','2022/03/30',6);

COMMIT;
