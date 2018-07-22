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
  `start_time` date DEFAULT NULL,
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
  `object` varchar(45) NOT NULL,
  `content` varchar(45) NOT NULL,
  `check_date` date NOT NULL,
  `person_in_charge` varchar(45) NOT NULL,
  `state` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intermediate_checks_plan`
--

LOCK TABLES `intermediate_checks_plan` WRITE;
/*!40000 ALTER TABLE `intermediate_checks_plan` DISABLE KEYS */;
INSERT INTO `intermediate_checks_plan` VALUES (3,'2018-06-14 02:02:44','2018-06-15 05:31:48','小7','莱尔','2018-05-04','王五',1),(4,'2018-06-15 05:36:35','2018-06-15 05:38:07','小红','贪污腐败','2018-03-03','小绿',0),(5,'2018-06-15 05:41:22','2018-06-15 05:41:22','小花','设备使用规范','2018-03-04','小绿',0),(8,'2018-06-15 05:48:21','2018-06-15 05:55:13','uzii','萨芬','2018-03-05','士大夫',0),(9,'2018-06-15 05:49:42','2018-06-15 05:49:42','小花','设备使用规范','2018-03-05','小绿',1),(10,'2018-06-15 05:50:27','2018-06-15 05:50:27','小花','设备使用规范','2018-03-05','小绿',0),(11,'2018-06-15 06:05:46','2018-06-15 06:05:46','大花','设备使用规范','2018-03-05','小绿',0);
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
INSERT INTO `intermediate_checks_record` VALUES (1,'2018-06-16 02:01:54','2018-06-16 02:01:54',3,'XX','2018-06-06','XXXX','XXX','2018-06-08','XX','XXX','2018-06-10','XX');
/*!40000 ALTER TABLE `intermediate_checks_record` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_authorization`
--

LOCK TABLES `staff_authorization` WRITE;
/*!40000 ALTER TABLE `staff_authorization` DISABLE KEYS */;
INSERT INTO `staff_authorization` VALUES (7,'2018-06-06 17:19:14','2018-06-12 00:34:27',13,17,'2018-06-09','4554'),(9,'2018-06-06 18:27:41','2018-06-06 18:27:41',5,4,'2018-06-08','7'),(18,'2018-06-07 03:07:05','2018-06-07 03:07:05',8,8,'2000-01-01','。。'),(20,'2018-06-07 03:29:01','2018-06-14 03:00:22',19,18,'2000-01-01','。'),(30,'2018-06-11 12:04:31','2018-06-11 12:04:31',13,18,'2018-06-14','555');
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_file`
--

LOCK TABLES `staff_file` WRITE;
/*!40000 ALTER TABLE `staff_file` DISABLE KEYS */;
INSERT INTO `staff_file` VALUES (14,'2018-06-07 07:16:35','2018-06-07 14:11:20','w','w','null',14),(15,'2018-06-07 13:58:02','2018-06-08 11:26:58','bf757878','2号档案柜','mieba.jpg',13),(16,'2018-06-07 14:38:57','2018-06-07 14:38:57','222','333','output_image.jpg',15),(19,'2018-06-11 11:20:36','2018-06-11 11:20:57','11222','档案室2','output_image.jpg',17),(20,'2018-06-11 14:55:26','2018-06-11 16:25:45','test','test','IMG_20180215_190718R.jpg',18),(21,'2018-06-11 16:29:16','2018-06-11 16:29:16','dddd','ffffff','output_image.jpg',19);
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
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_qualification`
--

