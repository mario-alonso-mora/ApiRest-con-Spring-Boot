
DROP TABLE IF EXISTS `peliculas`;

CREATE TABLE `peliculas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha_estreno` date DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `peliculas` WRITE;

INSERT INTO `peliculas` VALUES (1,'1972-05-12','Crimen-drama','El padrino',15),(3,'2001-02-01','Crimen-Suspenso','Training Day',12),(4,'1996-08-15','Infantil/Comedia','Space Jam',12),(5,'2009-02-10','Ciencia Ficcion','Avatar',10),(6,'2006-03-11','Fantasia-Drama','Laberinto del Fauno',4),(7,'1983-07-12','Crimen-Drama','Scarface',6),(8,'2012-07-04','Western-Accion','Django Unchained',16),(9,'1997-04-04','Belico-drama','La vida es bella',16),(10,'1994-04-04','Drama-Crimen','Cadena Perpetua',18),(11,'1971-06-01','Drama-Crimen','La naranja mecánica',2),(12,'1990-03-01','Belico-Accion','Salvar al soldado Ryan',18),(13,'1995-01-04','Belico-Drama','Braveheart',8),(14,'1994-07-11','Drama-Romance','Forrest Gump',8),(15,'1976-03-11','Deporte','Rocky',7),(16,'1998-02-11','Drama-Crimen','American History X',15);

UNLOCK TABLES;


