/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     2020/6/23 22:57:26                           */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('候机楼') and o.name = 'FK_候机楼_候机楼构成_机场')
alter table 候机楼
   drop constraint FK_候机楼_候机楼构成_机场
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('城市') and o.name = 'FK_城市_RELATIONS_省')
alter table 城市
   drop constraint FK_城市_RELATIONS_省
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('座位表') and o.name = 'FK_座位表_对应座位表_机型')
alter table 座位表
   drop constraint FK_座位表_对应座位表_机型
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('座位表') and o.name = 'FK_座位表_对应舱位_舱位')
alter table 座位表
   drop constraint FK_座位表_对应舱位_舱位
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('执飞航班') and o.name = 'FK_执飞航班_执飞航班构成_航班')
alter table 执飞航班
   drop constraint FK_执飞航班_执飞航班构成_航班
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机场') and o.name = 'FK_机场_RELATIONS_城市')
alter table 机场
   drop constraint FK_机场_RELATIONS_城市
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机场管理员') and o.name = 'FK_机场管理员_类别3_用户组')
alter table 机场管理员
   drop constraint FK_机场管理员_类别3_用户组
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票') and o.name = 'FK_机票_值机选座_选座表')
alter table 机票
   drop constraint FK_机票_值机选座_选座表
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票') and o.name = 'FK_机票_对应乘机人_乘机人')
alter table 机票
   drop constraint FK_机票_对应乘机人_乘机人
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票') and o.name = 'FK_机票_种类构成_机票种类')
alter table 机票
   drop constraint FK_机票_种类构成_机票种类
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票') and o.name = 'FK_机票_细目构成_订单')
alter table 机票
   drop constraint FK_机票_细目构成_订单
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票种类') and o.name = 'FK_机票种类_机票构成1_执飞航班')
alter table 机票种类
   drop constraint FK_机票种类_机票构成1_执飞航班
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('机票种类') and o.name = 'FK_机票种类_机票构成2_舱位')
alter table 机票种类
   drop constraint FK_机票种类_机票构成2_舱位
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('用户') and o.name = 'FK_用户_类别1_用户组')
alter table 用户
   drop constraint FK_用户_类别1_用户组
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('管理员') and o.name = 'FK_管理员_类别2_用户组')
alter table 管理员
   drop constraint FK_管理员_类别2_用户组
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('绑定') and o.name = 'FK_绑定_绑定_用户')
alter table 绑定
   drop constraint FK_绑定_绑定_用户
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('绑定') and o.name = 'FK_绑定_绑定2_乘机人')
alter table 绑定
   drop constraint FK_绑定_绑定2_乘机人
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('航班') and o.name = 'FK_航班_R_13_航线')
alter table 航班
   drop constraint FK_航班_R_13_航线
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('航班') and o.name = 'FK_航班_出发地_候机楼')
alter table 航班
   drop constraint FK_航班_出发地_候机楼
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('航班') and o.name = 'FK_航班_机型构成_机型')
alter table 航班
   drop constraint FK_航班_机型构成_机型
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('航班') and o.name = 'FK_航班_目的地_候机楼')
alter table 航班
   drop constraint FK_航班_目的地_候机楼
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('行李') and o.name = 'FK_行李_行李托运_机票')
alter table 行李
   drop constraint FK_行李_行李托运_机票
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('订单') and o.name = 'FK_订单_订票_用户')
alter table 订单
   drop constraint FK_订单_订票_用户
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('选座表') and o.name = 'FK_选座表_执飞航班选座_座位表')
alter table 选座表
   drop constraint FK_选座表_执飞航班选座_座位表
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('选座表') and o.name = 'FK_选座表_选座情况_执飞航班')
alter table 选座表
   drop constraint FK_选座表_选座情况_执飞航班
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('飞机') and o.name = 'FK_飞机_R_1_航空公司')
alter table 飞机
   drop constraint FK_飞机_R_1_航空公司
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('飞机') and o.name = 'FK_飞机_RELATIONS_机型')
alter table 飞机
   drop constraint FK_飞机_RELATIONS_机型
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"飞机-航班"') and o.name = 'FK_飞机-航班_飞机-航班_飞机')
alter table "飞机-航班"
   drop constraint "FK_飞机-航班_飞机-航班_飞机"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"飞机-航班"') and o.name = 'FK_飞机-航班_飞机-航班2_航班')
