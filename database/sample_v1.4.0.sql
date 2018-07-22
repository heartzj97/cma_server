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
-- Table structure for table `sample`
--

DROP TABLE IF EXISTS `sample`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sample_number` varchar(10) NOT NULL,
  `sample_name` varchar(20) NOT NULL,
  `sample_amount` tinyint(1) unsigned DEFAULT '1',
  `sample_state` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY ` sample_id_UNIQUE` (`sample_number`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `sample_name_UNIQUE` (`sample_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample`
--

LOCK TABLES `sample` WRITE;
/*!40000 ALTER TABLE `sample` DISABLE KEYS */;
INSERT INTO `sample` VALUES (1,'2018-06-24 23:30:55','2018-06-24 23:30:55','20180601','美团App',1,0),(2,'2018-06-24 23:31:17','2018-06-24 23:31:17','20180602','天猫超市',1,0),(3,'2018-06-24 23:31:57','2018-06-24 23:31:57','20180603','WPS',1,0),(8,'2018-07-03 06:42:37','2018-07-03 07:07:10','20180606','香栏啊',3,0),(9,'2018-07-03 23:36:33','2018-07-03 23:36:33','20180610','香飘飘',3,0);
/*!40000 ALTER TABLE `sample` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_io`
--

DROP TABLE IF EXISTS `sample_io`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_io` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sample_id` bigint(10) unsigned NOT NULL,
  `sender` varchar(20) NOT NULL,
  `receiver` varchar(20) NOT NULL,
  `send_date` date NOT NULL,
  `obtainer` varchar(20) NOT NULL,
  `obtain_date` date NOT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `sample_state` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `sample_io_id_idx` (`sample_id`),
  CONSTRAINT `sample_io_id` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_io`
--

LOCK TABLES `sample_io` WRITE;
/*!40000 ALTER TABLE `sample_io` DISABLE KEYS */;
INSERT INTO `sample_io` VALUES (1,'2018-06-25 01:00:22','2018-06-25 01:00:22',2,'张三','李四','2018-06-16','王五','2018-06-17',NULL,0),(2,'2018-07-12 03:25:37','2018-07-12 03:25:37',1,'垃圾','菜鸡','2011-11-11','乔韦龙','2022-12-22',NULL,0);
/*!40000 ALTER TABLE `sample_io` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_material_list`
--

DROP TABLE IF EXISTS `sample_material_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_material_list` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `material_name` varchar(20) NOT NULL,
  `material_note` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_material_list`
--

LOCK TABLES `sample_material_list` WRITE;
/*!40000 ALTER TABLE `sample_material_list` DISABLE KEYS */;
INSERT INTO `sample_material_list` VALUES (1,'2018-06-24 23:26:17','2018-06-24 23:26:17','《用户手册》',NULL),(2,'2018-06-24 23:26:17','2018-06-24 23:26:17','《计算机软件产品登记检测申请表》',NULL),(3,'2018-06-24 23:26:17','2018-06-24 23:26:17','《材料交接单》',NULL),(4,'2018-06-24 23:26:17','2018-06-24 23:26:17','《软件产品功能列表》',NULL),(5,'2018-06-24 23:26:17','2018-06-24 23:26:17','《软件名称与版本号确认单》',NULL),(6,'2018-06-24 23:26:17','2018-06-24 23:26:17','《受测软件产品简介》',NULL),(7,'2018-06-24 23:26:17','2018-06-24 23:26:17','《自主产权保证书》',NULL),(8,'2018-06-24 23:26:17','2018-06-24 23:26:17','软件样品一套',NULL),(9,'2018-06-25 06:07:24','2018-06-25 06:07:24','其它',NULL);
/*!40000 ALTER TABLE `sample_material_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_receipt`
--

DROP TABLE IF EXISTS `sample_receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_receipt` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sample_id` bigint(10) unsigned NOT NULL,
  `application_unit` varchar(45) NOT NULL,
  `version` varchar(10) NOT NULL,
  `contract_id` varchar(10) NOT NULL,
  `test_type` tinyint(1) NOT NULL,
  `electronic_media` varchar(45) NOT NULL,
  `software_type` tinyint(1) NOT NULL,
  `receive_unit` varchar(45) NOT NULL,
  `receive_date` date NOT NULL,
  `sender` varchar(20) NOT NULL,
  `receiver` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `sampleId_UNIQUE` (`sample_id`),
  CONSTRAINT `sample_receipt_id` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receipt`
--

LOCK TABLES `sample_receipt` WRITE;
/*!40000 ALTER TABLE `sample_receipt` DISABLE KEYS */;
INSERT INTO `sample_receipt` VALUES (1,'2018-06-25 06:17:54','2018-06-25 06:18:43',2,'阿里巴巴责任有限公司','V1.0','2487955568',0,'光盘1张',1,'南大测试中心 ','2018-06-15','张三','李四'),(2,'2018-07-04 00:58:30','2018-07-04 00:58:30',3,'葫芦娃责任有限公司','V1.0','248794699',3,'光盘1张，硬盘2张',1,'南大测试中心 ','2018-06-21','大娃','二娃');
/*!40000 ALTER TABLE `sample_receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_receipt_material_list`
--

DROP TABLE IF EXISTS `sample_receipt_material_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_receipt_material_list` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `receipt_id` bigint(10) unsigned NOT NULL,
  `material_id` bigint(10) unsigned NOT NULL,
  `material_type` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `receipt_id_idx` (`receipt_id`),
  KEY `material_id_idx` (`material_id`),
  CONSTRAINT `material_id` FOREIGN KEY (`material_id`) REFERENCES `sample_material_list` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `receipt_id` FOREIGN KEY (`receipt_id`) REFERENCES `sample_receipt` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receipt_material_list`
