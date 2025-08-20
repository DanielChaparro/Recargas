-- Inserts de Operadores
INSERT INTO operador (id, codigo, nombre) VALUES (1, 'OP-CLARO', 'Claro');
INSERT INTO operador (id, codigo, nombre) VALUES (2, 'OP-MOVI', 'Movistar');

-- Inserts de Vendedores
INSERT INTO vendedor (id, codigo, nombre) VALUES (1, 'VEN-JP', 'Juan Pérez');
INSERT INTO vendedor (id, codigo, nombre) VALUES (2, 'VEN-AG', 'Ana Gómez');

-- Inserts de Clientes
INSERT INTO cliente (id, nombre, numero, operador_id) VALUES (1, 'Carlos Ruiz', '3001234567', 1);
INSERT INTO cliente (id, nombre, numero, operador_id) VALUES (2, 'María Torres', '3109876543', 2);

-- Inserts de Recargas (usando llaves naturales)
INSERT INTO recarga (id, codigo_operador, codigo_vendedor, numero_cliente)
VALUES (1, 'OP-CLARO', 'VEN-JP', '3001234567');

INSERT INTO recarga (id, codigo_operador, codigo_vendedor, numero_cliente)
VALUES (2, 'OP-MOVI', 'VEN-AG', '3109876543');