alter table "飞机-航班"
   drop constraint "FK_飞机-航班_飞机-航班2_航班"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('乘机人')
            and   type = 'U')
   drop table 乘机人
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('候机楼')
            and   name  = '候机楼构成_FK'
            and   indid > 0
            and   indid < 255)
   drop index 候机楼.候机楼构成_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('候机楼')
            and   type = 'U')
   drop table 候机楼
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('城市')
            and   name  = 'Relationship_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index 城市.Relationship_13_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('城市')
            and   type = 'U')
   drop table 城市
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('座位表')
            and   name  = '对应舱位_FK'
            and   indid > 0
            and   indid < 255)
   drop index 座位表.对应舱位_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('座位表')
            and   name  = '对应座位表_FK'
            and   indid > 0
            and   indid < 255)
   drop index 座位表.对应座位表_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('座位表')
            and   type = 'U')
   drop table 座位表
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('执飞航班')
            and   name  = '执飞航班构成_FK'
            and   indid > 0
            and   indid < 255)
   drop index 执飞航班.执飞航班构成_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('执飞航班')
            and   type = 'U')
   drop table 执飞航班
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机场')
            and   name  = 'Relationship_14_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机场.Relationship_14_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('机场')
            and   type = 'U')
   drop table 机场
go

if exists (select 1
            from  sysobjects
           where  id = object_id('机场管理员')
            and   type = 'U')
   drop table 机场管理员
go

if exists (select 1
            from  sysobjects
           where  id = object_id('机型')
            and   type = 'U')
   drop table 机型
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票')
            and   name  = '值机选座_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票.值机选座_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票')
            and   name  = '种类构成_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票.种类构成_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票')
            and   name  = '对应乘机人_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票.对应乘机人_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票')
            and   name  = '细目构成_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票.细目构成_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('机票')
            and   type = 'U')
   drop table 机票
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票种类')
            and   name  = '机票构成1_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票种类.机票构成1_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('机票种类')
            and   name  = '机票构成2_FK'
            and   indid > 0
            and   indid < 255)
   drop index 机票种类.机票构成2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('机票种类')
            and   type = 'U')
   drop table 机票种类
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('用户')
            and   name  = '类别1_FK'
            and   indid > 0
            and   indid < 255)
   drop index 用户.类别1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('用户')
            and   type = 'U')
   drop table 用户
go

if exists (select 1
            from  sysobjects
           where  id = object_id('用户组')
            and   type = 'U')
   drop table 用户组
go

if exists (select 1
            from  sysobjects
           where  id = object_id('省')
            and   type = 'U')
   drop table 省
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('管理员')
            and   name  = '类别2_FK'
            and   indid > 0
            and   indid < 255)
   drop index 管理员.类别2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('管理员')
            and   type = 'U')
   drop table 管理员
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('绑定')
            and   name  = '绑定2_FK'
            and   indid > 0
            and   indid < 255)
   drop index 绑定.绑定2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('绑定')
            and   name  = '绑定_FK'
            and   indid > 0
            and   indid < 255)
   drop index 绑定.绑定_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('绑定')
            and   type = 'U')
   drop table 绑定
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('航班')
            and   name  = '机型构成_FK'
            and   indid > 0
            and   indid < 255)
   drop index 航班.机型构成_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('航班')
            and   name  = '目的地_FK'
            and   indid > 0
            and   indid < 255)
   drop index 航班.目的地_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('航班')
            and   name  = '出发地_FK'
            and   indid > 0
            and   indid < 255)
   drop index 航班.出发地_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('航班')
            and   name  = 'R_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index 航班.R_13_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('航班')
            and   type = 'U')
   drop table 航班
go

if exists (select 1
            from  sysobjects
           where  id = object_id('航空公司')
            and   type = 'U')
   drop table 航空公司
go

if exists (select 1
            from  sysobjects
           where  id = object_id('航线')
            and   type = 'U')
   drop table 航线
go

