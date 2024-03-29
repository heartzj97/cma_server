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
-- Table structure for table `staff_file`
--

DROP TABLE IF EXISTS `staff_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_file` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file_id` varchar(45) NOT NULL,
  `file_location` varchar(45) DEFAULT NULL,
  `file_image` varchar(100) DEFAULT NULL,
  `user_id` bigint(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `file_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_file`
--

LOCK TABLES `staff_file` WRITE;
/*!40000 ALTER TABLE `staff_file` DISABLE KEYS */;
INSERT INTO `staff_file` VALUES (1,'2018-05-28 05:26:46','2018-05-28 05:27:39','bf757878','1号档案柜',NULL,1),(2,'2018-05-28 05:27:26','2018-05-28 05:27:39','tp5689855','2号档案柜',NULL,2),(18,'2018-05-28 12:15:16','2018-05-28 12:15:16','tktk12558',NULL,NULL,2);
/*!40000 ALTER TABLE `staff_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(20) NOT NULL,
  `department` varchar(45) NOT NULL,
  `position` varchar(45) NOT NULL,
  `gender` tinyint(1) unsigned NOT NULL,
  `title` varchar(45) NOT NULL,
  `degree` varchar(45) NOT NULL,
  `graduation_school` varchar(45) NOT NULL,
  `graduation_major` varchar(45) NOT NULL,
  `graduation_date` date NOT NULL,
  `working_years` tinyint(2) unsigned NOT NULL,
  `is_leaving` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `leaving_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2018-05-26 01:43:23','2018-05-28 06:15:15','大民','实验室','副主任',0,'教授','博士研究生','南京大学','计算机软件','1988-10-01',8,0,NULL),(2,'2018-05-26 01:44:42','2018-05-28 05:27:04','张三','测试室','负责人',0,'副教授','博士研究生','北京大学','计算机应用','2005-05-06',5,0,NULL),(3,'2018-05-28 07:12:17','2018-05-28 12:17:41','天天','市场部','标准分析师',0,'教授','博士研究生','北京大学','计算机软件','2009-09-30',4,1,'2011-03-19');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-28 20:19:48
