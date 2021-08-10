/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : after_service_system

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 10/08/2021 09:47:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sms_admin
-- ----------------------------
DROP TABLE IF EXISTS `sms_admin`;
CREATE TABLE `sms_admin`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `login_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `login_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` int(1) NOT NULL,
  `status` int(1) NOT NULL,
  `create_time` date NOT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_admin
-- ----------------------------
INSERT INTO `sms_admin` VALUES (1, 'chl', '123456789', '陈洪亮', 1, 1, '2021-07-15', '2222');
INSERT INTO `sms_admin` VALUES (2, 'chl2', '123456789', '陈洪龙', 1, 1, '2021-07-15', '2222');

-- ----------------------------
-- Table structure for sms_admin_department
-- ----------------------------
DROP TABLE IF EXISTS `sms_admin_department`;
CREATE TABLE `sms_admin_department`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) NULL DEFAULT NULL,
  `department_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_admin_department
-- ----------------------------
INSERT INTO `sms_admin_department` VALUES (1, 1, 1);
INSERT INTO `sms_admin_department` VALUES (2, 2, 1);

-- ----------------------------
-- Table structure for sms_admin_role
-- ----------------------------
DROP TABLE IF EXISTS `sms_admin_role`;
CREATE TABLE `sms_admin_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_admin_role
-- ----------------------------
INSERT INTO `sms_admin_role` VALUES (1, 1, 1);
INSERT INTO `sms_admin_role` VALUES (2, 1, 2);
INSERT INTO `sms_admin_role` VALUES (3, 2, 3);

-- ----------------------------
-- Table structure for sms_approval_form
-- ----------------------------
DROP TABLE IF EXISTS `sms_approval_form`;
CREATE TABLE `sms_approval_form`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `archive_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_drawing_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gear_case_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `release_date` date NOT NULL,
  `start_warranty_date` date NOT NULL,
  `feedback_info` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `creator_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` date NOT NULL,
  `modifier_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `modify_date` date NOT NULL,
  `attachment_path` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_approval_form
-- ----------------------------
INSERT INTO `sms_approval_form` VALUES (1, '1', '', '', '', '0000-00-00', '0000-00-00', '1111111111111111111111111111111111111111111111111', '1111', '2021-07-16', '111', '2021-07-16', '1111');

-- ----------------------------
-- Table structure for sms_auth
-- ----------------------------
DROP TABLE IF EXISTS `sms_auth`;
CREATE TABLE `sms_auth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_auth
-- ----------------------------
INSERT INTO `sms_auth` VALUES (1, '', '用户模块', NULL);
INSERT INTO `sms_auth` VALUES (2, 'member:delete', '删除', 1);
INSERT INTO `sms_auth` VALUES (3, 'member:get', '查询', 1);
INSERT INTO `sms_auth` VALUES (4, '', '角色模块', NULL);
INSERT INTO `sms_auth` VALUES (5, 'role:delete', '删除', 4);
INSERT INTO `sms_auth` VALUES (6, 'role:get', '查询', 4);
INSERT INTO `sms_auth` VALUES (7, 'member:add', '新增', 1);
INSERT INTO `sms_auth` VALUES (8, 'member:save', '保存', 1);

-- ----------------------------
-- Table structure for sms_client
-- ----------------------------
DROP TABLE IF EXISTS `sms_client`;
CREATE TABLE `sms_client`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `client_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_time` date NOT NULL,
  `note` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_client
-- ----------------------------
INSERT INTO `sms_client` VALUES (1, '陈丹丹', '2021-07-20', NULL);
INSERT INTO `sms_client` VALUES (2, '陈玲玲', '2021-07-20', NULL);
INSERT INTO `sms_client` VALUES (3, '陈等等', '2021-07-20', NULL);
INSERT INTO `sms_client` VALUES (4, '李丹丹', '2021-07-20', NULL);
INSERT INTO `sms_client` VALUES (5, '李津津', '2021-07-20', NULL);

-- ----------------------------
-- Table structure for sms_closed_loop
-- ----------------------------
DROP TABLE IF EXISTS `sms_closed_loop`;
CREATE TABLE `sms_closed_loop`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `repair_cost` float(255, 2) NULL DEFAULT NULL,
  `travel_cost` float(255, 2) NULL DEFAULT NULL,
  `claiming_cost` float(255, 2) NULL DEFAULT NULL,
  `total_cost` float(255, 2) NULL DEFAULT NULL,
  `confirmer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `confirm_date` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_closed_loop
-- ----------------------------

-- ----------------------------
-- Table structure for sms_corrected
-- ----------------------------
DROP TABLE IF EXISTS `sms_corrected`;
CREATE TABLE `sms_corrected`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `responsible_department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `problem_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `solutions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `
attachment_path` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `approver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `approval_date` date NOT NULL,
  `approval_status` int(1) NOT NULL,
  `approval_opinion` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_corrected
-- ----------------------------

-- ----------------------------
-- Table structure for sms_defined
-- ----------------------------
DROP TABLE IF EXISTS `sms_defined`;
CREATE TABLE `sms_defined`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `
responsible_department` int(255) NOT NULL,
  `confirmor_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `comfirm_date` date NOT NULL,
  `approver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `approval_date` date NOT NULL,
  `approval_status` int(255) NOT NULL,
  `approval_opinion` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_defined
-- ----------------------------

-- ----------------------------
-- Table structure for sms_department
-- ----------------------------
DROP TABLE IF EXISTS `sms_department`;
CREATE TABLE `sms_department`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `department_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `department_order` int(10) NOT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_department
-- ----------------------------
INSERT INTO `sms_department` VALUES (1, '设计部', 'sj1000', 3, 'ddddd');
INSERT INTO `sms_department` VALUES (2, '服务科', 'sj1000', 3, 'ddddd');

