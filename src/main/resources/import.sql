INSERT INTO usuarios (user_name, nombre, apellido, enabled, email) VALUES ('corcoles155', 'Ana', 'Córcoles', true, 'ana.corcoles@gmail.com')
INSERT INTO usuarios (user_name, nombre, apellido, enabled, email) VALUES ('andres', 'Andres', 'Sánchez', true, 'andres.sanchez@gmail.com')

INSERT INTO roles (nombre) VALUES ('ROLE_USER')
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN')

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2)
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1)