DROP DATABASE Community_pay;
CREATE DATABASE Community_pay DEFAULT CHARACTER SET utf8;
USE Community_pay;

#订单表
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` VARCHAR(255) NOT NULL COMMENT '主键',
  `userId` VARCHAR(255) DEFAULT NULL,
  `stockId` VARCHAR(255) DEFAULT NULL COMMENT '库存Id',
  `orderNo` VARCHAR(255) DEFAULT NULL COMMENT '订单编号',
  `goodsId` VARCHAR(255) DEFAULT NULL COMMENT '商品Id',
  `num` INT(11) DEFAULT NULL COMMENT '购买量',
  `amount` DECIMAL(5,2) DEFAULT NULL COMMENT '总价',
  `status` INT(1) DEFAULT NULL COMMENT '状态(0：待支付 1：支付成功 2:支付失败)',
  `aliTradeNo` VARCHAR(255) DEFAULT NULL COMMENT '阿里支付交易号',
  `createdTime` DATETIME DEFAULT NULL,
  `updatedTime` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

#交易记录表
DROP TABLE IF EXISTS `trade`;
CREATE TABLE `trade` (
  `id` VARCHAR(255) NOT NULL,
  `orderNo` VARCHAR(255) DEFAULT NULL COMMENT '业务订单号',
  `tradeNo` VARCHAR(255) DEFAULT NULL COMMENT '交易订单号',
  `payMethod` INT(1) DEFAULT NULL COMMENT '(1:支付宝 2:微信)',
  `amount` DECIMAL(10,3) DEFAULT NULL COMMENT '交易金额',
  `createdTime` DATETIME DEFAULT NULL,
  `updatedTime` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;