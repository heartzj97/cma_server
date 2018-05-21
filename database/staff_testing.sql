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
-- Table structure for table `staff_testing`
--

DROP TABLE IF EXISTS `staff_testing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff_testing` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime(6) NOT NULL,
  `modify_time` datetime(6) NOT NULL,
  `name` varchar(20) NOT NULL,
  `time` datetime(6) NOT NULL,
  `content` varchar(5000) NOT NULL,
  `result` varchar(5000) NOT NULL,
  `person` varchar(45) NOT NULL,
  `auditor` varchar(45) DEFAULT NULL,
  `auditTime` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_testing`
--

LOCK TABLES `staff_testing` WRITE;
/*!40000 ALTER TABLE `staff_testing` DISABLE KEYS */;
INSERT INTO `staff_testing` VALUES (1,'2012-01-01 00:00:00.000000','2013-03-03 00:00:00.000000','大白','2013-01-01 00:00:00.000000','hdhdsajda','dawdoiwajdowada','小白',NULL,NULL),(2,'2010-02-02 00:00:00.000000','2013-03-03 00:00:00.000000','大红','2013-01-01 00:00:00.000000','hdhdsajda','dawdoiwajdowada','小明',NULL,NULL);
/*!40000 ALTER TABLE `staff_testing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-19 14:21:33
