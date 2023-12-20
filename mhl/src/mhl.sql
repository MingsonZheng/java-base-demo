-- 创建满汉楼的数据库
CREATE DATABASE mhl
-- 创建表 employee 表 (主键id，empId，name，pwd，job，如果需要可以自已加字段等)
# 用户表
CREATE TABLE employee (
                          id INT PRIMARY KEY AUTO_INCREMENT, #自增
                             empId VARCHAR(50) NOT NULL DEFAULT '', #员工号
                             pwd CHAR(32) NOT NULL DEFAULT '', #密码md5
                             NAME VARCHAR(50) NOT NULL DEFAULT '', #姓名
                             job VARCHAR(50) NOT NULL DEFAULT '' #岗位
)CHARSET=utf8;

# 添加测试数据
INSERT INTO employee VALUES(NULL, '6668612', MD5('123456'), '张三半', '经理');
INSERT INTO employee VALUES(NULL, '6668622', MD5('123456'), '小龙女', '服务员');
INSERT INTO employee VALUES(NULL, '6668633', MD5('123456'), '张无忌', '收银员');
INSERT INTO employee VALUES(NULL, '666666', MD5('123456'), '老郑', '经理');

SELECT * FROM employee;