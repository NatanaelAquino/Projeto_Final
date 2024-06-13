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
-- Table structure for table `descarte`
--

DROP TABLE IF EXISTS `descarte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `descarte` (
  `nome_residuo` varchar(255) DEFAULT NULL,
  `tipo_residuo` enum('Papel','Plástico','Metal','Vidro','Orgânico','Eletrônico','Outro') DEFAULT NULL,
  `tipo_fase` enum('Sólido','Líquido') DEFAULT NULL,
  `setor` varchar(255) DEFAULT NULL,
  `forma_reciclagem` varchar(255) DEFAULT NULL,
  `quantidade` bigint DEFAULT NULL,
  `como_descartado` varchar(255) DEFAULT NULL,
  `descricao_descarte` text,
  `usuario_id` int DEFAULT NULL,
  `data_descarte` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `descarte`
--

LOCK TABLES `descarte` WRITE;
/*!40000 ALTER TABLE `descarte` DISABLE KEYS */;
INSERT INTO `descarte` VALUES ('Natanael','Papel','Sólido','Administração','Reciclável',444,'Coleta Seletiva','123',1,'2024-06-08 15:15:12',44),('123','Papel','Sólido','Administração','Reciclável',44444,'Coleta Seletiva','444',1,'2024-06-08 15:15:37',45),('xarada','Papel','Sólido','Administração','Reciclável',123456,'Coleta Seletiva','dfadsfads',1,'2024-06-08 21:40:39',46),('QWER','Papel','Sólido','Administração','Não Reciclável',12,'Coleta Seletiva','SDAF',1,'2024-06-08 22:08:29',47),('1','Papel','Sólido','Administração','Não Reciclável',123,'Coleta Seletiva','sda',1,'2024-06-08 22:10:09',48),('Papel','Papel','Sólido','Administração','Reciclável',231,'Coleta Seletiva','KKBNKLBASDF',2,'2024-06-09 15:41:14',49),('Natanael','Papel','Sólido','Produção','Não Reciclável',432,'Coleta Seletiva','affadsfasf',2,'2024-06-10 23:37:36',50);
/*!40000 ALTER TABLE `descarte` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-12  0:00:14
