/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/6/27 23:42:02                           */
/*==============================================================*/


drop table if exists 乘机人;

drop table if exists 候机楼;

drop table if exists 城市;

drop table if exists 座位表;

drop table if exists 执飞航班;

drop table if exists 机场;

drop table if exists 机场管理员;

drop table if exists 机型;

drop table if exists 机票;

drop table if exists 机票种类;

drop table if exists 用户;

drop table if exists 用户组;

drop table if exists 省;

drop table if exists 管理员;

drop table if exists 绑定;

drop table if exists 航班;

drop table if exists 航空公司;

drop table if exists 航线;

drop table if exists 舱位;

drop table if exists 行李;

drop table if exists 订单;

drop table if exists 选座表;

drop table if exists 飞机;

drop table if exists "飞机-航班";

/*==============================================================*/
/* Table: 乘机人                                                   */
/*==============================================================*/
create table 乘机人
(
   乘机人身份证号              char(18) not null,
   乘机人姓名                varchar(20),
   乘机人性别                char(2),
   乘机人联系电话              varchar(20),
   信用状态                 varchar(10),
   primary key (乘机人身份证号)
);

/*==============================================================*/
/* Table: 候机楼                                                   */
/*==============================================================*/
create table 候机楼
(
   候机楼编号                varchar(20) not null,
   机场编号                 varchar(20) not null,
   候机楼名称                varchar(20),
   primary key (候机楼编号)
);

/*==============================================================*/
/* Table: 城市                                                    */
/*==============================================================*/
create table 城市
(
   城市编号                 varchar(20) not null,
   省编号                  varchar(20) not null,
   城市名                  varchar(20),
   邮编                   char(6),
   primary key (城市编号)
);

/*==============================================================*/
/* Table: 座位表                                                   */
/*==============================================================*/
create table 座位表
(
   座位编号                 int not null,
   机型编号                 varchar(20) not null,
   舱位编号                 varchar(20) not null,
   位置                   varchar(20),
   安全座位                 bool,
   primary key (座位编号)
);

/*==============================================================*/
/* Table: 执飞航班                                                  */
/*==============================================================*/
create table 执飞航班
(
   执飞航班编号               varchar(20) not null,
   航班编号                 varchar(20) not null,
   执飞日期                 date,
   执行价格                 double,
   预计起飞时间               time,
   预计到达时间               time,
   实际起飞时间               time,
   实际到达时间               time,
   状态                   varchar(50),
   登机口                  varchar(20),
   登机时间                 time,
   primary key (执飞航班编号)
);

/*==============================================================*/
/* Table: 机场                                                    */
/*==============================================================*/
create table 机场
(
   机场编号                 varchar(20) not null,
   城市编号                 varchar(20) not null,
   机场名称                 varchar(20),
   机场地址                 varchar(50),
   机场联系电话               varchar(20),
   primary key (机场编号)
);

/*==============================================================*/
/* Table: 机场管理员                                                 */
/*==============================================================*/
create table 机场管理员
(
   登录id                 varchar(20) not null,
   登录密码                 varchar(20),
   联系电话                 varchar(20),
   邮箱                   varchar(20),
   机场管理员id              varchar(20) not null,
   权限                   varchar(100),
   primary key (登录id)
);

/*==============================================================*/
/* Table: 机型                                                    */
/*==============================================================*/
create table 机型
(
   机型编号                 varchar(20) not null,
   机型名称                 varchar(20),
   primary key (机型编号)
);

/*==============================================================*/
/* Table: 机票                                                    */
/*==============================================================*/
create table 机票
(
   机票编号                 varchar(20) not null,
   乘机人身份证号              char(18) not null,
   订单号                  varchar(20) not null,
   舱位编号                 varchar(20) not null,
   执飞航班编号               varchar(20) not null,
   座位编号                 int not null,
   机场建设费                double,
   保险费                  double,
   机票价格                 double,
   备注                   varchar(200),
   值机状态                 varchar(20),
   登机号                  varchar(20),
   primary key (机票编号)
);

