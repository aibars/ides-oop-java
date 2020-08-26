-- tp3db.inquilinos definition

CREATE TABLE `inquilinos` (
  `dni` int NOT NULL,
  `genero` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- tp3db.unidades definition

CREATE TABLE `unidades` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) DEFAULT NULL,
  `superficie` decimal(10,0) DEFAULT NULL,
  `inquilinoDNI` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `unidades_FK` (`inquilinoDNI`),
  CONSTRAINT `unidades_FK` FOREIGN KEY (`inquilinoDNI`) REFERENCES `inquilinos` (`dni`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;