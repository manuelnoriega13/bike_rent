-- MySQL dump 10.13  Distrib 5.7.24, for Linux (x86_64)
--
-- Host: localhost    Database: bike_rent
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.18.10.1

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
-- Table structure for table `bike_rent`
--

DROP TABLE IF EXISTS `bike_rent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bike_rent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persons_id` int(11) NOT NULL,
  `prices_id` int(11) NOT NULL,
  `total_rent` int(11) NOT NULL,
  `rented` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_bike_rent_Persons_idx` (`persons_id`),
  KEY `fk_bike_rent_Prices1_idx` (`prices_id`),
  CONSTRAINT `fk_bike_rent_Persons` FOREIGN KEY (`persons_id`) REFERENCES `persons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bike_rent_Prices1` FOREIGN KEY (`prices_id`) REFERENCES `prices` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_rent`
--

LOCK TABLES `bike_rent` WRITE;
/*!40000 ALTER TABLE `bike_rent` DISABLE KEYS */;
INSERT INTO `bike_rent` VALUES (1,1,3,8,'2018-12-13'),(2,1,3,8,'2018-12-13'),(3,1,3,8,'2018-12-13'),(4,1,4,8,'2018-12-13'),(5,1,4,1,'2018-12-13'),(6,1,4,7,'2018-12-13');
/*!40000 ALTER TABLE `bike_rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike_rent_has_bikes`
--

DROP TABLE IF EXISTS `bike_rent_has_bikes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bike_rent_has_bikes` (
  `bike_rent_id` int(11) NOT NULL,
  `bikes_id` int(11) NOT NULL,
  PRIMARY KEY (`bike_rent_id`,`bikes_id`),
  KEY `fk_bike_rent_has_bikes_bikes1_idx` (`bikes_id`),
  KEY `fk_bike_rent_has_bikes_bike_rent1_idx` (`bike_rent_id`),
  CONSTRAINT `fk_bike_rent_has_bikes_bike_rent1` FOREIGN KEY (`bike_rent_id`) REFERENCES `bike_rent` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bike_rent_has_bikes_bikes1` FOREIGN KEY (`bikes_id`) REFERENCES `bikes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_rent_has_bikes`
--

LOCK TABLES `bike_rent_has_bikes` WRITE;
/*!40000 ALTER TABLE `bike_rent_has_bikes` DISABLE KEYS */;
INSERT INTO `bike_rent_has_bikes` VALUES (4,1),(5,1),(6,1),(4,2),(5,2),(6,2),(4,3),(5,3),(6,3),(4,4),(5,4),(6,4),(4,5),(5,5),(6,5),(4,6),(5,6),(6,6),(4,7),(5,7),(6,7),(4,8),(5,8),(6,8),(4,9),(5,9),(6,9),(4,10),(5,10),(6,10),(4,11),(5,11),(6,11),(4,12),(5,12),(6,12),(1,13),(4,13),(5,13),(6,13),(1,14),(4,14),(5,14),(6,14),(1,15),(4,15),(5,15),(6,15),(2,16),(4,16),(5,16),(6,16),(2,17),(4,17),(5,17),(6,17),(2,18),(4,18),(5,18),(6,18),(3,19),(4,19),(5,19),(6,19),(4,20),(5,20),(6,20),(4,21),(5,21),(6,21);
/*!40000 ALTER TABLE `bike_rent_has_bikes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bikes`
--

DROP TABLE IF EXISTS `bikes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bikes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bikes`
--

LOCK TABLES `bikes` WRITE;
/*!40000 ALTER TABLE `bikes` DISABLE KEYS */;
INSERT INTO `bikes` VALUES (1,'bike b'),(2,'bike c'),(3,'bike d'),(4,'bike b'),(5,'bike c'),(6,'bike d'),(7,'bike b'),(8,'bike c'),(9,'bike d'),(10,'bike b'),(11,'bike c'),(12,'bike d'),(13,'bike b'),(14,'bike c'),(15,'bike d'),(16,'bike b'),(17,'bike c'),(18,'bike d'),(19,'bike b'),(20,'bike c'),(21,'bike d');
/*!40000 ALTER TABLE `bikes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `direction` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'manuel','+58112546','dir a');
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prices`
--

DROP TABLE IF EXISTS `prices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL,
  `value` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prices`
--

LOCK TABLES `prices` WRITE;
/*!40000 ALTER TABLE `prices` DISABLE KEYS */;
INSERT INTO `prices` VALUES (3,'hour',5),(4,'day',20),(5,'week',60);
/*!40000 ALTER TABLE `prices` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-14  0:23:02
