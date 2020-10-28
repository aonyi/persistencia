-- Creación de las tablas

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

CREATE TABLE `venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` datetime DEFAULT NULL,
  `nombre` double DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cliente_venta` (`cliente`),
  CONSTRAINT `fk_cliente_venta` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Carga los datos iniciales
INSERT INTO `persistencia`.`cliente` (`id`,`nombre`,`apellido`)
VALUES (1,'Carlos','Gomez');

INSERT INTO `persistencia`.`cliente` (`id`,`nombre`,`apellido`)
VALUES (2,'Ruben','Valdez');

INSERT INTO `persistencia`.`cliente` (`id`,`nombre`,`apellido`)
VALUES (3,'Quico','Villagrán');

