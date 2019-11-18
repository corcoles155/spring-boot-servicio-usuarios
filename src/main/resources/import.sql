INSERT INTO usuarios (user_name, nombre, apellido, enabled, email, password) VALUES ('corcoles155', 'Ana', 'Córcoles', true, 'ana.corcoles@gmail.com', '$2a$10$N2ExTJxur1So6IMg41dcguN3iGP3mrMQCorH8nYudo8MPfF5kJs4G')
INSERT INTO usuarios (user_name, nombre, apellido, enabled, email, password) VALUES ('andres133', 'Andres', 'Sánchez', true, 'andres.sanchez@gmail.com', '$2a$10$g4o6Upx4.DuwaYB/HckvSON/HYFsEk0VNLu5PNl2DR.llg2gr7Lvu')
INSERT INTO usuarios (user_name, nombre, apellido, enabled, email, password) VALUES ('pepe122', 'Pepe', 'Díaz', true, 'pepe.diaz@gmail.com', '$2a$10$XBbXIQ9j9itr8NDwFRFa8.LWL3m54zg0nnf4f94Znb2FhjGsQaRMq')
INSERT INTO usuarios (user_name, nombre, apellido, enabled, email, password) VALUES ('juan455', 'Juan', 'Ruiz', true, 'juan.ruiz@gmail.com', '$2a$10$fsPTBK3FryQqoXdpgS8Q8.M5gU/SYiKwXTszqTM5lAboYEE.kmeNy')

INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1)