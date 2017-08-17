/** 人员信息表 **/
CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  loginName varchar(50) DEFAULT NULL COMMENT '登陆名称',
  password varchar(50) DEFAULT NULL COMMENT '密码',
  name varchar(20) DEFAULT NULL COMMENT '姓名',
  sex varchar(1) DEFAULT NULL COMMENT '性别',
  age int(3) DEFAULT NULL COMMENT '年龄',
  entryDate date DEFAULT NULL COMMENT '入职日期',
  image varchar(50) DEFAULT NULL COMMENT '头像',
  TXQQ varchar(20) DEFAULT NULL COMMENT 'TXQQ',
  phone varchar(11) DEFAULT NULL COMMENT '手机号码',
  birthday date DEFAULT NULL COMMENT '生日',
  createTime datetime DEFAULT NULL COMMENT '创建日期',
  updateTime datetime DEFAULT NULL COMMENT '修改日期',
  deptId int(11) DEFAULT NULL COMMENT '部门ID',
  PRIMARY KEY (id)
)
/** 部门信息表 **/
CREATE TABLE department (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  name varchar(20) DEFAULT NULL COMMENT '部门名称',
  code varchar(20) DEFAULT NULL COMMENT '部门编码',
  parentId int(11) DEFAULT NULL COMMENT '上级部门ID',
  PRIMARY KEY (id)
)
/** 考勤记录表 **/
CREATE TABLE attendance_record (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  userId int(11) DEFAULT NULL COMMENT '用户ID',
  attendDate date DEFAULT NULL COMMENT '考勤日期（天）',
  type varchar(1) DEFAULT NULL COMMENT '考勤类型',
  signTime time DEFAULT NULL COMMENT '签到时间',
  signAddress varchar(200) DEFAULT NULL COMMENT '签到地址',
  PRIMARY KEY (id)
)
/** 考勤规则表 **/
CREATE TABLE attendance_rule (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '规则ID',
  punchInAM time DEFAULT NULL COMMENT '上午上班时间',
  punchOutAM time DEFAULT NULL COMMENT '上午下班时间',
  punchInPM time DEFAULT NULL COMMENT '下午上班时间',
  punchOutPM time DEFAULT NULL COMMENT '下午下班时间',
  attendAddress varchar(100) DEFAULT NULL COMMENT '考勤地址',
  PRIMARY KEY (id)
)