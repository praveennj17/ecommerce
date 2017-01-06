/*
SQLyog Community Edition- MySQL GUI v8.2 
MySQL - 5.7.16-log : Database - ziletech
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

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;



/*Table structure for table `admin_login` */

DROP TABLE IF EXISTS `admin_login`;

CREATE TABLE `admin_login` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(40) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admin_login` */

insert  into `admin_login`(`id`,`adminName`,`password`) values (1,'admin','admin');

/*Table structure for table `order_table` */

DROP TABLE IF EXISTS `order_table`;

CREATE TABLE `order_table` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `product` mediumtext,
  `order_date` mediumtext,
  `shiping` mediumtext,
  `payment` mediumtext,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_table` */

/*Table structure for table `product_table` */

DROP TABLE IF EXISTS `product_table`;

CREATE TABLE `product_table` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `category` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `price` varchar(50) DEFAULT NULL,
  `description` varchar(400) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `product_table` */

insert  into `product_table`(`id`,`category`,`name`,`price`,`description`) values (12,'f','ysrt','tyht','ttt'),(13,'f','ysrt','tyht','ttt'),(14,'f','ysrt','tyht','ttt'),(15,'f','ysrt','tyht','ttt'),(16,'s','sd','sd','sd');

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `registration` */

insert  into `registration`(`id`,`email`,`username`,`password`) values (1,'askjbf','nag','skjfn'),(2,'a','a','a'),(3,'ad@','ad','adddad'),(4,'ad@','ad','ad');


