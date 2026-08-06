INSERT INTO roles (id, name) VALUES
  (1, 'ROLE_ADMIN'),
  (2, 'ROLE_LIBRARIAN'),
  (3, 'ROLE_READER');

INSERT INTO users (id, full_name, email, password_hash, age, active, deleted) VALUES
  (1, 'Pablo Administrador', 'admin@ups.edu.ec', '$2y$10$4SkFzZFGgS.OwMDmxoKw6eQ6xtWxMs/ASlgzb18QrJlS4V.SoWpqW', 40, TRUE, FALSE),
  (2, 'Laura Bibliotecaria', 'librarian@ups.edu.ec', '$2y$10$I6TSn6/4CJGYegsFQ7fncuJdj0YeS4.Cq162N2EhKicbZw97he6Zi', 34, TRUE, FALSE),
  (3, 'Ana Lectora', 'reader@est.ups.edu.ec', '$2y$10$lYyqARDipgEtelJyCONr6e7D07k50IxGSJEro.v1bwG61BXnladcK', 22, TRUE, FALSE),
  (4, 'Luis Menor', 'minor@est.ups.edu.ec', '$2y$10$lYyqARDipgEtelJyCONr6e7D07k50IxGSJEro.v1bwG61BXnladcK', 17, TRUE, FALSE),
  (5, 'Maria Inactiva', 'inactive@est.ups.edu.ec', '$2y$10$lYyqARDipgEtelJyCONr6e7D07k50IxGSJEro.v1bwG61BXnladcK', 28, FALSE, FALSE),
  (6, 'Beto Eliminado', 'deleted@est.ups.edu.ec', '$2y$10$lYyqARDipgEtelJyCONr6e7D07k50IxGSJEro.v1bwG61BXnladcK', 31, TRUE, TRUE),
  (7, 'Diego Lector', 'diego@est.ups.edu.ec', '$2y$10$lYyqARDipgEtelJyCONr6e7D07k50IxGSJEro.v1bwG61BXnladcK', 25, TRUE, FALSE);

INSERT INTO user_roles (user_id, role_id) VALUES
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 3),
  (5, 3),
  (6, 3),
  (7, 3);

INSERT INTO publishers (id, name, country, active, deleted) VALUES
  (1, 'Andes Editorial', 'Ecuador', TRUE, FALSE),
  (2, 'Editorial Académica', 'Ecuador', TRUE, FALSE),
  (3, 'Global Press', 'Estados Unidos', TRUE, FALSE),
  (4, 'Editorial Antigua', 'Ecuador', FALSE, FALSE),
  (5, 'Editorial Eliminada', 'Ecuador', TRUE, TRUE);

INSERT INTO books (id, isbn, title, author, category, copies_available, price, active, deleted) VALUES
  (1, '978000000001', 'Algoritmos en Java', 'Robert Sedgewick', 'Programación', 8, 45.50, TRUE, FALSE),
  (2, '978000000002', 'Spring Boot Profesional', 'Craig Walls', 'Programación', 3, 38.90, TRUE, FALSE),
  (3, '978000000003', 'Bases de Datos Modernas', 'Carlos Coronel', 'Bases de datos', 1, 42.00, TRUE, FALSE),
  (4, '978000000004', 'Arquitectura de Software', 'Len Bass', 'Arquitectura', 0, 55.25, TRUE, FALSE),
  (5, '978000000005', 'Redes de Computadores', 'Andrew Tanenbaum', 'Redes', 6, 49.99, FALSE, FALSE),
  (6, '978000000006', 'Libro Eliminado', 'Autor Histórico', 'Archivo', 2, 15.00, TRUE, TRUE),
  (7, '978000000007', 'Desarrollo Web Moderno', 'María Pérez', 'Desarrollo web', 5, 31.75, TRUE, FALSE),
  (8, '978000000008', 'Introducción a Python', 'Luciano Ramalho', 'Programación', 4, 29.50, TRUE, FALSE);

ALTER TABLE roles ALTER COLUMN id RESTART WITH 10;
ALTER TABLE users ALTER COLUMN id RESTART WITH 20;
ALTER TABLE publishers ALTER COLUMN id RESTART WITH 20;
ALTER TABLE books ALTER COLUMN id RESTART WITH 20;