-- ----------------------------
-- Table structure for sms_gear_case
-- ----------------------------
DROP TABLE IF EXISTS `sms_gear_case`;
CREATE TABLE `sms_gear_case`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `client_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_drawing_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gear_case_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `power` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `velocity_ratio` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `assembly_date` date NOT NULL,
  `release_date` date NOT NULL,
  `wind_field` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `wind_turbine_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `grid_connected_date` date NOT NULL,
  `start_warranty_date` date NOT NULL,
  `quality_problems_note` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_gear_case
-- ----------------------------
INSERT INTO `sms_gear_case` VALUES (1, '陈555', 'D1001', 'g1001', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1001', '2021-07-20', '2021-07-20', NULL);
INSERT INTO `sms_gear_case` VALUES (2, '陈555', 'p1002', 'g1002', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1002', '2021-07-20', '2021-07-20', NULL);
INSERT INTO `sms_gear_case` VALUES (3, '陈555', 'p1003', 'g1003', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1003', '2021-07-20', '2021-07-20', NULL);
INSERT INTO `sms_gear_case` VALUES (4, '陈555', 'p1004', 'g1004', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1004', '2021-07-20', '2021-07-20', NULL);
INSERT INTO `sms_gear_case` VALUES (5, '陈555', 'p1005', 'g1005', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1005', '2021-07-20', '2021-07-20', NULL);
INSERT INTO `sms_gear_case` VALUES (6, '陈555', 'p1006', 'g1006', '50', '20.2', '2021-07-20', '2021-07-20', '厦门', 'w1006', '2021-07-20', '2021-07-20', NULL);

-- ----------------------------
-- Table structure for sms_gear_case_client
-- ----------------------------
DROP TABLE IF EXISTS `sms_gear_case_client`;
CREATE TABLE `sms_gear_case_client`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gear_case_id` int(11) NULL DEFAULT NULL,
  `client_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_gear_case_client
-- ----------------------------
INSERT INTO `sms_gear_case_client` VALUES (1, 1, 1);
INSERT INTO `sms_gear_case_client` VALUES (2, 1, 2);
INSERT INTO `sms_gear_case_client` VALUES (3, 2, 3);

-- ----------------------------
-- Table structure for sms_problem
-- ----------------------------
DROP TABLE IF EXISTS `sms_problem`;
CREATE TABLE `sms_problem`  (
  `id` int(255) NOT NULL,
  `problem_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_problem
-- ----------------------------
INSERT INTO `sms_problem` VALUES (1, '设计问题');
INSERT INTO `sms_problem` VALUES (2, '安装问题');
INSERT INTO `sms_problem` VALUES (3, '制造问题');

-- ----------------------------
-- Table structure for sms_resources
-- ----------------------------
DROP TABLE IF EXISTS `sms_resources`;
CREATE TABLE `sms_resources`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_type` int(1) NOT NULL,
  `resource_icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_link` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_order` int(10) NOT NULL,
  `resource_display` int(1) NOT NULL,
  `note` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_resources
-- ----------------------------

-- ----------------------------
-- Table structure for sms_role
-- ----------------------------
DROP TABLE IF EXISTS `sms_role`;
CREATE TABLE `sms_role`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role_status` int(1) NOT NULL,
  `create_time` date NOT NULL,
  `note` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_role
-- ----------------------------
INSERT INTO `sms_role` VALUES (1, '技术科', '1002', '1', 1, '2021-07-20', NULL);

-- ----------------------------
-- Table structure for sms_role_auth
-- ----------------------------
DROP TABLE IF EXISTS `sms_role_auth`;
CREATE TABLE `sms_role_auth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NULL DEFAULT NULL,
  `auth_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_role_auth
-- ----------------------------
INSERT INTO `sms_role_auth` VALUES (1, 1, 1);
INSERT INTO `sms_role_auth` VALUES (2, 1, 8);
INSERT INTO `sms_role_auth` VALUES (3, 2, 4);
INSERT INTO `sms_role_auth` VALUES (4, 2, 5);

-- ----------------------------
-- Table structure for sms_service_progress
-- ----------------------------
DROP TABLE IF EXISTS `sms_service_progress`;
CREATE TABLE `sms_service_progress`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `service_progress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_service_progress
-- ----------------------------

-- ----------------------------
-- Table structure for sms_service_registration
-- ----------------------------
DROP TABLE IF EXISTS `sms_service_registration`;
CREATE TABLE `sms_service_registration`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `archive_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `client_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `product_drawing_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gear_case_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `release_date` date NOT NULL,
  `start_warranty_date` date NOT NULL,
  `disposer_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dispose_method` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dispose_date` date NOT NULL,
  `error_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `attachment_path` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_service_registration
-- ----------------------------

-- ----------------------------
-- Table structure for sms_uncorrected
-- ----------------------------
DROP TABLE IF EXISTS `sms_uncorrected`;
CREATE TABLE `sms_uncorrected`  (
  `id` int(255) NOT NULL,
  `service_registration_id` int(255) NOT NULL,
  `correct_status` int(1) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_uncorrected
-- ----------------------------

-- ----------------------------
-- Table structure for sms_undefined
-- ----------------------------
DROP TABLE IF EXISTS `sms_undefined`;
CREATE TABLE `sms_undefined`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `refusal_status` int(1) NOT NULL,
  `refusal_reason` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sms_undefined
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
