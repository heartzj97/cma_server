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
-- Table structure for table `certificate`
--

DROP TABLE IF EXISTS `certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `certificate` (
  `id` bigint(10) unsigned NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file_id` varchar(10) NOT NULL,
  `file_name` varchar(45) NOT NULL,
  `file_path` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `file_id_UNIQUE` (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `testing_institution_information`
--

DROP TABLE IF EXISTS `testing_institution_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `testing_institution_information` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `testing_institution_name` varchar(45) NOT NULL,
  `testing_institution_address` varchar(45) NOT NULL,
  `postcode` varchar(6) NOT NULL,
  `fax` varchar(20) NOT NULL,
  `email` varchar(25) NOT NULL,
  `ti_peopel_in_charge` varchar(10) NOT NULL,
  `ti_pic_position` varchar(10) NOT NULL,
  `ti_pic_telephone` varchar(10) NOT NULL,
  `ti_pic_mobilephone` varchar(10) NOT NULL,
  `liaison` varchar(10) NOT NULL,
  `liaison_position` varchar(10) NOT NULL,
  `liaison_telephone` varchar(10) NOT NULL,
  `liaison_mobilephone` varchar(10) NOT NULL,
  `social_credit_code` varchar(10) NOT NULL,
  `legal_entity_belonged_name` varchar(45) NOT NULL,
  `legal_entity_belonged_address` varchar(45) NOT NULL,
  `leb_peopel_in_charge` varchar(10) NOT NULL,
  `leb_pic_position` varchar(10) NOT NULL,
  `leb_pic_telephone` varchar(10) NOT NULL,
  `leb_social_credit_code` varchar(10) NOT NULL,
  `competent_department_name` varchar(10) NOT NULL,
  `competent_department_address` varchar(10) NOT NULL,
  `cd_peopel_in_charge` varchar(10) NOT NULL,
  `cd_pic_position` varchar(10) NOT NULL,
  `cd_pic_telephone` varchar(10) NOT NULL,
  `characteristic` tinyint(1) NOT NULL DEFAULT '0',
  `legal_entity` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testing_institution_information`
--

LOCK TABLES `testing_institution_information` WRITE;
/*!40000 ALTER TABLE `testing_institution_information` DISABLE KEYS */;
INSERT INTO `testing_institution_information` VALUES (1,'2018-07-16 05:29:50','2018-07-16 05:29:50','111111','22222','121300','86-121134589','778899@163.com','傻婆娘','小三','158787878','7898555','李鬼硬','小老婆','1111111','18181818','9898999','在吗小姐姐','搞基么','乔二傻','大傻子','454789666','95588555','乔氏垃圾公司','垃圾街','乔三傻','二傻子','454887777',0,0);
/*!40000 ALTER TABLE `testing_institution_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `testing_institution_resource`
--

DROP TABLE IF EXISTS `testing_institution_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `testing_institution_resource` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `total_number` tinyint(3) NOT NULL,
  `senior_professional_title` tinyint(3) NOT NULL,
  `intermediate_professional_title` tinyint(3) NOT NULL,
  `primary_professional_title` tinyint(3) NOT NULL,
  `fixed_assets` double NOT NULL,
  `equipment_number` tinyint(3) NOT NULL,
  `floor_space` double NOT NULL,
  `stable_area` double NOT NULL,
  `outdoors_area` double NOT NULL,
  `name_and_address` varchar(45) NOT NULL,
  `new_place` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testing_institution_resource`
--

LOCK TABLES `testing_institution_resource` WRITE;
/*!40000 ALTER TABLE `testing_institution_resource` DISABLE KEYS */;
INSERT INTO `testing_institution_resource` VALUES (1,'2018-07-16 05:31:40','2018-07-16 05:32:02',38,38,38,38,38,38,38,38,38,'38','38');
/*!40000 ALTER TABLE `testing_institution_resource` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-16 13:38:21
