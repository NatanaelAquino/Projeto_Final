-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(200) NOT NULL,
  `Senha` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `uf` char(2) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'','','','123','123','','','','',NULL),(2,'Natanael','12','wedut62@gmail.com','35998275900','37561195','MG','Pouso Alegre','140','Rua Edison de Almeida Montes Residencial Morumbi II',NULL),(3,'NOME','Senha','Senha','33333333','37561195','UF','Pouso Alegre','Numero','Rua Edison de Almeida Montes',NULL),(4,'NOME','Senha','Senha','33333333','37561195','UF','Pouso Alegre','Numero','Rua Edison de Almeida Montes',NULL),(5,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(6,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(7,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(8,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(9,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(10,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(11,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(12,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL),(13,'NOME','Senha','Senha','33333333','','UF','Bairro','Numero','Rua',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-13 12:20:39
