CREATE TABLE `tb_user_base` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uuid` varchar(32) NOT NULL COMMENT '唯一id',
  `login_name` varchar(60) NOT NULL COMMENT '登录名',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机号',
  `pwd` varchar(60) DEFAULT NULL COMMENT '密码',
  `create_user` varchar(60) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8