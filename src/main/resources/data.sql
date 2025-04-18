INSERT INTO rol (nombre) VALUES ('ADMIN'),('EMPLEADO'),('CLIENTE');

INSERT INTO usuario (nombre, correo, contrasena, telefono, direccion, rol_nombre) VALUES
('Juan Cliente', 'cliente@mail.com', '$2a$12$YEH5B4glaY3XP52jR/nYVeoB.6Le8BQGeGH5izrF9roLqgWFJLG56', '3217817105', 'Calle 107 #12-89','CLIENTE'),
('Pedro Admin', 'admin@mail.com', '$2a$12$YEH5B4glaY3XP52jR/nYVeoB.6Le8BQGeGH5izrF9roLqgWFJLG56', '3123647894', 'Manzana B#34', 'ADMIN'),
('Laura Empleada', 'empleado@mail.com', '$2a$12$YEH5B4glaY3XP52jR/nYVeoB.6Le8BQGeGH5izrF9roLqgWFJLG56', '3205305210', 'Calle 100 #15-67','EMPLEADO');