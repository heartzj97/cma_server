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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `annual_training_plan`
--

LOCK TABLES `annual_training_plan` WRITE;
/*!40000 ALTER TABLE `annual_training_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `annual_training_plan` ENABLE KEYS */;
UNLOCK TABLES;

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
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
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
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `plan_id_idx` (`plan_id`),
  CONSTRAINT `plan_id` FOREIGN KEY (`plan_id`) REFERENCES `capacity_verification_plan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
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
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `project_id_UNIQUE` (`project_id`),
  KEY `project_id_idx` (`project_id`),
  CONSTRAINT `project_id` FOREIGN KEY (`project_id`) REFERENCES `capacity_verification_project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacity_verification_record`
--

LOCK TABLES `capacity_verification_record` WRITE;
/*!40000 ALTER TABLE `capacity_verification_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `capacity_verification_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificate`
--

DROP TABLE IF EXISTS `certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `certificate` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file_name` varchar(120) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `cpu` varchar(45) DEFAULT NULL,
  `memory` varchar(45) DEFAULT NULL,
  `hard_disk` varchar(45) DEFAULT NULL,
  `application` varchar(45) DEFAULT NULL,
  `state` tinyint(1) DEFAULT '0',
  `equipment_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `equipment_number_UNIQUE` (`equipment_number`)
) ENGINE=InnoDB AUTO_INCREMENT=10001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment`
--

LOCK TABLES `equipment` WRITE;
/*!40000 ALTER TABLE `equipment` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment_application`
--

DROP TABLE IF EXISTS `equipment_application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_application` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `applicant` varchar(45) DEFAULT NULL,
  `application_date` date DEFAULT NULL,
  `application_purpose` varchar(500) DEFAULT NULL,
  `equipment_use` tinyint(2) DEFAULT NULL,
  `equipment_number` varchar(45) DEFAULT NULL,
  `software_info` varchar(500) DEFAULT NULL,
  `auditor` varchar(45) DEFAULT NULL,
  `audit_date` date DEFAULT NULL,
  `audit_opinion` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_application`
--

LOCK TABLES `equipment_application` WRITE;
/*!40000 ALTER TABLE `equipment_application` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment_application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment_maintenance`
--

DROP TABLE IF EXISTS `equipment_maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_maintenance` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `equipment_id` bigint(10) unsigned DEFAULT NULL,
  `maintenance_date` date DEFAULT NULL,
  `maintenance_content` varchar(500) DEFAULT NULL,
  `maintenance_person` varchar(45) DEFAULT NULL,
  `confirmer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `maintenance_equipment_id_idx` (`equipment_id`),
  CONSTRAINT `maintenance_equipment_id` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_maintenance`
--

LOCK TABLES `equipment_maintenance` WRITE;
/*!40000 ALTER TABLE `equipment_maintenance` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment_maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment_receive`
--

DROP TABLE IF EXISTS `equipment_receive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_receive` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `manufacturer` varchar(45) DEFAULT NULL,
  `receive_situation` varchar(45) DEFAULT NULL,
  `recipient` varchar(45) DEFAULT NULL,
  `receive_date` date DEFAULT NULL,
  `equipment_situation` varchar(45) DEFAULT NULL,
  `acceptance` varchar(45) DEFAULT NULL,
  `acceptance_person` varchar(45) DEFAULT NULL,
  `acceptance_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_receive`
--

LOCK TABLES `equipment_receive` WRITE;
/*!40000 ALTER TABLE `equipment_receive` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment_receive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment_receive_attachment`
--

DROP TABLE IF EXISTS `equipment_receive_attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_receive_attachment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) NOT NULL,
  `receive_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `equipment_receive_foreign_id_idx` (`receive_id`),
  CONSTRAINT `equipment_receive_foreign_id` FOREIGN KEY (`receive_id`) REFERENCES `equipment_receive` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_receive_attachment`
--

LOCK TABLES `equipment_receive_attachment` WRITE;
/*!40000 ALTER TABLE `equipment_receive_attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment_receive_attachment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipment_use`
--

DROP TABLE IF EXISTS `equipment_use`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipment_use` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `equipment_id` bigint(10) unsigned DEFAULT NULL,
  `use_date` date DEFAULT NULL,
  `open_date` time DEFAULT NULL,
  `close_date` time DEFAULT NULL,
  `sample_number` varchar(45) DEFAULT NULL,
  `test_project` varchar(45) DEFAULT NULL,
  `before_use` varchar(45) DEFAULT NULL,
  `after_use` varchar(45) DEFAULT NULL,
  `user` varchar(45) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `use_equipment_id_idx` (`equipment_id`),
  CONSTRAINT `equipment_use_foreign_key` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipment_use`
--

LOCK TABLES `equipment_use` WRITE;
/*!40000 ALTER TABLE `equipment_use` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipment_use` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_review_document`
--

DROP TABLE IF EXISTS `external_review_document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_review_document` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(10) unsigned NOT NULL,
  `file_name` varchar(80) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `file_foreign_key_idx` (`year`),
  CONSTRAINT `file_foreign_key` FOREIGN KEY (`year`) REFERENCES `external_review_management` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_review_document`
--

LOCK TABLES `external_review_document` WRITE;
/*!40000 ALTER TABLE `external_review_document` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_review_document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_review_management`
--

DROP TABLE IF EXISTS `external_review_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_review_management` (
  `id` bigint(10) unsigned NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_review_management`
--

LOCK TABLES `external_review_management` WRITE;
/*!40000 ALTER TABLE `external_review_management` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_review_management` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intermediate_checks_plan`
--

LOCK TABLES `intermediate_checks_plan` WRITE;
/*!40000 ALTER TABLE `intermediate_checks_plan` DISABLE KEYS */;
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
  UNIQUE KEY `plan_id_UNIQUE` (`plan_id`),
  KEY `check_plan_id_idx` (`plan_id`),
  CONSTRAINT `check_plan_id` FOREIGN KEY (`plan_id`) REFERENCES `intermediate_checks_plan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intermediate_checks_record`
