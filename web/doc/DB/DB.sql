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

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `registration` */

insert  into `registration`(`id`,`email`,`username`,`password`) values (1,'askjbf','nag','skjfn');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