/*==============================================================*/
/* Table: 机票种类                                                  */
/*==============================================================*/
create table 机票种类
(
   舱位编号                 varchar(20) not null,
   执飞航班编号               varchar(20) not null,
   销售价格                 double,
   有效起始日期               datetime,
   有效截至日期               datetime,
   折扣                   double,
   余票量                  int,
   行李额度                 int,
   行李件数                 int,
   餐食状态                 char(2),
   退改签规则                varchar(500),
   primary key (舱位编号, 执飞航班编号)
);

/*==============================================================*/
/* Table: 用户                                                    */
/*==============================================================*/
create table 用户
(
   登录id                 varchar(20) not null,
   用户id                 varchar(20) not null,
   登录密码                 varchar(20),
   联系电话                 varchar(20),
   邮箱                   varchar(20),
   用户姓名                 varchar(20),
   用户身份证号               char(18),
   用户性别                 char(2),
   用户年龄                 int,
   用户积分                 int,
   primary key (登录id, 用户id)
);

/*==============================================================*/
/* Table: 用户组                                                   */
/*==============================================================*/
create table 用户组
(
   登录id                 varchar(20) not null,
   登录密码                 varchar(20),
   联系电话                 varchar(20),
   邮箱                   varchar(20),
   primary key (登录id)
);

/*==============================================================*/
/* Table: 省                                                     */
/*==============================================================*/
create table 省
(
   省编号                  varchar(20) not null,
   省名                   varchar(20),
   省会                   varchar(20),
   primary key (省编号)
);

/*==============================================================*/
/* Table: 管理员                                                   */
/*==============================================================*/
create table 管理员
(
   登录id                 varchar(20) not null,
   管理员id                varchar(20) not null,
   登录密码                 varchar(20),
   联系电话                 varchar(20),
   邮箱                   varchar(20),
   管理员权限                varchar(100),
   primary key (登录id, 管理员id)
);

/*==============================================================*/
/* Table: 绑定                                                    */
/*==============================================================*/
create table 绑定
(
   登录id                 varchar(20) not null,
   用户id                 varchar(20) not null,
   乘机人身份证号              char(18) not null,
   绑定时间                 datetime,
   primary key (登录id, 用户id, 乘机人身份证号)
);

/*==============================================================*/
/* Table: 航班                                                    */
/*==============================================================*/
create table 航班
(
   航班编号                 varchar(20) not null,
   航线编号                 varchar(20) not null,
   机型编号                 varchar(20) not null,
   出发地候机楼编号             varchar(20) not null,
   目的地候机楼编号             varchar(20) not null,
   计划起飞时间               time not null,
   计划到达时间               time not null,
   primary key (航班编号)
);

/*==============================================================*/
/* Table: 航空公司                                                  */
/*==============================================================*/
create table 航空公司
(
   航空公司编号               varchar(20) not null,
   航空公司名称               varchar(50) not null,
   航空公司联系电话             varchar(50) not null,
   primary key (航空公司编号)
);

/*==============================================================*/
/* Table: 航线                                                    */
/*==============================================================*/
create table 航线
(
   航线编号                 varchar(20) not null,
   出发城市                 varchar(20),
   到达城市                 varchar(20),
   primary key (航线编号)
);

/*==============================================================*/
/* Table: 舱位                                                    */
/*==============================================================*/
create table 舱位
(
   舱位编号                 varchar(20) not null,
   舱位名称                 varchar(50),
   primary key (舱位编号)
);

/*==============================================================*/
/* Table: 行李                                                    */
/*==============================================================*/
create table 行李
(
   行李编号                 varchar(20) not null,
   机票编号                 varchar(20) not null,
   行李重量                 double,
   长                    double,
   宽                    double,
   高                    double,
   罚款                   double,
   primary key (行李编号)
);

/*==============================================================*/
/* Table: 订单                                                    */
/*==============================================================*/
create table 订单
(
   订单号                  varchar(20) not null,
   登录id                 varchar(20) not null,
   用户id                 varchar(20) not null,
   订单日期                 datetime,
   机票数                  int,
   联系电话                 varchar(20),
   抵用积分                 int,
   总额                   double,
   订单状态                 varchar(50),
   primary key (订单号)
);

/*==============================================================*/
/* Table: 选座表                                                   */
/*==============================================================*/
create table 选座表
(
   座位编号                 int not null,
   执飞航班编号               varchar(20) not null,
   状态                   varchar(50),
   primary key (座位编号)
);

