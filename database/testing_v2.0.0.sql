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
/*!50003 DROP PROCEDURE IF EXISTS `generate` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `generate`(IN num INT)
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
				VALUES (getRandCharacter(size1), getRandCharacter(size2), getRandCharacter(size2), FLOOR(1 + RAND() * 2), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), rdate, FLOOR(1 + RAND() * 50) );
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
				VALUES (getRandCharacter(size1), getRandCharacter(size2), getRandCharacter(size2), FLOOR(1 + RAND() * 2), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), getRandCharacter(size2), rdate, FLOOR(1 + RAND() * 50) );
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

-- Dump completed on 2018-07-21  9:39:55