if exists (select 1
            from  sysobjects
           where  id = object_id('舱位')
            and   type = 'U')
   drop table 舱位
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('行李')
            and   name  = '行李托运_FK'
            and   indid > 0
            and   indid < 255)
   drop index 行李.行李托运_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('行李')
            and   type = 'U')
   drop table 行李
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('订单')
            and   name  = '订票_FK'
            and   indid > 0
            and   indid < 255)
   drop index 订单.订票_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('订单')
            and   type = 'U')
   drop table 订单
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('选座表')
            and   name  = '选座情况_FK'
            and   indid > 0
            and   indid < 255)
   drop index 选座表.选座情况_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('选座表')
            and   type = 'U')
   drop table 选座表
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('飞机')
            and   name  = 'Relationship_23_FK'
            and   indid > 0
            and   indid < 255)
   drop index 飞机.Relationship_23_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('飞机')
            and   name  = 'R_1_FK'
            and   indid > 0
            and   indid < 255)
   drop index 飞机.R_1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('飞机')
            and   type = 'U')
   drop table 飞机
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"飞机-航班"')
            and   name  = '飞机-航班2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "飞机-航班"."飞机-航班2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"飞机-航班"')
            and   name  = '飞机-航班_FK'
            and   indid > 0
            and   indid < 255)
   drop index "飞机-航班"."飞机-航班_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"飞机-航班"')
            and   type = 'U')
   drop table "飞机-航班"
go

/*==============================================================*/
/* Table: 乘机人                                                   */
/*==============================================================*/
create table 乘机人 (
   乘机人身份证号              char(18)             not null,
   乘机人姓名                varchar(20)          null,
   乘机人性别                char(2)              null,
   乘机人联系电话              varchar(20)          null,
   信用状态                 varchar(10)          null,
   constraint PK_乘机人 primary key nonclustered (乘机人身份证号)
)
go

/*==============================================================*/
/* Table: 候机楼                                                   */
/*==============================================================*/
create table 候机楼 (
   候机楼编号                varchar(20)          not null,
   "机场三/四字码"            varchar(20)          not null,
   候机楼名称                varchar(20)          null,
   constraint PK_候机楼 primary key nonclustered (候机楼编号)
)
go

/*==============================================================*/
/* Index: 候机楼构成_FK                                              */
/*==============================================================*/
create index 候机楼构成_FK on 候机楼 (
"机场三/四字码" ASC
)
go

/*==============================================================*/
/* Table: 城市                                                    */
/*==============================================================*/
create table 城市 (
   城市编号                 varchar(20)          not null,
   省编号                  varchar(20)          not null,
   城市名                  varchar(20)          null,
   邮编                   char(6)              null,
   constraint PK_城市 primary key nonclustered (城市编号)
)
go

/*==============================================================*/
/* Index: Relationship_13_FK                                    */
/*==============================================================*/
create index Relationship_13_FK on 城市 (
省编号 ASC
)
go

/*==============================================================*/
/* Table: 座位表                                                   */
/*==============================================================*/
create table 座位表 (
   座位编号                 int                  not null,
   机型编号                 varchar(20)          not null,
   舱位编号                 varchar(20)          not null,
   位置                   varchar(20)          null,
   安全座位                 bit                  null,
   constraint PK_座位表 primary key nonclustered (座位编号)
)
go

/*==============================================================*/
/* Index: 对应座位表_FK                                              */
/*==============================================================*/
create index 对应座位表_FK on 座位表 (
机型编号 ASC
)
go

/*==============================================================*/
/* Index: 对应舱位_FK                                               */
/*==============================================================*/
create index 对应舱位_FK on 座位表 (
舱位编号 ASC
)
go

/*==============================================================*/
/* Table: 执飞航班                                                  */
/*==============================================================*/
create table 执飞航班 (
   执飞航班编号               varchar(20)          not null,
   航班编号                 varchar(20)          not null,
   执飞日期                 datetime             null,
   执行价格                 double precision     null,
   预计起飞时间               datetime             null,
   预计到达时间               datetime             null,
   实际起飞时间               datetime             null,
   实际到达时间               datetime             null,
   状态                   varchar(50)          null,
   登机口                  varchar(20)          null,
   登机时间                 datetime             null,
   constraint PK_执飞航班 primary key nonclustered (执飞航班编号)
)
go