--

LOCK TABLES `intermediate_checks_record` WRITE;
/*!40000 ALTER TABLE `intermediate_checks_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `intermediate_checks_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `internal_audit_management`
--

DROP TABLE IF EXISTS `internal_audit_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `internal_audit_management` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(10) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `internal_audit_management`
--

LOCK TABLES `internal_audit_management` WRITE;
/*!40000 ALTER TABLE `internal_audit_management` DISABLE KEYS */;
/*!40000 ALTER TABLE `internal_audit_management` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `internal_audit_management_file`
--

DROP TABLE IF EXISTS `internal_audit_management_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `internal_audit_management_file` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(10) NOT NULL,
  `file_name` varchar(45) NOT NULL,
  `file` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `file_name_UNIQUE` (`file_name`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `internal_audit_management_file`
--

LOCK TABLES `internal_audit_management_file` WRITE;
/*!40000 ALTER TABLE `internal_audit_management_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `internal_audit_management_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_review`
--

DROP TABLE IF EXISTS `management_review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `management_review` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(10) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_review`
--

LOCK TABLES `management_review` WRITE;
/*!40000 ALTER TABLE `management_review` DISABLE KEYS */;
/*!40000 ALTER TABLE `management_review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `management_review_file`
--

DROP TABLE IF EXISTS `management_review_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `management_review_file` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `year` bigint(10) NOT NULL,
  `file_name` varchar(45) NOT NULL,
  `file` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `file_Name_UNIQUE` (`file_name`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `management_review_file`
--

LOCK TABLES `management_review_file` WRITE;
/*!40000 ALTER TABLE `management_review_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `management_review_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operating_instruction`
--

DROP TABLE IF EXISTS `operating_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operating_instruction` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file` varchar(45) DEFAULT NULL,
  `file_name` varchar(45) DEFAULT NULL,
  `file_id` varchar(45) DEFAULT NULL,
  `state` tinyint(2) DEFAULT '0',
  `current` tinyint(1) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modifier` varchar(45) DEFAULT NULL,
  `modify_content` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operating_instruction`
--

LOCK TABLES `operating_instruction` WRITE;
/*!40000 ALTER TABLE `operating_instruction` DISABLE KEYS */;
/*!40000 ALTER TABLE `operating_instruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `program_file`
--

DROP TABLE IF EXISTS `program_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `program_file` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file` varchar(45) DEFAULT NULL,
  `file_name` varchar(45) DEFAULT NULL,
  `file_id` varchar(45) DEFAULT NULL,
  `state` tinyint(2) DEFAULT '0',
  `current` tinyint(1) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modifier` varchar(45) DEFAULT NULL,
  `modify_content` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `program_file`
--

LOCK TABLES `program_file` WRITE;
/*!40000 ALTER TABLE `program_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `program_file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quality_manual`
--

DROP TABLE IF EXISTS `quality_manual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quality_manual` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file` varchar(45) DEFAULT NULL,
  `file_name` varchar(45) DEFAULT NULL,
  `file_id` varchar(45) DEFAULT NULL,
  `state` tinyint(2) DEFAULT '0',
  `current` tinyint(1) DEFAULT NULL,
  `modify_date` date DEFAULT NULL,
  `modifier` varchar(45) DEFAULT NULL,
  `modify_content` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quality_manual`
--

LOCK TABLES `quality_manual` WRITE;
/*!40000 ALTER TABLE `quality_manual` DISABLE KEYS */;
/*!40000 ALTER TABLE `quality_manual` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample`
--

LOCK TABLES `sample` WRITE;
/*!40000 ALTER TABLE `sample` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_io`
--

LOCK TABLES `sample_io` WRITE;
/*!40000 ALTER TABLE `sample_io` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_material_list`
--

LOCK TABLES `sample_material_list` WRITE;
/*!40000 ALTER TABLE `sample_material_list` DISABLE KEYS */;
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
  CONSTRAINT `sample_receipt_id` FOREIGN KEY (`sample_id`) REFERENCES `sample` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receipt`
--

LOCK TABLES `sample_receipt` WRITE;
/*!40000 ALTER TABLE `sample_receipt` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=195 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receipt_material_list`
--

