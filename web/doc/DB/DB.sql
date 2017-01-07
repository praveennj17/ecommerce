/*
SQLyog Community Edition- MySQL GUI v8.2 
MySQL - 5.6.34-log : Database - ziletech
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ziletech` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ziletech`;

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `category` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `price` int(9) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`id`,`category`,`name`,`price`,`description`,`image`) values (1,'Women','Dress',5000,'nice dress','images/h36.jpg'),(2,'women','Beg',3000,'nice beg','images/h1.jpg'),(3,'Women','Watch',6000,'wow nice','images/h16.jpg'),(4,'Women','Briclate',2000,'Amazing ','images/h8.jpg'),(5,'Women','purce',5000,'oh greate','images/h11.jpg'),(6,'women','watch',5000,'nicee','images/h19.jpg'),(7,'women','sandle',6000,'awsam','images/h24.jpg'),(8,'women','chain',4000,'nice one','images/h18.jpg'),(9,'women','frock',5555,'black','images/h31.jpg');
