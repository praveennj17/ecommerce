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

--8/12/17 @Nagendra
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `useridfk` int(11) DEFAULT NULL,
  `productidfk` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--8/12/17 @Sunil

CREATE TABLE `cart_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cart_id` INT NULL,
  `product_id` INT NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));

ALTER TABLE `user`
ADD COLUMN `cart_id` INT NULL AFTER `password`;

--10/01/17 @yulti
ALTER TABLE `cart` DROP COLUMN `useridfk`, DROP COLUMN `productidfk`,    CHANGE `quantity` `name` VARCHAR(255) NULL ;








