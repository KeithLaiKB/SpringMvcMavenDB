/*
Navicat MySQL Data Transfer

Source Server         : myDatabase
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-09 19:44:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) NOT NULL,
  `incre_teacher_id` int(11) NOT NULL,
  PRIMARY KEY (`course_id`),
  UNIQUE KEY `course_name` (`course_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'java', '1');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT,
  `major_name` varchar(50) NOT NULL,
  PRIMARY KEY (`major_id`),
  UNIQUE KEY `major_name` (`major_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', 'software engineering');
INSERT INTO `major` VALUES ('2', '会计');
INSERT INTO `major` VALUES ('3', '你好吗');
INSERT INTO `major` VALUES ('5', '计算机');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `incre_stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` varchar(20) NOT NULL,
  `stu_name` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  PRIMARY KEY (`incre_stu_id`),
  UNIQUE KEY `stu_id` (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '201430098019', 'keith', 'male');

-- ----------------------------
-- Table structure for studentselectcourse
-- ----------------------------
DROP TABLE IF EXISTS `studentselectcourse`;
CREATE TABLE `studentselectcourse` (
  `incre_id` int(11) NOT NULL AUTO_INCREMENT,
  `incre_stu_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `select_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`incre_id`),
  UNIQUE KEY `uc_studentSelectMajorID` (`incre_stu_id`,`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentselectcourse
-- ----------------------------
INSERT INTO `studentselectcourse` VALUES ('1', '2', '8', '2017-05-02 11:38:55');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `incre_teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` varchar(20) NOT NULL,
  `teacher_name` varchar(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  PRIMARY KEY (`incre_teacher_id`),
  UNIQUE KEY `teacher_id` (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '20143089', 'hala', 'female');
INSERT INTO `teacher` VALUES ('2', '20143082', '青菜', 'female');
INSERT INTO `teacher` VALUES ('3', '201430811', '水果啊', 'male');
INSERT INTO `teacher` VALUES ('4', '2014308212', '一二三四五六七八九十一二三四五六七八九十一二三四五', 'male');
INSERT INTO `teacher` VALUES ('5', '20143081992', '你好啊呀', 'male');
