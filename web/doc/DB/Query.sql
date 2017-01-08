-- 30/12/16 @Nagendra
ALTER TABLE `address`     ADD COLUMN `street_number` VARCHAR(255) NULL AFTER `zip`;

--6/12/17 @Sunil
CREATE TABLE `user` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
);

--7/12/17 @Sunil
insert  into user (email, username, password )  values ("admin@ziletech.com", "admin", "admin");
