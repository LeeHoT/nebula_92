/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Version : 50710
 Source Host           : localhost
 Source Database       : nebula

 Target Server Version : 50710
 File Encoding         : utf-8

 Date: 05/19/2018 23:17:27 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `names`
-- ----------------------------
DROP TABLE IF EXISTS `names`;
CREATE TABLE `names` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `clazz` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `nick` varchar(100) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `phone` varchar(50) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `address` varchar(255) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `icon` int(11) NOT NULL DEFAULT '0',
  `clazz` int(11) NOT NULL DEFAULT '0',
  `company` varchar(255) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `companyAdd` varchar(255) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `college` varchar(255) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `collegeAdd` varchar(255) CHARACTER SET latin1 NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_index` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SET FOREIGN_KEY_CHECKS = 1;
