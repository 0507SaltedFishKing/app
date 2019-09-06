DROP DATABASE Community_forum;
CREATE DATABASE Community_forum DEFAULT CHARACTER SET utf8;
USE Community_forum;

#帖子类型表
CREATE TABLE forum_type(
	fid INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	fname VARCHAR(10)
);

INSERT INTO forum_type VALUES(NULL,'纯文字帖'),
(NULL,'图文贴'),(NULL,'视频贴'),(NULL,'广告贴');

#帖子表
CREATE TABLE forum(
	ID VARCHAR(255) PRIMARY KEY NOT NULL,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(255) NOT NULL,
	f_type INT NOT NULL,
	userId  VARCHAR(50) NOT NULL,
	likeNum INT NOT NULL,
	commentNum INT NOT NULL,
	`status` INT,
	`keys` TEXT
);

#话题类型表
CREATE TABLE talk_type(
	TID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	tname VARCHAR(10)
);

INSERT INTO talk_type VALUES(NULL,'娱乐'),
(NULL,'搞笑'),(NULL,'情感'),(NULL,'爱好');

#话题表
CREATE TABLE talk(
	ID VARCHAR(255) PRIMARY KEY NOT NULL,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(255) NOT NULL,
	t_type INT NOT NULL,
	userId  VARCHAR(50) NOT NULL,
	likeNum INT NOT NULL,
	commentNum INT NOT NULL,
	`status` INT
);

#点赞记录表
CREATE TABLE like_info(
	ID VARCHAR(255) PRIMARY KEY NOT NULL,
	is_forum INT NOT NULL,
	like_type INT NOT NULL,
	like_user VARCHAR(50) NOT NULL, 
	target_user VARCHAR(50) NOT NULL,
	compose_id  VARCHAR(50) NOT NULL,
	`status` INT NOT NULL
);

#评论表
CREATE TABLE `comment`(
	id VARCHAR(255) PRIMARY KEY NOT NULL,
	is_forum INT NOT NULL,
	compose_id VARCHAR(50) NOT NULL,
	content VARCHAR(255) NOT NULL,
	from_userid VARCHAR(50) NOT NULL,
	likeNum INT NOT NULL,
	`status` INT NOT NULL
);

#回复表
CREATE TABLE reply(
	id VARCHAR(255) PRIMARY KEY NOT NULL,
	comment_id VARCHAR(255) NOT NULL,
	reply_id VARCHAR(255),
	reply_type INT NOT NULL,
	content VARCHAR(255) NOT NULL,
	from_userid VARCHAR(255) NOT NULL,
	to_userid VARCHAR(255) NOT NULL,
	likeNum INT NOT NULL,
	`status` INT NOT NULL
);