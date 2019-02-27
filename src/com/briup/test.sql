/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-02-27 16:16:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hus
-- ----------------------------
DROP TABLE IF EXISTS `hus`;
CREATE TABLE `hus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hus
-- ----------------------------
INSERT INTO `hus` VALUES ('1', 'jake', '100');
INSERT INTO `hus` VALUES ('3', 'kk0', '33');
INSERT INTO `hus` VALUES ('4', 'kk1', '34');
INSERT INTO `hus` VALUES ('5', 'kk2', '35');
INSERT INTO `hus` VALUES ('6', 'kk3', '36');
INSERT INTO `hus` VALUES ('7', 'kk4', '37');
INSERT INTO `hus` VALUES ('8', 'kk5', '38');
INSERT INTO `hus` VALUES ('9', 'kk6', '39');
INSERT INTO `hus` VALUES ('10', 'kk7', '40');
INSERT INTO `hus` VALUES ('11', 'kk8', '41');
INSERT INTO `hus` VALUES ('12', 'kk9', '42');
INSERT INTO `hus` VALUES ('13', 'jake', '34');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id_p` int(11) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  PRIMARY KEY (`id_p`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '恩', '王', '河南', '南阳', '男');
INSERT INTO `person` VALUES ('2', 'tt', 'tt', '河南', '洛阳', '女');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stud_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`stud_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'jane', 'jane@163.com', '2019-02-18', null);
INSERT INTO `student` VALUES ('2', 'kkll', '123@163.com', '2019-02-18', '1221-2223-112');

-- ----------------------------
-- Table structure for stu_course
-- ----------------------------
DROP TABLE IF EXISTS `stu_course`;
CREATE TABLE `stu_course` (
  `stu_id` int(11) NOT NULL DEFAULT '0',
  `cou_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`stu_id`,`cou_id`),
  KEY `cou_id` (`cou_id`),
  CONSTRAINT `stu_course_ibfk_1` FOREIGN KEY (`stu_id`) REFERENCES `s_stu` (`id`),
  CONSTRAINT `stu_course_ibfk_2` FOREIGN KEY (`cou_id`) REFERENCES `s_course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_course
-- ----------------------------
INSERT INTO `stu_course` VALUES ('1', '1');
INSERT INTO `stu_course` VALUES ('1', '2');

-- ----------------------------
-- Table structure for s_course
-- ----------------------------
DROP TABLE IF EXISTS `s_course`;
CREATE TABLE `s_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_course
-- ----------------------------
INSERT INTO `s_course` VALUES ('1', 'java');
INSERT INTO `s_course` VALUES ('2', 'oracle');

-- ----------------------------
-- Table structure for s_order
-- ----------------------------
DROP TABLE IF EXISTS `s_order`;
CREATE TABLE `s_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `s_order_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `s_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_order
-- ----------------------------
INSERT INTO `s_order` VALUES ('1', 'order1', '56', '1');
INSERT INTO `s_order` VALUES ('2', 'order2', '96', '1');
INSERT INTO `s_order` VALUES ('3', 'order3', '89', '1');

-- ----------------------------
-- Table structure for s_stu
-- ----------------------------
DROP TABLE IF EXISTS `s_stu`;
CREATE TABLE `s_stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_stu
-- ----------------------------
INSERT INTO `s_stu` VALUES ('1', 'rose');
INSERT INTO `s_stu` VALUES ('2', 'jake');
INSERT INTO `s_stu` VALUES ('3', 'tom');

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES ('1', 'lisi');

-- ----------------------------
-- Table structure for wife
-- ----------------------------
DROP TABLE IF EXISTS `wife`;
CREATE TABLE `wife` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `hus_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `hus_id` (`hus_id`),
  CONSTRAINT `wife_ibfk_1` FOREIGN KEY (`hus_id`) REFERENCES `hus` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wife
-- ----------------------------
INSERT INTO `wife` VALUES ('1', 'jane', '32', '13');
