-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: Blackboard
-- ------------------------------------------------------
-- Server version	5.7.11
use ratemycourse;

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
-- Table structure for table `Course`
--

DROP TABLE IF EXISTS `Course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Course` (
  `CourseId` varchar(45) NOT NULL,
  `CourseName` varchar(45) NOT NULL,
  `Professor` varchar(45) NOT NULL,
  `Description` varchar(300) NOT NULL,
  PRIMARY KEY (`CourseName`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Course`
--

LOCK TABLES `Course` WRITE;
/*!40000 ALTER TABLE `Course` DISABLE KEYS */;
INSERT INTO `Course` VALUES ('CSCI1121',' Introduction to C Programming','KK','Structured programming with the C language. Control structures. Data types. Use of pointers. Matrix manipulation to solve simultaneous equations. External subroutines for mathematical and graphical applications. Introduction to C> Complex number representation.'),('CSCI1021',' Introduction to Computers and the Internet','DD','Survey of computers and languages. Introduction to computer programming. History of computing and networking. The effects of computing and the Internet on our lives. E-commerce and new technologies. '),('CSCI1023',' Introduction to Web Software Development','FF','Introduction to the Internet. Topics include address and URL to find your way, linking to a URL, HTML and web programming, building a web page, building a home page, client-server techniques. '),('CSCI1112','Algorithms and Data Structures','JJ','Object-oriented software. Inheritance, exceptions, development of classes, event-driven programming. Data structures such as trees, lists, stacks, queues, and strings. Sorting and searching.'),('CSCI1020','Applications Software','CC','Introduction to the use of microcomputer hardware and software for word processing, spreadsheets , and database management , with emphasis on the use of computers to solve typical problems in academia and business.'),('CSCI1010','Computer Science Orientation','AA','Introduction to the field of computer science. Basic and emerging concepts and applications of computer science. Hands-on experiments and team projects. Technical resources, professional ethics, writing, and presentation. '),('CSCI1132','Data Structures and Software Design','MM','Data structures such as trees, lists, stacks, queues, and strings. Big-O notation and introduction to algorithm performance analysis. Solutions of numerical and non-numerical problems. Use of I/O libraries.'),('CSCI1041','Introduction to FORTRAN Programming','HH','Structured programming with high-level language using FORTRAN. Control structures. Different data types with emphasis on real and complex number computations. '),('CSCI1022','Introduction to Internet Technology','EE','An introductory course for non-technical students who wish to obtain a better understanding of the hardware and software that comprise the Internet. '),('CSCI1131','Introduction to Programming with C','LL','Intensive introductory course for students with a science, mathematics, or other quantitative background. Solution of numerical and nonnumerical problems on a digital computer using C programming language in a Unix environment. '),('CSCI1011','Introduction to Programming with Java','BB','An introductory course in programming a computer, using the Java language. Object-oriented programming, classes, applets, methods, control structures, inheritance, overriding, GUI widgets, containers, and exceptions.'),('CSCI1111','Introduction to Software Development','II','Introduction to the solution of problems on a digital computer using the Java language. Object-oriented programming concepts; documentation techniques; design of test data.'),('CSCI1030','Technology and Society','GG','Historical, social, and ethical issues of the technological age. Ethical principles and skills and social analysis skills needed to evaluate the design and implementation of complex computer systems.');
/*!40000 ALTER TABLE `Course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `UserId` int(11) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `University` varchar(45) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'A','123','1@1.com','AA'),(2,'B','321','2@2.com','BB');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserComments`
--

DROP TABLE IF EXISTS `UserComments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserComments` (
  `UserId` int(11) NOT NULL,
  `Comments` varchar(45) NOT NULL,
  `CourseId` int(11) NOT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserComments`
--

LOCK TABLES `UserComments` WRITE;
/*!40000 ALTER TABLE `UserComments` DISABLE KEYS */;
/*!40000 ALTER TABLE `UserComments` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-28 15:22:51
