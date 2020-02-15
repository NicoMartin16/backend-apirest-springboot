INSERT INTO regiones (id, nombre) values (1,'Sudameríca');
INSERT INTO regiones (id, nombre) values (2,'Centroameríca');
INSERT INTO regiones (id, nombre) values (3,'Norteameríca');
INSERT INTO regiones (id, nombre) values (4,'Europa');
INSERT INTO regiones (id, nombre) values (5,'Asia');
INSERT INTO regiones (id, nombre) values (6,'Africa');
INSERT INTO regiones (id, nombre) values (7,'Oceania');
INSERT INTO regiones (id, nombre) values (8,'Antartida');

INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (1,'Andrés','Guzmán','andres@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (2,'Nicolas','Martin','nicolas@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (3,'Daniel','Martin','daniel@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (3,'Haydee','Niño','haydee@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (3,'Victor','Calderon','victor@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (4,'Ivan','Navarrete','ivan@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (4,'Aquim','Aguilar','aquim@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (4,'Debby','Araujo','debb@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (5,'Ricardo','Capera','ricardo@hotmail.com','2020-01-03');
INSERT INTO clientes (region_id,nombre, apellido, email, create_at) values (6,'Jesús','Pichardo','jesus@hotmail.com','2020-01-03');

/* Creamos algunos usuarios con sus roles */
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('Andres', '$2a$10$rKZ/noc26iC7hyxXj7q0WeeMCZMzAMlO1VwYcdMfgMvws0q14WqHS' , 1, 'Andres', 'Guzman', 'profesor@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$ePGuu8e4.OF7vgSDWS/XeukLzcVzs2oa/N5SWFrOK3Ub.HuRTwez.' , 1, 'John', 'Doe', 'john@gmail.com');

INSERT INTO roles (username) VALUES ('ROLE_USER');
INSERT INTO roles (username) VALUES ('ROLE_ADMIN');

INSERT INTO users_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (usuario_id, role_id) VALUES (2, 1);