/*==============================================================*/
/* Index: 执飞航班构成_FK                                             */
/*==============================================================*/
create index 执飞航班构成_FK on 执飞航班 (
航班编号 ASC
)
go

/*==============================================================*/
/* Table: 机场                                                    */
/*==============================================================*/
create table 机场 (
   "机场三/四字码"            varchar(20)          not null,
   城市编号                 varchar(20)          not null,
   机场名称                 varchar(20)          null,
   机场地址                 varchar(50)          null,
   机场联系电话               varchar(20)          null,
   constraint PK_机场 primary key nonclustered ("机场三/四字码")
)
go

/*==============================================================*/
/* Index: Relationship_14_FK                                    */
/*==============================================================*/
create index Relationship_14_FK on 机场 (
城市编号 ASC
)
go

/*==============================================================*/
/* Table: 机场管理员                                                 */
/*==============================================================*/
create table 机场管理员 (
   登录id                 varchar(20)          not null,
   登录密码                 varchar(20)          null,
   联系电话                 varchar(20)          null,
   邮箱                   varchar(20)          null,
   机场管理员id              varchar(20)          not null,
   权限                   varchar(100)         null,
   constraint PK_机场管理员 primary key nonclustered (登录id)
)
go

/*==============================================================*/
/* Table: 机型                                                    */
/*==============================================================*/
create table 机型 (
   机型编号                 varchar(20)          not null,
   机型名称                 varchar(20)          null,
   constraint PK_机型 primary key nonclustered (机型编号)
)
go

/*==============================================================*/
/* Table: 机票                                                    */
/*==============================================================*/
create table 机票 (
   机票编号                 varchar(20)          not null,
   乘机人身份证号              char(18)             not null,
   订单号                  varchar(20)          not null,
   舱位编号                 varchar(20)          not null,
   执飞航班编号               varchar(20)          not null,
   座位编号                 int                  not null,
   机场建设费                double precision     null,
   保险费                  double precision     null,
   机票价格                 double precision     null,
   备注                   varchar(200)         null,
   值机状态                 varchar(20)          null,
   登机号                  varchar(20)          null,
   constraint PK_机票 primary key nonclustered (机票编号)
)
go

/*==============================================================*/
/* Index: 细目构成_FK                                               */
/*==============================================================*/
create index 细目构成_FK on 机票 (
订单号 ASC
)
go

/*==============================================================*/
/* Index: 对应乘机人_FK                                              */
/*==============================================================*/
create index 对应乘机人_FK on 机票 (
乘机人身份证号 ASC
)
go

/*==============================================================*/
/* Index: 种类构成_FK                                               */
/*==============================================================*/
create index 种类构成_FK on 机票 (
舱位编号 ASC,
执飞航班编号 ASC
)
go

/*==============================================================*/
/* Index: 值机选座_FK                                               */
/*==============================================================*/
create index 值机选座_FK on 机票 (
座位编号 ASC
)
go

/*==============================================================*/
/* Table: 机票种类                                                  */
/*==============================================================*/
create table 机票种类 (
   舱位编号                 varchar(20)          not null,
   执飞航班编号               varchar(20)          not null,
   销售价格                 double precision     null,
   有效起始日期               datetime             null,
   有效截至日期               datetime             null,
   折扣                   double precision     null,
   余票量                  int                  null,
   行李额度                 int                  null,
   行李件数                 int                  null,
   餐食状态                 char(2)              null,
   退改签规则                varchar(500)         null,
   constraint PK_机票种类 primary key nonclustered (舱位编号, 执飞航班编号)
)
go

/*==============================================================*/
/* Index: 机票构成2_FK                                              */
/*==============================================================*/
create index 机票构成2_FK on 机票种类 (
舱位编号 ASC
)
go

/*==============================================================*/
/* Index: 机票构成1_FK                                              */
/*==============================================================*/
create index 机票构成1_FK on 机票种类 (
执飞航班编号 ASC
)
go