LOCK TABLES `staff_qualification` WRITE;
/*!40000 ALTER TABLE `staff_qualification` DISABLE KEYS */;
INSERT INTO `staff_qualification` VALUES (1,'2018-06-03 08:50:26','2018-06-06 12:52:59','测试工程师认定签字','7.jpg',3),(4,'2018-06-09 15:02:50','2018-06-09 15:02:50','测试文档','getImage.jpg',1),(10,'2018-06-10 14:11:58','2018-06-10 14:11:58','测试工程师','getImage.jpg',13),(11,'2018-06-10 15:10:01','2018-06-10 15:10:01','查重吗','getImage.jpg',13),(12,'2018-06-11 01:35:35','2018-06-11 01:35:35','564654','mieba2.jpg',14),(13,'2018-06-11 03:44:52','2018-06-11 03:44:52','hhh','getImage.jpg',15),(14,'2018-06-11 10:51:56','2018-06-11 13:20:34','2222111111','output_image.jpg',13),(15,'2018-06-11 10:53:27','2018-06-11 10:53:27','高级测试员','output_image.jpg',17),(16,'2018-06-11 11:36:50','2018-06-11 11:36:50','asdfghjkl','output_image.jpg',18),(17,'2018-06-11 11:49:08','2018-06-11 11:49:08','2222222','output_image.jpg',18),(18,'2018-06-11 12:16:57','2018-06-11 12:32:18','zizhiaaaaa','output_image.jpg',17),(20,'2018-06-11 13:18:36','2018-06-12 02:25:00','buxuaidao','output_image.jpg',13),(21,'2018-06-11 13:35:12','2018-06-12 01:21:30','测试师啊啊','v2-b1251cbf13446c2c3e9da5689abb082b_r.jpg',17),(23,'2018-06-12 02:23:01','2018-06-12 02:23:01','啥都会','getImage.jpg',18),(24,'2018-06-14 03:06:34','2018-06-14 03:06:49','ceshishi1111','output_image.jpg',19);
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training`
--

LOCK TABLES `staff_training` WRITE;
/*!40000 ALTER TABLE `staff_training` DISABLE KEYS */;
INSERT INTO `staff_training` VALUES (1,'2018-05-29 13:09:15','2018-06-13 09:18:29','实验室设备使用','2018-06-29',NULL,'南京大学','天天','设备开机与关机','evaefbtrj',NULL),(2,'2018-06-09 12:55:04','2018-06-09 12:55:04','JavaScript','2018-06-09',NULL,'NJU','TA','inheritance','....',NULL),(3,'2018-06-12 06:38:29','2018-06-12 06:38:29','IELTS','2018-06-01',NULL,'NJU','Lucia','How to succeed in IELTS','No way!',NULL),(4,'2018-06-11 03:45:41','2018-06-11 03:45:41','程序设计语言','2018-06-11',NULL,'南大仙林','张天','为格兰特小姐的卧室里的密室设计控制器','注意设计出来的程序需要保证控制器的执行序列符合题目要求。',NULL),(5,'2018-06-12 09:18:55','2018-06-12 13:21:08','编译原理','2018-06-06',NULL,'南大仙林-思源楼','许畅','实验四指导','重点讲授了如何充分地测试自己的编译器.',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training_result`
--

