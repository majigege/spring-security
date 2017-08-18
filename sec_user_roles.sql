/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2017-08-17 15:05:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sec_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `sec_user_roles`;
CREATE TABLE `sec_user_roles` (
  `userId` int(3) NOT NULL,
  `rolesId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sec_user_roles
-- ----------------------------
INSERT INTO `sec_user_roles` VALUES ('1', '2');
INSERT INTO `sec_user_roles` VALUES ('1', '1');
INSERT INTO `sec_user_roles` VALUES ('2', '2');
