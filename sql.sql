drop table if exit tb_user;
create table tb_user(
	id int(11) not null auto_increment,
	name varchar(32) not null,
	password varchar(32) not null ,
	nickName varchar(32) default null,
	synopsis varchar (128) default null comment '简介',
	sex ENUM('1','2','0') default '0' comment '1男2女0保密',
	phone char(11) default null,
	email varchar(32) default null,
	createTime timestamp not null comment '创建时间',
	lastActive timestamp not null comment '最后活跃时间',
	roleIds varchar(128) default null comment '权限id集，以半角逗号分隔',
	header varchar(128) default null comment '头像路径',
	mark int(11) default 0,
	primary key (id),
	unique key name(name) using btree,
	unique key phone(phone) using btree,
	unique key email(email) using btree
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;

drop table if exit tb_label;
create table tb_label(
	id int(11) not null auto_increment,
	name varchar(32) not null,
	blogids varchar(128) comment '博客id集，以半角逗号分隔',
	primary key (id),
	mark int(32) default 0 comment '状态',
	unique key name(name) using btree
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 COMMENT='标签';

drop table if exit tb_blog;

create table tb_blog(
	id int(11) not null auto_increment,
	userId int(11) not null,
	userHeader varchar(128) comment '数据冗余，用户头像路径',
	userName varchar(32) comment '数据冗余，用户名',
	userNickName varchar(32) comment '数据冗余，用户你昵称',
	createTime datetime  comment '创建时间',
	lastModifyDate datetime comment '最后修改时间',
	title varchar(128) not null comment '标题',
	content text not null comment '内容',
	commentNum int(11) default 0 comment '冗余数据，评论数',
	praiseNum int(11) default 0 comment '冗余数据，点赞数',
	collectNum int(11) default 0  comment '冗余数据，收藏数',
	readNum int (11) default 0  comment '冗余数据，阅读数',
	labelStrs varchar(256) comment '标签json形式，数据冗余',
	mark int(32) default 0 comment '状态',
	primary key (id)
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 COMMENT='博文';



drop table if exit tb_comment;
create table tb_comment(
	id int(11) not null auto_increment,
	blogId int(11) not null comment '评论的博文id集，以半角逗号分隔',
	userHeader varchar(128) comment '数据冗余，用户头像路径',
	userName varchar(32) comment '数据冗余，用户名',
	userNickName varchar(32) comment '数据冗余，用户你昵称',
	userId int (11) not null comment '评论者',
	createTime timestamp not null comment '创建时间',
	content varchar(500) not null comment '内容',
	mark int(32) default 0 comment '状态',
	primary key (id)
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 COMMENT='评论';











