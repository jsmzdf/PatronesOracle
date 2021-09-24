begin
	EXECUTE IMMEDIATE 'DROP TABLE   CLIENTE CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/
begin
	EXECUTE IMMEDIATE 'DROP TABLE   PRODUCTO CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/
begin
	EXECUTE IMMEDIATE 'DROP TABLE   SERVICIO CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/
begin
	EXECUTE IMMEDIATE 'DROP TABLE   COMPRA CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/
begin
	EXECUTE IMMEDIATE 'DROP TABLE   COMPRAPRODUCTO CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/
begin
	EXECUTE IMMEDIATE 'DROP TABLE   COMPRASERVICIO CASCADE CONSTRAINTS';
	EXCEPTION WHEN OTHERS THEN NULL;
end;
/



create table PRODUCTO(
	K_ID_P NUMBER(10) NOT NULL,
	N_NOMBRE_P VARCHAR(20) NOT NULL,
	Q_PRECIO_P NUMBER(11,2) NOT NULL,
	N_DESCRIPCION_P VARCHAR(300) NOT NULL, 
	N_CATEGORIA_P VARCHAR(20) NOT NULL
);

ALTER TABLE  PRODUCTO 
 ADD CONSTRAINT PK_PRODUCTO
	PRIMARY KEY (K_ID_P) 
 USING INDEX
;

create table SERVICIO(
	K_ID_S NUMBER(10) NOT NULL,
	N_NOMBRE_S VARCHAR(20) NOT NULL,
	Q_PRECIO_S NUMBER(11,2) NOT NULL,
	N_DESCRIPCION_S VARCHAR(300) NOT NULL, 
	N_CATEGORIA_S VARCHAR(20) NOT NULL
);

ALTER TABLE  SERVICIO 
 ADD CONSTRAINT PK_SERVICIO
	PRIMARY KEY (K_ID_S) 
 USING INDEX
;

create table CLIENTE(
	K_ID_C NUMBER(10) NOT NULL,
	N_NOMBRE_C VARCHAR(20) NOT NULL,
	Q_CEDULA_C NUMBER(10) NOT NULL,
	N_CATEGORIA_C VARCHAR(20) NOT NULL
);


ALTER TABLE  CLIENTE 
 ADD CONSTRAINT PK_CLIENTE
	PRIMARY KEY (K_ID_C) 
 USING INDEX
;

create table COMPRA(
	K_ID_COM  NUMBER(10) NOT NULL,
	K_ID_CLIENTE_COM NUMBER(10) NOT NULL,
	N_FECHA_COM DATE NOT NULL,
	Q_TOTAL_COM NUMBER(10) NOT NULL,
	N_CATEGORIA_COM VARCHAR(20) NOT NULL
);

ALTER TABLE  COMPRA 
 ADD CONSTRAINT PK_COMPRA
	PRIMARY KEY (K_ID_COM) 
 USING INDEX
;


create table COMPRAPRODUCTO(
	K_ID_PRODUCTO_CP NUMBER(10) NOT NULL,
	K_ID_COMPRA_CP NUMBER(10) NOT NULL,
	Q_TOTAL_CP NUMBER(10) NOT NULL
);

create table COMPRASERVICIO(
	K_ID_SERVICIO_CS NUMBER(10) NOT NULL,
	K_ID_COMPRA_CS NUMBER(10) NOT NULL
);

alter table COMPRASERVICIO add foreign key (K_ID_SERVICIO_CS) references SERVICIO(K_ID_S);
alter table COMPRASERVICIO add foreign key (K_ID_COMPRA_CS) references COMPRA(K_ID_COM);

alter table COMPRAPRODUCTO add foreign key (K_ID_PRODUCTO_CP) references SERVICIO(K_ID_S);
alter table COMPRAPRODUCTO add foreign key (K_ID_COMPRA_CP) references COMPRA(K_ID_COM);

alter table COMPRA add foreign key (K_ID_CLIENTE_COM) references CLIENTE(K_ID_C);

