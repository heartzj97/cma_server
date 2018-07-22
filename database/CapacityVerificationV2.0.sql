-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cma
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
-- Table structure for table `capacity_verification_plan`
--

DROP TABLE IF EXISTS `capacity_verification_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capacity_verification_plan` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) DEFAULT NULL,
  `organizer` varchar(45) DEFAULT NULL,
  `state` bigint(10) DEFAULT '0',
  `year` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `analysis` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacity_verification_plan`
--

LOCK TABLES `capacity_verification_plan` WRITE;
/*!40000 ALTER TABLE `capacity_verification_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacity_verification_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacity_verification_project`
--

DROP TABLE IF EXISTS `capacity_verification_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capacity_verification_project` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `plan_id` bigint(10) unsigned NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `method` varchar(45) DEFAULT NULL,
  `state` bigint(10) DEFAULT '0',
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `plan_id_idx` (`plan_id`),
  CONSTRAINT `plan_id` FOREIGN KEY (`plan_id`) REFERENCES `capacity_verification_plan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacity_verification_project`
--

LOCK TABLES `capacity_verification_project` WRITE;
/*!40000 ALTER TABLE `capacity_verification_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacity_verification_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacity_verification_record`
--

DROP TABLE IF EXISTS `capacity_verification_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capacity_verification_record` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `project_id` bigint(10) unsigned NOT NULL,
  `date` date DEFAULT NULL,
  `method_id` varchar(45) DEFAULT NULL,
  `equipment_name` varchar(45) DEFAULT NULL,
  `equipment_id` varchar(45) DEFAULT NULL,
  `experimenter` varchar(45) DEFAULT NULL,
  `result` varchar(45) DEFAULT NULL,
  `result_deal` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `project_id_idx` (`project_id`),
  CONSTRAINT `project_id` FOREIGN KEY (`project_id`) REFERENCES `capacity_verification_project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacity_verification_record`
--

LOCK TABLES `capacity_verification_record` WRITE;
/*!40000 ALTER TABLE `capacity_verification_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacity_verification_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-16 21:15:32
