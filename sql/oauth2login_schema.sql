CREATE TABLE tb_auth_client
(
  id INT(11) PRIMARY KEY NOT NULL COMMENT '主键' AUTO_INCREMENT,
  client_name VARCHAR(60) NOT NULL COMMENT '客户端名称',
  client_id VARCHAR(60) COMMENT '客户端id',
  client_secret VARCHAR(100) COMMENT '客户端密钥',
  create_user VARCHAR(60) COMMENT '创建人',
  create_time DATETIME COMMENT '创建时间'
);
CREATE TABLE tb_user_base
(
  id INT(11) PRIMARY KEY NOT NULL COMMENT '主键' AUTO_INCREMENT,
  uuid VARCHAR(32) NOT NULL COMMENT '唯一id',
  login_name VARCHAR(60) NOT NULL COMMENT '登录名',
  mobile VARCHAR(11) COMMENT '手机号',
  pwd VARCHAR(60) COMMENT '密码',
  salt VARCHAR(32) COMMENT '加密盐',
  create_user VARCHAR(60) COMMENT '创建人',
  create_time DATETIME COMMENT '创建时间'
);