/*==============================================================*/
/* Table: 飞机                                                    */
/*==============================================================*/
create table 飞机
(
   飞机编号                 varchar(20) not null,
   航空公司编号               varchar(20) not null,
   机型编号                 varchar(20) not null,
   飞机名称                 varchar(20),
   机龄                   float,
   座位数                  int,
   飞行里程                 double,
   primary key (飞机编号)
);

/*==============================================================*/
/* Table: "飞机-航班"                                               */
/*==============================================================*/
create table "飞机-航班"
(
   飞机编号                 varchar(20) not null,
   航班编号                 varchar(20) not null,
   是否代码共享               bool not null,
   primary key (飞机编号, 航班编号)
);

alter table 候机楼 add constraint FK_候机楼构成 foreign key (机场编号)
      references 机场 (机场编号);

alter table 城市 add constraint FK_Relationship_13 foreign key (省编号)
      references 省 (省编号);

alter table 座位表 add constraint FK_对应座位表 foreign key (机型编号)
      references 机型 (机型编号);

alter table 座位表 add constraint FK_对应舱位 foreign key (舱位编号)
      references 舱位 (舱位编号);

alter table 执飞航班 add constraint FK_执飞航班构成 foreign key (航班编号)
      references 航班 (航班编号);

alter table 机场 add constraint FK_Relationship_14 foreign key (城市编号)
      references 城市 (城市编号);

alter table 机场管理员 add constraint FK_类别3 foreign key (登录id)
      references 用户组 (登录id);

alter table 机票 add constraint FK_值机选座 foreign key (座位编号)
      references 选座表 (座位编号);

alter table 机票 add constraint FK_对应乘机人 foreign key (乘机人身份证号)
      references 乘机人 (乘机人身份证号);

alter table 机票 add constraint FK_种类构成 foreign key (舱位编号, 执飞航班编号)
      references 机票种类 (舱位编号, 执飞航班编号);

alter table 机票 add constraint FK_细目构成 foreign key (订单号)
      references 订单 (订单号);

alter table 机票种类 add constraint FK_机票构成1 foreign key (执飞航班编号)
      references 执飞航班 (执飞航班编号);

alter table 机票种类 add constraint FK_机票构成2 foreign key (舱位编号)
      references 舱位 (舱位编号);

alter table 用户 add constraint FK_类别1 foreign key (登录id)
      references 用户组 (登录id);

alter table 管理员 add constraint FK_类别2 foreign key (登录id)
      references 用户组 (登录id);

alter table 绑定 add constraint FK_绑定 foreign key (登录id, 用户id)
      references 用户 (登录id, 用户id);

alter table 绑定 add constraint FK_绑定2 foreign key (乘机人身份证号)
      references 乘机人 (乘机人身份证号);

alter table 航班 add constraint FK_R_13 foreign key (航线编号)
      references 航线 (航线编号);

alter table 航班 add constraint FK_出发地 foreign key (目的地候机楼编号)
      references 候机楼 (候机楼编号);

alter table 航班 add constraint FK_机型构成 foreign key (机型编号)
      references 机型 (机型编号);

alter table 航班 add constraint FK_目的地 foreign key (出发地候机楼编号)
      references 候机楼 (候机楼编号);

alter table 行李 add constraint FK_行李托运 foreign key (机票编号)
      references 机票 (机票编号);

alter table 订单 add constraint FK_订票 foreign key (登录id, 用户id)
      references 用户 (登录id, 用户id);

alter table 选座表 add constraint FK_执飞航班选座 foreign key (座位编号)
      references 座位表 (座位编号);

alter table 选座表 add constraint FK_选座情况 foreign key (执飞航班编号)
      references 执飞航班 (执飞航班编号);

alter table 飞机 add constraint FK_R_1 foreign key (航空公司编号)
      references 航空公司 (航空公司编号);

alter table 飞机 add constraint FK_Relationship_23 foreign key (机型编号)
      references 机型 (机型编号);

alter table "飞机-航班" add constraint "FK_飞机-航班" foreign key (飞机编号)
      references 飞机 (飞机编号);

alter table "飞机-航班" add constraint "FK_飞机-航班2" foreign key (航班编号)
      references 航班 (航班编号);