LOCK TABLES `staff_training_result` WRITE;
/*!40000 ALTER TABLE `staff_training_result` DISABLE KEYS */;
INSERT INTO `staff_training_result` VALUES (2,'2018-06-04 02:08:15','2018-06-04 02:08:15',1,3,'合格',NULL),(3,'2018-06-04 02:08:15','2018-06-04 02:08:15',1,4,'合格',NULL),(11,'2018-06-06 17:37:00','2018-06-06 17:37:00',1,1,NULL,NULL);
/*!40000 ALTER TABLE `staff_training_result` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision`
--

LOCK TABLES `supervision` WRITE;
/*!40000 ALTER TABLE `supervision` DISABLE KEYS */;
INSERT INTO `supervision` VALUES (3,'2018-06-09 02:42:46','2018-06-10 03:30:17','liuliu','2018-06-09 02:42:46','Lucy','2018-06-09','',2),(4,'2018-06-11 12:55:57','2018-06-11 16:21:49','aaa','2018-06-11 12:55:57','rem','2018-06-11','aaaaaaaajkkmultilateral solu',2),(7,'2018-06-11 14:26:09','2018-06-11 16:00:36','wwww','2018-06-11 14:26:09','wwssss','2018-06-11','ggggggaaa',1),(11,'2018-06-11 16:02:54','2018-06-11 16:02:59','ddddd','2018-06-11 16:02:54','assss','2018-06-12','dddd',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_plan`
--

LOCK TABLES `supervision_plan` WRITE;
/*!40000 ALTER TABLE `supervision_plan` DISABLE KEYS */;
INSERT INTO `supervision_plan` VALUES (1,'2018-06-09 02:41:11','2018-06-09 02:48:08',3,'啦啦啦啦','Jack','iw'),(2,'2018-06-09 02:41:23','2018-06-10 02:55:52',3,'balbal','阿da','ew'),(8,'2018-06-11 13:53:24','2018-06-11 13:57:04',4,'awwwwaaa','ssssdd','aaaa'),(12,'2018-06-11 15:28:31','2018-06-12 00:26:27',4,'11111好红红火火恍恍惚惚','2222','3333');
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
  CONSTRAINT `supervise_plan_id` FOREIGN KEY (`plan_id`) REFERENCES `supervision_plan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_record`
--

LOCK TABLES `supervision_record` WRITE;
/*!40000 ALTER TABLE `supervision_record` DISABLE KEYS */;
INSERT INTO `supervision_record` VALUES (1,'2018-06-09 02:49:38','2018-06-09 02:51:00','组织部','王五','2018-06-09','张三','好','好','李四','2018-06-10',1),(12,'2018-06-12 00:03:05','2018-06-12 00:03:05','测试部','王国新','2018-01-01','王国新','监督内容','结论','操作人','2018-01-01',8);
/*!40000 ALTER TABLE `supervision_record` ENABLE KEYS */;
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
  `situation` tinyint(2) DEFAULT '0',
  `department` varchar(45) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `approver` varchar(45) DEFAULT NULL,
  `approve_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_application`
--

LOCK TABLES `training_application` WRITE;
/*!40000 ALTER TABLE `training_application` DISABLE KEYS */;
INSERT INTO `training_application` VALUES (1,'2018-06-13 12:18:58','2018-06-13 12:18:58','设备使用','李四','南京大学',1000,'设备使用技术不高',1,'测试部','2018-06-13','张三','2018-06-14'),(2,'2018-06-15 11:52:27','2018-06-15 11:52:27','测试软件使用','Jack','测试中心',3000,'测试技术不熟',2,'测试部','2018-03-11','Simon','2018-03-13'),(4,'2018-06-15 11:57:21','2018-06-15 12:01:00','某某培训','小二','培训中心',10000,'某原因',2,'某部门','2018-06-15','Tom','2018-04-04'),(6,'2018-06-15 12:02:20','2018-06-16 02:29:27','打印机使用培训','王先生','培训机构',12000,'打印机不会用',1,'档案部','2018-05-05','Jack','2018-04-04'),(8,'2018-06-15 12:18:56','2018-06-15 12:20:33','XX培训','XXX','XX培训中心',10000,'XX原因',1,'XX某部门','2018-05-05','Tom','2018-04-04'),(10,'2018-06-15 12:19:14','2018-06-15 12:19:14','XX培训2','XXX','XX培训中心',10000,'XX原因',0,'XX某部门','2018-05-05',NULL,NULL),(11,'2018-06-15 12:19:17','2018-06-15 12:19:17','XX培训3','XXX','XX培训中心',10000,'XX原因',0,'XX某部门','2018-05-05',NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2018-05-26 01:43:23','2018-06-06 13:52:11','大民','实验室','副主任',0,'教授','博士研究生','南京大学','计算机软件','2000-01-01',1,1,'2018-06-17'),(3,'2018-05-28 07:12:17','2018-06-06 13:43:56','天天','市场部','标准分析师',0,'教授','博士研究生','北京大学','计算机软件','2009-09-30',4,1,'2018-06-08'),(4,'2018-05-28 07:12:17','2018-06-06 13:48:06','baibai','市场部','标准分析师',0,'教授','博士研究生','北京大学','计算机软件','2009-09-30',4,1,'2018-06-08'),(5,'2018-06-06 13:27:52','2018-06-07 02:24:40','啦啦啦','学习部','部长',0,'教授','大学','北大','计算机','2000-01-01',10,1,'2018-06-13'),(6,'2018-06-06 14:09:11','2018-06-07 02:46:46','。','。','。',0,'。','。','。','。','2000-01-01',1,1,'2018-06-21'),(7,'2018-06-06 16:35:07','2018-06-07 02:27:23','张敏','技术部','部长',1,'敏儿','本科','南京大学','计算机','2000-01-01',1,1,'2018-06-06'),(8,'2018-06-07 02:39:18','2018-06-07 03:07:16','wwwww','www','www',0,'www','www','www','www','2000-03-01',5,1,'2000-01-04'),(10,'2018-06-07 02:59:29','2018-06-07 03:06:38','1111','111','111',0,'111','1111','1111','111','2000-01-04',4,1,'2018-06-07'),(11,'2018-06-07 03:06:52','2018-06-07 03:15:23','。','，','。',0,'。','。','。','。','2000-01-01',1,1,'2018-06-04'),(12,'2018-06-07 03:10:43','2018-06-08 03:16:03','1','1','1',0,'1','1','1','1','2000-01-01',1,1,'2018-06-01'),(13,'2018-06-07 03:28:46','2018-06-07 03:28:46','lgy','。','。',0,'。','。。','。','。','2000-01-01',1,0,NULL),(14,'2018-06-07 07:16:11','2018-06-07 17:05:39','wwwww','www','www',0,'www','www','www','www','2003-01-05',5,1,'2018-06-17'),(15,'2018-06-07 14:30:47','2018-06-08 09:46:43','sss','sss','sss',1,'sss','ssss','sss','ss','2000-01-04',3,1,'2018-06-07'),(16,'2018-06-07 14:40:18','2018-06-07 17:04:15','aaa','aaa','aaa',0,'aaa','aaa','aaa','aaa','2000-04-01',3,1,'2010-06-03'),(17,'2018-06-08 10:31:45','2018-06-08 10:31:45','小民','请问','山地车',0,'教授','博士研究生','12341','dffe','2018-06-02',1,0,NULL),(18,'2018-06-11 07:24:05','2018-06-11 07:24:05','sad','sad','asda',0,'asd','asd','asd','asd','2005-05-05',5,0,NULL),(19,'2018-06-11 16:28:34','2018-06-11 16:28:34','aaaaaaaa','aaaaa','aaaa',0,'aaaa','AAAAA','aaaaaa','aaaaaa','2004-01-01',4,0,NULL);
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

-- Dump completed on 2018-06-16 11:11:13
