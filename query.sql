CREATE TABLE `empleado` (
  `idempleado` int(12) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `tipo_documento` varchar(45) DEFAULT NULL,
  `numero_documento` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `edad` int(5) DEFAULT NULL,
  `fecha_vinculacion_compania` date DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL,
  `salario` double DEFAULT NULL,
  PRIMARY KEY (`idempleado`)
);