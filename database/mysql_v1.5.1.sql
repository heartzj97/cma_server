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
-- Table structure for table `staff_authorization`
--

DROP TABLE IF EXISTS `staff_authorization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_authorization` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `authorizer_id` bigint(10) unsigned NOT NULL,
  `user_id` bigint(10) unsigned NOT NULL,
  `authorizer_date` date NOT NULL,
  `content` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `authorize_user_id_idx` (`authorizer_id`),
  KEY `qualification_user_id_idx` (`user_id`),
  KEY `qualifacate_user_id_idx` (`user_id`),
  CONSTRAINT `authorize_user_id` FOREIGN KEY (`authorizer_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `qualifacate_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_authorization`
--

LOCK TABLES `staff_authorization` WRITE;
/*!40000 ALTER TABLE `staff_authorization` DISABLE KEYS */;
INSERT INTO `staff_authorization` VALUES (9,'2018-06-06 18:27:41','2018-07-20 12:50:26',50,47,'2018-07-04','打游戏');
/*!40000 ALTER TABLE `staff_authorization` ENABLE KEYS */;
UNLOCK TABLES;

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
  `user_id` bigint(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `file_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_file`
--

LOCK TABLES `staff_file` WRITE;
/*!40000 ALTER TABLE `staff_file` DISABLE KEYS */;
INSERT INTO `staff_file` VALUES (37,'2018-07-20 12:54:10','2018-07-20 12:54:10','b211','档案室','张天_档案扫描件_2018-07-20 20:54:09.jpg',47);
/*!40000 ALTER TABLE `staff_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_qualification`
--

DROP TABLE IF EXISTS `staff_qualification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_qualification` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `qualification_name` varchar(45) NOT NULL,
  `qualification_image` varchar(100) NOT NULL,
  `user_id` bigint(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `qualification_user_id` (`user_id`),
  CONSTRAINT `qualification_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_qualification`
--

LOCK TABLES `staff_qualification` WRITE;
/*!40000 ALTER TABLE `staff_qualification` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_qualification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_training`
--

DROP TABLE IF EXISTS `staff_training`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_training` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `program` varchar(45) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  `place` varchar(45) NOT NULL,
  `presenter` varchar(10) NOT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `file` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training`
--

LOCK TABLES `staff_training` WRITE;
/*!40000 ALTER TABLE `staff_training` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_training` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff_training_result`
--

DROP TABLE IF EXISTS `staff_training_result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_training_result` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `training_id` bigint(10) unsigned NOT NULL,
  `user_id` bigint(10) unsigned NOT NULL,
  `result` varchar(1000) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `training_id_idx` (`training_id`),
  KEY `training_user_id_idx` (`user_id`),
  CONSTRAINT `training_id` FOREIGN KEY (`training_id`) REFERENCES `staff_training` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `training_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training_result`
--

LOCK TABLES `staff_training_result` WRITE;
/*!40000 ALTER TABLE `staff_training_result` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_training_result` ENABLE KEYS */;
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
  `is_leaving` tinyint(1) unsigned DEFAULT '0',
  `leaving_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (47,'2018-07-20 12:05:55','2018-07-20 12:47:39','张天','测试部','测试部部员',0,'副教授','博士','南京大学','计算机科学与技术','2010-06-15',11,0,NULL),(49,'2018-07-20 12:46:49','2018-07-20 12:47:17','胡昊','质量部','质量部主任',0,'副教授','博士','南京大学','计算机科学与技术','2005-06-20',10,0,NULL),(50,'2018-07-20 12:48:35','2018-07-20 12:48:35','余萍','市场部','市场部主任',1,'副教授','博士','南京大学','软件工程','2011-06-30',7,0,NULL),(51,'2018-07-20 12:49:57','2018-07-20 12:49:57','曹春','南大测试中心','副主任',0,'副教授','博士','南京大学','计算机科学与技术','2012-06-29',6,0,NULL);
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

-- Dump completed on 2018-07-20 21:13:00
