-- MySQL dump 10.13  Distrib 5.5.40, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: spree
-- ------------------------------------------------------
-- Server version	5.5.40-0ubuntu0.14.04.1

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
-- Table structure for table `ACCO`
--

DROP TABLE IF EXISTS `ACCO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ACCO` (
  `id` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `inloc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ACCO`
--

LOCK TABLES `ACCO` WRITE;
/*!40000 ALTER TABLE `ACCO` DISABLE KEYS */;
/*!40000 ALTER TABLE `ACCO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ADMIN`
--

DROP TABLE IF EXISTS `ADMIN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ADMIN` (
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ADMIN`
--

LOCK TABLES `ADMIN` WRITE;
/*!40000 ALTER TABLE `ADMIN` DISABLE KEYS */;
/*!40000 ALTER TABLE `ADMIN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BADMINTON`
--

DROP TABLE IF EXISTS `BADMINTON`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BADMINTON` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BADMINTON`
--

LOCK TABLES `BADMINTON` WRITE;
/*!40000 ALTER TABLE `BADMINTON` DISABLE KEYS */;
/*!40000 ALTER TABLE `BADMINTON` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BASKETBALL`
--

DROP TABLE IF EXISTS `BASKETBALL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BASKETBALL` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BASKETBALL`
--

LOCK TABLES `BASKETBALL` WRITE;
/*!40000 ALTER TABLE `BASKETBALL` DISABLE KEYS */;
/*!40000 ALTER TABLE `BASKETBALL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CARROM`
--

DROP TABLE IF EXISTS `CARROM`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CARROM` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CARROM`
--

LOCK TABLES `CARROM` WRITE;
/*!40000 ALTER TABLE `CARROM` DISABLE KEYS */;
/*!40000 ALTER TABLE `CARROM` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CHESS`
--

DROP TABLE IF EXISTS `CHESS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CHESS` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CHESS`
--

LOCK TABLES `CHESS` WRITE;
/*!40000 ALTER TABLE `CHESS` DISABLE KEYS */;
/*!40000 ALTER TABLE `CHESS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CRICKET`
--

DROP TABLE IF EXISTS `CRICKET`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CRICKET` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CRICKET`
--

LOCK TABLES `CRICKET` WRITE;
/*!40000 ALTER TABLE `CRICKET` DISABLE KEYS */;
/*!40000 ALTER TABLE `CRICKET` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FOOTBALL`
--

DROP TABLE IF EXISTS `FOOTBALL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FOOTBALL` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FOOTBALL`
--

LOCK TABLES `FOOTBALL` WRITE;
/*!40000 ALTER TABLE `FOOTBALL` DISABLE KEYS */;
/*!40000 ALTER TABLE `FOOTBALL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NIGHTS`
--

DROP TABLE IF EXISTS `NIGHTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `NIGHTS` (
  `id` int(11) NOT NULL,
  `passID` int(11) NOT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NIGHTS`
--

LOCK TABLES `NIGHTS` WRITE;
/*!40000 ALTER TABLE `NIGHTS` DISABLE KEYS */;
/*!40000 ALTER TABLE `NIGHTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PARTICIPANT`
--

DROP TABLE IF EXISTS `PARTICIPANT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PARTICIPANT` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `acco` varchar(255) DEFAULT NULL,
  `participations` varchar(255) DEFAULT NULL,
  `achievements` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PARTICIPANT`
--

LOCK TABLES `PARTICIPANT` WRITE;
/*!40000 ALTER TABLE `PARTICIPANT` DISABLE KEYS */;
INSERT INTO `PARTICIPANT` VALUES (123,'abc','amnud@nxhs.com','32436678','INSIDE','pass','',' ',' ');
/*!40000 ALTER TABLE `PARTICIPANT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `REGISTRATION`
--

DROP TABLE IF EXISTS `REGISTRATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REGISTRATION` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `acco` varchar(255) DEFAULT NULL,
  `participations` varchar(255) DEFAULT NULL,
  `achievements` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REGISTRATION`
--

LOCK TABLES `REGISTRATION` WRITE;
/*!40000 ALTER TABLE `REGISTRATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `REGISTRATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SPOREG`
--

DROP TABLE IF EXISTS `SPOREG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SPOREG` (
  `sid` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `avail` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SPOREG`
--

LOCK TABLES `SPOREG` WRITE;
/*!40000 ALTER TABLE `SPOREG` DISABLE KEYS */;
/*!40000 ALTER TABLE `SPOREG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TENNIS`
--

DROP TABLE IF EXISTS `TENNIS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TENNIS` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TENNIS`
--

LOCK TABLES `TENNIS` WRITE;
/*!40000 ALTER TABLE `TENNIS` DISABLE KEYS */;
/*!40000 ALTER TABLE `TENNIS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TT`
--

DROP TABLE IF EXISTS `TT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TT` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TT`
--

LOCK TABLES `TT` WRITE;
/*!40000 ALTER TABLE `TT` DISABLE KEYS */;
/*!40000 ALTER TABLE `TT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `VOLLEY`
--

DROP TABLE IF EXISTS `VOLLEY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `VOLLEY` (
  `part` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `fixture` varchar(255) DEFAULT NULL,
  `scores` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `VOLLEY`
--

LOCK TABLES `VOLLEY` WRITE;
/*!40000 ALTER TABLE `VOLLEY` DISABLE KEYS */;
/*!40000 ALTER TABLE `VOLLEY` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-14 22:45:03
