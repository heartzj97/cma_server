-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cma
-- ------------------------------------------------------
-- Serverintermediate_checks_record version	5.7.21-log

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
-- Table structure for table `all_annual_plan`
--

DROP TABLE IF EXISTS `all_annual_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `all_annual_plan` (
  `year` bigint(4) unsigned NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `author` varchar(45) NOT NULL,
  `create_date` date NOT NULL,
  `approver` varchar(45) DEFAULT NULL,
  `approve_date` date DEFAULT NULL,
  PRIMARY KEY (`year`),
  UNIQUE KEY `year_UNIQUE` (`year`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `all_annual_plan`
--

LOCK TABLES `all_annual_plan` WRITE;
/*!40000 ALTER TABLE `all_annual_plan` DISABLE KEYS */;
INSERT INTO `all_annual_plan` VALUES (2018,'2018-06-13 12:19:40','2018-06-13 12:19:40','王','2018-01-01','李','2018-02-02');
/*!40000 ALTER TABLE `all_annual_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `annual_training_plan`
--

DROP TABLE IF EXISTS `annual_training_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `annual_training_plan` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(4) DEFAULT NULL,
  `train_project` varchar(45) DEFAULT NULL,
  `people` varchar(45) DEFAULT NULL,
  `method` varchar(45) DEFAULT NULL,
  `training_time` bigint(4) DEFAULT NULL,
  `strat_time` date DEFAULT NULL,
  `end_time` date DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `annual_training_plan`
--

LOCK TABLES `annual_training_plan` WRITE;
/*!40000 ALTER TABLE `annual_training_plan` DISABLE KEYS */;
INSERT INTO `annual_training_plan` VALUES (1,'2018-06-13 12:21:01','2018-06-13 12:21:01',2018,'设备使用','赵','线上培训',18,'2018-04-04','2018-04-20','无');
/*!40000 ALTER TABLE `annual_training_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `intermediate_checks_plan`
--

DROP TABLE IF EXISTS `intermediate_checks_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `intermediate_checks_plan` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `object` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `check_date` date DEFAULT NULL,
  `person_in_charge` varchar(45) DEFAULT NULL,
  `state` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intermediate_checks_plan`
--

LOCK TABLES `intermediate_checks_plan` WRITE;
/*!40000 ALTER TABLE `intermediate_checks_plan` DISABLE KEYS */;
INSERT INTO `intermediate_checks_plan` VALUES (1,'2018-06-14 02:02:26','2018-06-14 02:02:26','张三','啦','2018-05-01','李四',0),(2,'2018-06-14 02:02:44','2018-06-14 02:02:44','李四','嘀嘀嘀','2018-05-04','王五',1);
/*!40000 ALTER TABLE `intermediate_checks_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `intermediate_checks_record`
--

DROP TABLE IF EXISTS `intermediate_checks_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `intermediate_checks_record` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `plan_id` bigint(10) unsigned NOT NULL,
  `object` varchar(45) DEFAULT NULL,
  `check_date` date DEFAULT NULL,
  `process_record` varchar(1000) DEFAULT NULL,
  `process_record_person` varchar(45) DEFAULT NULL,
  `process_record_date` date DEFAULT NULL,
  `result_record` varchar(1000) DEFAULT NULL,
  `result_record_person` varchar(45) DEFAULT NULL,
  `result_record_date` date DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `check_plan_id_idx` (`plan_id`),
  CONSTRAINT `check_plan_id` FOREIGN KEY (`plan_id`) REFERENCES `intermediate_checks_plan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intermediate_checks_record`
--

LOCK TABLES `intermediate_checks_record` WRITE;
/*!40000 ALTER TABLE `intermediate_checks_record` DISABLE KEYS */;
INSERT INTO `intermediate_checks_record` VALUES (1,'2018-06-14 02:04:18','2018-06-14 02:04:18',1,'张三','2018-07-02','李四','Jack','2018-07-03','啦啦啦','Nilson','2018-07-09','无');
/*!40000 ALTER TABLE `intermediate_checks_record` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training`
--

LOCK TABLES `staff_training` WRITE;
/*!40000 ALTER TABLE `staff_training` DISABLE KEYS */;
INSERT INTO `staff_training` VALUES (1,'2018-05-29 13:09:15','2018-06-04 06:43:09','实验室设备使用','2018-05-19',NULL,'南京大学','天天','设备开机与关机',NULL,NULL),(2,'2018-05-29 16:26:24','2018-05-29 16:26:24','GitHub培训','2018-04-05',NULL,'南京大学','张天','balabala','无',NULL),(3,'2018-06-12 13:02:38','2018-06-12 13:28:19','sansan','2018-03-03',NULL,'Jack','Nancy',NULL,NULL,NULL);
/*!40000 ALTER TABLE `staff_training` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `training_application`
--

DROP TABLE IF EXISTS `training_application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training_application` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) DEFAULT NULL,
  `people` varchar(45) DEFAULT NULL,
  `training_unit` varchar(45) DEFAULT NULL,
  `expense` bigint(10) unsigned DEFAULT NULL,
  `reason` varchar(45) DEFAULT NULL,
  `situation` tinyint(2) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `approver` varchar(45) DEFAULT NULL,
  `approve_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_application`
--

LOCK TABLES `training_application` WRITE;
/*!40000 ALTER TABLE `training_application` DISABLE KEYS */;
INSERT INTO `training_application` VALUES (1,'2018-06-13 12:18:58','2018-06-13 12:18:58','设备使用','李四','南京大学',1000,'设备使用技术不高',1,'测试部','2018-06-13','张三','2018-06-14');
/*!40000 ALTER TABLE `training_application` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2018-05-26 01:43:23','2018-05-30 02:37:31','大民','实验室','副主任',0,'教授','博士研究生','南京大学','计算机软件','1988-10-01',8,0,NULL),(3,'2018-05-28 07:12:17','2018-05-30 02:37:31','天天','市场部','标准分析师',0,'教授','博士研究生','北京大学','计算机软件','2009-09-30',4,0,NULL),(4,'2018-05-28 07:12:17','2018-05-28 12:17:41','baibai','市场部','标准分析师',0,'教授','博士研究生','北京大学','计算机软件','2009-09-30',4,0,NULL);
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

-- Dump completed on 2018-06-14 10:39:42