/*==============================================================*/
/* Table: 用户                                                    */
/*==============================================================*/
create table 用户 (
   登录id                 varchar(20)          not null,
   用户id                 varchar(20)          not null,
   登录密码                 varchar(20)          null,
   联系电话                 varchar(20)          null,
   邮箱                   varchar(20)          null,
   用户姓名                 varchar(20)          null,
   用户身份证号               char(18)             null,
   用户性别                 char(2)              null,
   用户年龄                 int                  null,
   用户积分                 int                  null,
   constraint PK_用户 primary key nonclustered (登录id, 用户id)
)
go

/*==============================================================*/
/* Index: 类别1_FK                                                */
/*==============================================================*/
create index 类别1_FK on 用户 (
登录id ASC
)
go

/*==============================================================*/
/* Table: 用户组                                                   */
/*==============================================================*/
create table 用户组 (
   登录id                 varchar(20)          not null,
   登录密码                 varchar(20)          null,
   联系电话                 varchar(20)          null,
   邮箱                   varchar(20)          null,
   constraint PK_用户组 primary key nonclustered (登录id)
)
go

/*==============================================================*/
/* Table: 省                                                     */
/*==============================================================*/
create table 省 (
   省编号                  varchar(20)          not null,
   省名                   varchar(20)          null,
   省会                   varchar(20)          null,
   constraint PK_省 primary key nonclustered (省编号)
)
go

/*==============================================================*/
/* Table: 管理员                                                   */
/*==============================================================*/
create table 管理员 (
   登录id                 varchar(20)          not null,
   管理员id                varchar(20)          not null,
   登录密码                 varchar(20)          null,
   联系电话                 varchar(20)          null,
   邮箱                   varchar(20)          null,
   管理员权限                varchar(100)         null,
   constraint PK_管理员 primary key nonclustered (登录id, 管理员id)
)
go

/*==============================================================*/
/* Index: 类别2_FK                                                */
/*==============================================================*/
create index 类别2_FK on 管理员 (
登录id ASC
)
go

/*==============================================================*/
/* Table: 绑定                                                    */
/*==============================================================*/
create table 绑定 (
   登录id                 varchar(20)          not null,
   用户id                 varchar(20)          not null,
   乘机人身份证号              char(18)             not null,
   绑定时间                 datetime             null,
   constraint PK_绑定 primary key nonclustered (登录id, 用户id, 乘机人身份证号)
)
go

/*==============================================================*/
/* Index: 绑定_FK                                                 */
/*==============================================================*/
create index 绑定_FK on 绑定 (
登录id ASC,
用户id ASC
)
go

/*==============================================================*/
/* Index: 绑定2_FK                                                */
/*==============================================================*/
create index 绑定2_FK on 绑定 (
乘机人身份证号 ASC
)
go

/*==============================================================*/
/* Table: 航班                                                    */
/*==============================================================*/
create table 航班 (
   航班编号                 varchar(20)          not null,
   航线编号                 varchar(20)          not null,
   机型编号                 varchar(20)          not null,
   候机楼编号                varchar(20)          not null,
   候机楼_候机楼编号            varchar(20)          not null,
   计划起飞时间               datetime             not null,
   计划到达时间               datetime             not null,
   constraint PK_航班 primary key nonclustered (航班编号)
)
go

/*==============================================================*/
/* Index: R_13_FK                                               */
/*==============================================================*/
create index R_13_FK on 航班 (
航线编号 ASC
)
go

/*==============================================================*/
/* Index: 出发地_FK                                                */
/*==============================================================*/
create index 出发地_FK on 航班 (
候机楼_候机楼编号 ASC
)
go

/*==============================================================*/
/* Index: 目的地_FK                                                */
/*==============================================================*/
create index 目的地_FK on 航班 (
候机楼编号 ASC
)
go

/*==============================================================*/
/* Index: 机型构成_FK                                               */
/*==============================================================*/
create index 机型构成_FK on 航班 (
机型编号 ASC
)
go

/*==============================================================*/
/* Table: 航空公司                                                  */
/*==============================================================*/
create table 航空公司 (
   航空公司编号               varchar(20)          not null,
   航空公司名称               varchar(50)          not null,
   航空公司联系电话             varchar(50)          not null,
   constraint PK_航空公司 primary key nonclustered (航空公司编号)
)
go

