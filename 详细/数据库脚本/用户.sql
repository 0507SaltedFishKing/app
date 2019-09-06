DROP DATABASE Community_user;
CREATE DATABASE Community_user DEFAULT CHARACTER SET utf8;
USE Community_user;

#用户表
CREATE TABLE users(
	uid VARCHAR(255) PRIMARY KEY NOT NULL,
	usercode VARCHAR(50) NOT NULL,
	`password` VARCHAR(50) NOT NULL,
	uicon VARCHAR(255),
	identity INT NOT NULL,
	nickName VARCHAR(50) NOT NULL, 
	phone VARCHAR(11) NOT NULL,
	autograph VARCHAR(255) NOT NULL,
	gender CHAR(2) NOT NULL,
	score INT NOT NULL,
	like_keys_json TEXT,
	unlike_keys_json TEXT,
	last_logintime DATETIME,
	login_status INT
);

#用户登录日志表
CREATE TABLE users_login_log(
	login_id VARCHAR(255) PRIMARY KEY NOT NULL,
	usercode VARCHAR(50) NOT NULL,
	logintime DATETIME
);

#身份表
CREATE TABLE identity(
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	identity VARCHAR(10)
);

INSERT INTO identity VALUES(NULL,'普通用户'),
(NULL,'帖子审核员'),(NULL,'系统管理员');

#密码123
INSERT INTO users VALUES('2019082714401234','20190827','ac59075b964b0715',NULL,1,'测试用户','12345678989','','男',0,'','',NULL,0);