LOCK TABLES `sample_receipt_material_list` WRITE;
/*!40000 ALTER TABLE `sample_receipt_material_list` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sample_receive`
--

LOCK TABLES `sample_receive` WRITE;
/*!40000 ALTER TABLE `sample_receive` DISABLE KEYS */;
/*!40000 ALTER TABLE `sample_receive` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `self_inspection`
--

DROP TABLE IF EXISTS `self_inspection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `self_inspection` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(45) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `self_inspection`
--

LOCK TABLES `self_inspection` WRITE;
/*!40000 ALTER TABLE `self_inspection` DISABLE KEYS */;
/*!40000 ALTER TABLE `self_inspection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `self_inspection_file`
--

DROP TABLE IF EXISTS `self_inspection_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `self_inspection_file` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `self_inspection_id` bigint(20) unsigned NOT NULL,
  `file_name` varchar(45) NOT NULL,
  `file` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `file_name_UNIQUE` (`file_name`),
  KEY `self_inspection_id_idx` (`self_inspection_id`),
  CONSTRAINT `self_inspection_id` FOREIGN KEY (`self_inspection_id`) REFERENCES `self_inspection` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `self_inspection_file`
--

LOCK TABLES `self_inspection_file` WRITE;
/*!40000 ALTER TABLE `self_inspection_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `self_inspection_file` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_authorization`
--

LOCK TABLES `staff_authorization` WRITE;
/*!40000 ALTER TABLE `staff_authorization` DISABLE KEYS */;
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
  `user_id` bigint(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `file_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_file`
--

LOCK TABLES `staff_file` WRITE;
/*!40000 ALTER TABLE `staff_file` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff_training_result`
--

LOCK TABLES `staff_training_result` WRITE;
/*!40000 ALTER TABLE `staff_training_result` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff_training_result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `standard_management`
--

DROP TABLE IF EXISTS `standard_management`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `standard_management` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `standard_management`
--

LOCK TABLES `standard_management` WRITE;
/*!40000 ALTER TABLE `standard_management` DISABLE KEYS */;
/*!40000 ALTER TABLE `standard_management` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision`
--

LOCK TABLES `supervision` WRITE;
/*!40000 ALTER TABLE `supervision` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_plan`
--

LOCK TABLES `supervision_plan` WRITE;
/*!40000 ALTER TABLE `supervision_plan` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supervision_record`
--

LOCK TABLES `supervision_record` WRITE;
/*!40000 ALTER TABLE `supervision_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `supervision_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_ability`
--

DROP TABLE IF EXISTS `test_ability`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_ability` (
  `id` bigint(10) unsigned NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `file_name` varchar(45) DEFAULT NULL,
  `file` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_ability`
--

LOCK TABLES `test_ability` WRITE;
/*!40000 ALTER TABLE `test_ability` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_ability` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_item`
--

DROP TABLE IF EXISTS `test_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_item` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `production_name` varchar(45) DEFAULT NULL,
  `ability` varchar(45) DEFAULT NULL,
  `referrence` varchar(45) DEFAULT NULL,
  `year` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_item`
--

LOCK TABLES `test_item` WRITE;
/*!40000 ALTER TABLE `test_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_item` ENABLE KEYS */;
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
  `ti_pic_position` varchar(100) NOT NULL,
  `ti_pic_telephone` varchar(15) NOT NULL,
  `ti_pic_mobilephone` varchar(15) NOT NULL,
  `liaison` varchar(10) NOT NULL,
  `liaison_position` varchar(100) NOT NULL,
  `liaison_telephone` varchar(15) NOT NULL,
  `liaison_mobilephone` varchar(15) NOT NULL,
  `social_credit_code` varchar(100) NOT NULL,
  `legal_entity_belonged_name` varchar(100) NOT NULL,
  `legal_entity_belonged_address` varchar(100) NOT NULL,
  `leb_peopel_in_charge` varchar(10) NOT NULL,
  `leb_pic_position` varchar(100) NOT NULL,
  `leb_pic_telephone` varchar(15) NOT NULL,
  `leb_social_credit_code` varchar(100) NOT NULL,
  `competent_department_name` varchar(10) NOT NULL,
  `competent_department_address` varchar(100) NOT NULL,
  `cd_peopel_in_charge` varchar(10) NOT NULL,
  `cd_pic_position` varchar(100) NOT NULL,
  `cd_pic_telephone` varchar(15) NOT NULL,
  `characteristic` tinyint(1) NOT NULL DEFAULT '0',
  `legal_entity` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testing_institution_information`
--

LOCK TABLES `testing_institution_information` WRITE;
/*!40000 ALTER TABLE `testing_institution_information` DISABLE KEYS */;
INSERT INTO `testing_institution_information` VALUES (1,'2018-07-21 00:04:38','2018-07-21 00:04:46','afsdf af ','afsdfs d f','810100','ssf','sefsfes','sfesfeffff','fffffff','fgjiji','jinin','niiuubuib','bubuib','bubuib','ubuibi','buibuib','ubiubi','buibiub','bubiub','biubuibi','bubibui','buiibiubiu','buibiubi','bubibui','iubuibiu','buibiubiu','buibibi',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `testing_institution_resource`
--

LOCK TABLES `testing_institution_resource` WRITE;
/*!40000 ALTER TABLE `testing_institution_resource` DISABLE KEYS */;
INSERT INTO `testing_institution_resource` VALUES (1,'2018-07-21 00:05:56','2018-07-21 00:06:01',121,12,12,12,12,12,12,12,12,'12','12');
/*!40000 ALTER TABLE `testing_institution_resource` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_application`
--

LOCK TABLES `training_application` WRITE;
/*!40000 ALTER TABLE `training_application` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=10001 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'cma'
--
/*!50003 DROP FUNCTION IF EXISTS `getRandCharacter` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `getRandCharacter`(num INT) RETURNS varchar(255) CHARSET utf8
    DETERMINISTIC
BEGIN
	DECLARE charact varchar(2056) DEFAULT '赵钱孙李周郑王冯陈楮卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷黎昕远航旭尧鸿涛伟祺轩越泽浩宇瑾瑜皓轩擎苍擎宇志泽睿渊楷瑞轩弘文哲瀚雨泽鑫磊梦琪忆之桃慕青问兰尔岚元香初夏沛菡傲珊曼文乐菱痴珊恨玉惜文香寒新柔语蓉海安夜蓉涵柏水桃醉蓝春儿语琴从彤傲晴语兰又菱碧彤元霜怜梦紫寒妙彤曼易南莲紫翠雨寒易烟如萱若南寻真晓亦向珊慕灵以蕊寻雁映易雪柳孤岚笑霜海云凝天沛珊寒云冰旋宛儿绿真盼儿晓霜碧凡夏菡曼香若烟半梦雅绿冰蓝灵槐平安书翠翠风香巧代云梦曼幼翠友巧听寒梦柏醉易访旋亦玉凌萱访卉怀亦笑蓝春翠靖柏夜蕾冰夏梦松书雪乐枫念薇靖雁寻春恨山从寒忆香觅波静曼凡旋以亦念露芷蕾千兰新波代真新蕾雁玉冷卉紫山千琴恨天傲芙盼山怀蝶冰兰山柏翠萱乐丹翠柔谷山之瑶冰露尔珍谷雪乐萱涵菡海莲傲蕾青槐冬儿易梦惜雪宛海之柔夏青亦瑶妙菡春竹修杰伟诚建辉晋鹏天磊绍辉泽洋明轩健柏煊昊强伟宸博超君浩子骞明辉鹏涛炎彬鹤轩越彬风华靖琪明诚高格光华国源宇晗昱涵润翰飞翰海昊乾浩博和安弘博鸿朗华奥华灿嘉慕坚秉建明金鑫锦程瑾瑜鹏经赋景同靖琪君昊俊明季同开济凯安康成乐语力勤良哲理群茂彦敏博明达朋义彭泽鹏举濮存溥心璞瑜浦泽奇邃祥荣轩';
	DECLARE l_charact int DEFAULT LENGTH(charact) / 3;
    DECLARE return_char varchar(255) DEFAULT '';
    DECLARE i INT DEFAULT 0;
    WHILE i < num DO 
		SET return_char = CONCAT(return_CHAR, SUBSTRING(charact, FLOOR(1 + RAND() * l_charact), 1));
        SET i = i + 1; 
	END WHILE;
RETURN return_char;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `generate_supervision` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `generate_supervision`(IN num INT)
BEGIN
	DECLARE i INT DEFAULT 1;
    DECLARE size1 int;
    DECLARE size2 int;
	WHILE i <= num DO 
        SET size1 = FLOOR(1 + RAND() * 45);
        SET size2 = FLOOR(1 + RAND() * 45);
		INSERT INTO equipment (name, model, cpu, memory, hard_disk, application, state, equipment_number)
				VALUES (getRandCharacter(size1), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size1), getRandCharacter(size2), getRandCharacter(size1), (FLOOR(1 + RAND() * 2) - 1), FLOOR(10000 + RAND() * 1000000));
        SET i = i + 1;
    END WHILE;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `generate_user` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `generate_user`(IN num INT)
BEGIN
	DECLARE i INT DEFAULT 1;
    DECLARE size1 int;
    DECLARE size2 int; 
    DECLARE rdate DATE;
	WHILE i <= num DO 
		SET size1 = FLOOR(1 + RAND() * 5);
        SET size2 = FLOOR(1 + RAND() * 45);
        SET rdate = CONCAT(FLOOR(1990 + (RAND() * 25)), '-', LPAD(FLOOR(1 + (RAND() * 12)), 2, 0), '-', LPAD(FLOOR(3 + (RAND() * 8)), 2, 0));
		INSERT INTO user (name, department, position, gender, title, degree, graduation_school, graduation_major, graduation_date, working_years) 
				VALUES (getRandCharacter(size1), getRandCharacter(size2), getRandCharacter(size2), (FLOOR(1 + RAND() * 2) - 1), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), rdate, FLOOR(1 + RAND() * 50) );

        SET i = i + 1;
    END WHILE;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-22  9:02:06