/*==============================================================*/
/* Table: 航线                                                    */
/*==============================================================*/
create table 航线 (
   航线编号                 varchar(20)          not null,
   出发城市                 varchar(20)          null,
   到达城市                 varchar(20)          null,
   constraint PK_航线 primary key nonclustered (航线编号)
)
go

/*==============================================================*/
/* Table: 舱位                                                    */
/*==============================================================*/
create table 舱位 (
   舱位编号                 varchar(20)          not null,
   舱位等级                 varchar(50)          null,
   constraint PK_舱位 primary key nonclustered (舱位编号)
)
go

/*==============================================================*/
/* Table: 行李                                                    */
/*==============================================================*/
create table 行李 (
   行李编号                 varchar(20)          not null,
   机票编号                 varchar(20)          not null,
   行李重量                 double precision     null,
   长                    double precision     null,
   宽                    double precision     null,
   高                    double precision     null,
   罚款                   double precision     null,
   constraint PK_行李 primary key nonclustered (行李编号)
)
go

/*==============================================================*/
/* Index: 行李托运_FK                                               */
/*==============================================================*/
create index 行李托运_FK on 行李 (
机票编号 ASC
)
go

/*==============================================================*/
/* Table: 订单                                                    */
/*==============================================================*/
create table 订单 (
   订单号                  varchar(20)          not null,
   登录id                 varchar(20)          not null,
   用户id                 varchar(20)          not null,
   订单日期                 datetime             null,
   机票数                  int                  null,
   "已购/赠送服务"            varchar(50)          null,
   联系电话                 varchar(20)          null,
   抵用积分                 int                  null,
   总额                   double precision     null,
   订单状态                 varchar(50)          null,
   constraint PK_订单 primary key nonclustered (订单号)
)
go

/*==============================================================*/
/* Index: 订票_FK                                                 */
/*==============================================================*/
create index 订票_FK on 订单 (
登录id ASC,
用户id ASC
)
go

/*==============================================================*/
/* Table: 选座表                                                   */
/*==============================================================*/
create table 选座表 (
   座位编号                 int                  not null,
   执飞航班编号               varchar(20)          not null,
   状态                   varchar(50)          null,
   constraint PK_选座表 primary key nonclustered (座位编号)
)
go

/*==============================================================*/
/* Index: 选座情况_FK                                               */
/*==============================================================*/
create index 选座情况_FK on 选座表 (
执飞航班编号 ASC
)
go

/*==============================================================*/
/* Table: 飞机                                                    */
/*==============================================================*/
create table 飞机 (
   飞机机号                 varchar(20)          not null,
   航空公司编号               varchar(20)          not null,
   机型编号                 varchar(20)          not null,
   飞机名称                 varchar(20)          null,
   机龄                   float                null,
   座位数                  int                  null,
   飞行里程                 float                null,
   constraint PK_飞机 primary key nonclustered (飞机机号)
)
go

/*==============================================================*/
/* Index: R_1_FK                                                */
/*==============================================================*/
create index R_1_FK on 飞机 (
航空公司编号 ASC
)
go

/*==============================================================*/
/* Index: Relationship_23_FK                                    */
/*==============================================================*/
create index Relationship_23_FK on 飞机 (
机型编号 ASC
)
go

/*==============================================================*/
/* Table: "飞机-航班"                                               */
/*==============================================================*/
create table "飞机-航班" (
   飞机机号                 varchar(20)          not null,
   航班编号                 varchar(20)          not null,
   是否代码共享               bit                  not null,
   constraint "PK_飞机-航班" primary key nonclustered (飞机机号, 航班编号)
)
go

/*==============================================================*/
/* Index: "飞机-航班_FK"                                            */
/*==============================================================*/
create index "飞机-航班_FK" on "飞机-航班" (
飞机机号 ASC
)
go

/*==============================================================*/
/* Index: "飞机-航班2_FK"                                           */
/*==============================================================*/
create index "飞机-航班2_FK" on "飞机-航班" (
航班编号 ASC
)
go

alter table 候机楼
   add constraint FK_候机楼_候机楼构成_机场 foreign key ("机场三/四字码")
      references 机场 ("机场三/四字码")
