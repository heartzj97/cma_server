-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cma
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `supervision`
--

DROP TABLE IF EXISTS `supervision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supervision` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `author` varchar(45) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `approver` varchar(45) DEFAULT NULL,
  `approve_date` date DEFAULT NULL,
  `remark` varchar(1000) NOT NULL,
  `situation` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision`
--

LOCK TABLES `supervision` WRITE;
/*!40000 ALTER TABLE `supervision` DISABLE KEYS */;
INSERT INTO `supervision` VALUES (3,'2018-06-09 02:42:46','2018-06-09 02:42:46','liuliu','2018-06-09 02:42:46',NULL,NULL,'',0),(4,'2018-06-09 02:47:50','2018-06-09 02:47:50','Jack','2018-06-09 02:47:50','Nancy',NULL,'',1);
/*!40000 ALTER TABLE `supervision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supervision_plan`
--

DROP TABLE IF EXISTS `supervision_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supervision_plan` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `supervise_id` bigint(10) unsigned NOT NULL,
  `content` varchar(1000) NOT NULL,
  `object` varchar(45) NOT NULL,
  `date_frequency` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `plan_supervise_id_idx` (`supervise_id`),
  CONSTRAINT `plan_supervise_id` FOREIGN KEY (`supervise_id`) REFERENCES `supervision` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_plan`
--

LOCK TABLES `supervision_plan` WRITE;
/*!40000 ALTER TABLE `supervision_plan` DISABLE KEYS */;
INSERT INTO `supervision_plan` VALUES (1,'2018-06-09 02:41:11','2018-06-09 02:48:08',3,'啦啦啦啦','Jack','iw'),(2,'2018-06-09 02:41:23','2018-06-09 02:48:08',3,'ae','Blue','qwe'),(3,'2018-06-09 02:41:35','2018-06-09 02:41:35',4,'we','qq','e');
/*!40000 ALTER TABLE `supervision_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supervision_record`
--

DROP TABLE IF EXISTS `supervision_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supervision_record` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `department` varchar(45) NOT NULL,
  `supervisor` varchar(45) NOT NULL,
  `supervise_date` date NOT NULL,
  `supervised_person` varchar(45) NOT NULL,
  `record` varchar(1000) NOT NULL,
  `conclusion` varchar(1000) NOT NULL,
  `operator` varchar(45) NOT NULL,
  `record_date` date NOT NULL,
  `plan_id` bigint(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `supervise_plan_id_idx` (`plan_id`),
  CONSTRAINT `supervise_plan_id` FOREIGN KEY (`plan_id`) REFERENCES `supervision_plan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_record`
--

LOCK TABLES `supervision_record` WRITE;
/*!40000 ALTER TABLE `supervision_record` DISABLE KEYS */;
INSERT INTO `supervision_record` VALUES (1,'2018-06-09 02:49:38','2018-06-09 02:51:00','组织部','王五','2018-06-09','张三','好','好','李四','2018-06-10',1);
/*!40000 ALTER TABLE `supervision_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-09 12:17:46