--

LOCK TABLES `sample_receipt_material_list` WRITE;
/*!40000 ALTER TABLE `sample_receipt_material_list` DISABLE KEYS */;
INSERT INTO `sample_receipt_material_list` VALUES (7,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,1,1),(8,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,2,1),(9,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,3,1),(10,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,4,1),(11,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,6,2),(12,'2018-06-25 06:22:12','2018-06-25 06:22:12',1,7,3),(13,'2018-07-04 01:00:06','2018-07-04 01:00:06',2,1,3),(14,'2018-07-04 01:00:06','2018-07-04 01:00:06',2,2,2),(15,'2018-07-04 01:00:06','2018-07-04 01:00:06',2,5,1),(16,'2018-07-04 01:00:06','2018-07-04 01:00:06',2,7,1),(17,'2018-07-04 01:00:06','2018-07-04 01:00:06',2,8,1);
/*!40000 ALTER TABLE `sample_receipt_material_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sample_receive`
--

DROP TABLE IF EXISTS `sample_receive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sample_receive` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sample_id` bigint(10) unsigned NOT NULL,
  `requester` varchar(45) NOT NULL,
  `receiver` varchar(20) NOT NULL,
  `receive_date` date NOT NULL,
  `obtainer` varchar(20) NOT NULL,
  `obtain_date` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sample_id_UNIQUE` (`sample_id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `sample_receive_id` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receive`
--

LOCK TABLES `sample_receive` WRITE;
/*!40000 ALTER TABLE `sample_receive` DISABLE KEYS */;
INSERT INTO `sample_receive` VALUES (1,'2018-06-24 23:33:28','2018-06-24 23:33:28',2,'阿里巴巴责任有限公司','黄四郎','2018-06-10','张麻子','2018-06-15'),(2,'2018-07-01 10:38:11','2018-07-01 10:38:11',1,'百度责任有限公司','天狼','2018-06-10','二罗','2018-06-15'),(4,'2018-07-01 10:39:39','2018-07-01 10:39:39',3,'菜鸟联盟','菜垢','2018-06-10','菜腰','2018-06-15'),(5,'2018-07-03 06:42:37','2018-07-03 07:07:10',8,'天龙公司','X','2018-06-14','Z','2018-06-17'),(6,'2018-07-03 23:36:33','2018-07-03 23:36:33',9,'天龙公司','X','2018-06-14','Y','2018-06-15');
/*!40000 ALTER TABLE `sample_receive` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-13 15:04:40