go

alter table 城市
   add constraint FK_城市_RELATIONS_省 foreign key (省编号)
      references 省 (省编号)
go

alter table 座位表
   add constraint FK_座位表_对应座位表_机型 foreign key (机型编号)
      references 机型 (机型编号)
go

alter table 座位表
   add constraint FK_座位表_对应舱位_舱位 foreign key (舱位编号)
      references 舱位 (舱位编号)
go

alter table 执飞航班
   add constraint FK_执飞航班_执飞航班构成_航班 foreign key (航班编号)
      references 航班 (航班编号)
go

alter table 机场
   add constraint FK_机场_RELATIONS_城市 foreign key (城市编号)
      references 城市 (城市编号)
go

alter table 机场管理员
   add constraint FK_机场管理员_类别3_用户组 foreign key (登录id)
      references 用户组 (登录id)
go

alter table 机票
   add constraint FK_机票_值机选座_选座表 foreign key (座位编号)
      references 选座表 (座位编号)
go

alter table 机票
   add constraint FK_机票_对应乘机人_乘机人 foreign key (乘机人身份证号)
      references 乘机人 (乘机人身份证号)
go

alter table 机票
   add constraint FK_机票_种类构成_机票种类 foreign key (舱位编号, 执飞航班编号)
      references 机票种类 (舱位编号, 执飞航班编号)
go

alter table 机票
   add constraint FK_机票_细目构成_订单 foreign key (订单号)
      references 订单 (订单号)
go

alter table 机票种类
   add constraint FK_机票种类_机票构成1_执飞航班 foreign key (执飞航班编号)
      references 执飞航班 (执飞航班编号)
go

alter table 机票种类
   add constraint FK_机票种类_机票构成2_舱位 foreign key (舱位编号)
      references 舱位 (舱位编号)
go

alter table 用户
   add constraint FK_用户_类别1_用户组 foreign key (登录id)
      references 用户组 (登录id)
go

alter table 管理员
   add constraint FK_管理员_类别2_用户组 foreign key (登录id)
      references 用户组 (登录id)
go

alter table 绑定
   add constraint FK_绑定_绑定_用户 foreign key (登录id, 用户id)
      references 用户 (登录id, 用户id)
go

alter table 绑定
   add constraint FK_绑定_绑定2_乘机人 foreign key (乘机人身份证号)
      references 乘机人 (乘机人身份证号)
go

alter table 航班
   add constraint FK_航班_R_13_航线 foreign key (航线编号)
      references 航线 (航线编号)
go

alter table 航班
   add constraint FK_航班_出发地_候机楼 foreign key (候机楼_候机楼编号)
      references 候机楼 (候机楼编号)
go

alter table 航班
   add constraint FK_航班_机型构成_机型 foreign key (机型编号)
      references 机型 (机型编号)
go

alter table 航班
   add constraint FK_航班_目的地_候机楼 foreign key (候机楼编号)
      references 候机楼 (候机楼编号)
go

alter table 行李
   add constraint FK_行李_行李托运_机票 foreign key (机票编号)
      references 机票 (机票编号)
go

alter table 订单
   add constraint FK_订单_订票_用户 foreign key (登录id, 用户id)
      references 用户 (登录id, 用户id)
go

alter table 选座表
   add constraint FK_选座表_执飞航班选座_座位表 foreign key (座位编号)
      references 座位表 (座位编号)
go

alter table 选座表
   add constraint FK_选座表_选座情况_执飞航班 foreign key (执飞航班编号)
      references 执飞航班 (执飞航班编号)
go

alter table 飞机
   add constraint FK_飞机_R_1_航空公司 foreign key (航空公司编号)
      references 航空公司 (航空公司编号)
go

alter table 飞机
   add constraint FK_飞机_RELATIONS_机型 foreign key (机型编号)
      references 机型 (机型编号)
go

alter table "飞机-航班"
   add constraint "FK_飞机-航班_飞机-航班_飞机" foreign key (飞机机号)
      references 飞机 (飞机机号)
go

alter table "飞机-航班"
   add constraint "FK_飞机-航班_飞机-航班2_航班" foreign key (航班编号)
      references 航班 (航班编号)
go

