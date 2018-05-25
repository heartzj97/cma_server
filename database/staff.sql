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
-- Table structure for table `staff_appointment`
--

DROP TABLE IF EXISTS `staff_appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_appointment` (
  `id` bigint(10) unsigned NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `major` varchar(45) NOT NULL,
  `graduation_time` date NOT NULL,
  `department` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  `comfirm_person` varchar(45) DEFAULT NULL,
  `confirm_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_appointment`
--

LOCK TABLES `staff_appointment` WRITE;
/*!40000 ALTER TABLE `staff_appointment` DISABLE KEYS */;
INSERT INTO `staff_appointment` VALUES (1,'2017-08-03 12:22:12','2017-08-04 03:22:33','山姆','高级工程师','教授','计算机科学与技术','2006-06-02','测试部','部长','李','2018-01-01'),(2,'2017-09-02 12:22:22','2017-09-03 03:33:22','李四','高级工程师','教授','软件工程','2005-04-02','质量部','副部长','里','2017-11-12');
/*!40000 ALTER TABLE `staff_appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_file`
--

DROP TABLE IF EXISTS `staff_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_file` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(20) NOT NULL,
  `department` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  `file_id` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `file_image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_file`
--

LOCK TABLES `staff_file` WRITE;
/*!40000 ALTER TABLE `staff_file` DISABLE KEYS */;
INSERT INTO `staff_file` VALUES (1,'2013-01-02 00:00:00','2018-05-19 13:59:38','小白','市场部','部员',NULL,NULL,NULL),(2,'2013-01-02 00:00:00','2013-04-02 00:00:00','小明','研发部','部员',NULL,NULL,NULL),(3,'2018-05-19 21:12:27','2018-05-19 13:12:27','大乔','市场部','部员','','','');
/*!40000 ALTER TABLE `staff_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_resigning`
--

DROP TABLE IF EXISTS `staff_resigning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_resigning` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(20) NOT NULL,
  `title` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `major` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  `resign_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_resigning`
--

LOCK TABLES `staff_resigning` WRITE;
/*!40000 ALTER TABLE `staff_resigning` DISABLE KEYS */;
INSERT INTO `staff_resigning` VALUES (1,'2014-01-03 00:00:00','2015-02-02 16:00:00','小明','初级技师','学士','计算机','研发部','部长','2015-10-02'),(2,'2014-01-03 00:00:00','2015-02-02 16:00:00','小白','初级技师','学士','计算机','研发部','部员','2014-11-12');
/*!40000 ALTER TABLE `staff_resigning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_testing`
--

DROP TABLE IF EXISTS `staff_testing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_testing` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(20) NOT NULL,
  `time` date NOT NULL,
  `content` varchar(5000) NOT NULL,
  `result` varchar(5000) NOT NULL,
  `person` varchar(45) NOT NULL,
  `auditor` varchar(45) DEFAULT NULL,
  `audit_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_testing`
--

LOCK TABLES `staff_testing` WRITE;
/*!40000 ALTER TABLE `staff_testing` DISABLE KEYS */;
INSERT INTO `staff_testing` VALUES (1,'2012-01-01 00:00:00','2013-03-02 16:00:00','大白','2013-01-01','hdhdsajda','dawdoiwajdowada','小白',NULL,NULL),(2,'2010-02-02 00:00:00','2013-03-02 16:00:00','大红','2013-01-01','hdhdsajda','dawdoiwajdowada','小明',NULL,NULL);
/*!40000 ALTER TABLE `staff_testing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_training`
--

DROP TABLE IF EXISTS `staff_training`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_training` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) NOT NULL,
  `time` date NOT NULL,
  `location` varchar(45) NOT NULL,
  `speaker` varchar(45) NOT NULL,
  `content` varchar(5000) DEFAULT NULL,
  `remarks` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training`
--

LOCK TABLES `staff_training` WRITE;
/*!40000 ALTER TABLE `staff_training` DISABLE KEYS */;
INSERT INTO `staff_training` VALUES (1,'2018-05-01 11:11:11','2018-05-02 04:22:33','小红','2018-04-29','南京大学','王林章','测试','无'),(2,'2017-04-03 09:22:33','2017-04-07 04:22:33','小李','2017-03-21','东南大学','李嘉洵','测试','无');
/*!40000 ALTER TABLE `staff_training` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-21 18:53:52
