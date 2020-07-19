/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/6/27 23:42:02                           */
/*==============================================================*/


drop table if exists �˻���;

drop table if exists ���¥;

drop table if exists ����;

drop table if exists ��λ��;

drop table if exists ִ�ɺ���;

drop table if exists ����;

drop table if exists ��������Ա;

drop table if exists ����;

drop table if exists ��Ʊ;

drop table if exists ��Ʊ����;

drop table if exists �û�;

drop table if exists �û���;

drop table if exists ʡ;

drop table if exists ����Ա;

drop table if exists ��;

drop table if exists ����;

drop table if exists ���չ�˾;

drop table if exists ����;

drop table if exists ��λ;

drop table if exists ����;

drop table if exists ����;

drop table if exists ѡ����;

drop table if exists �ɻ�;

drop table if exists "�ɻ�-����";

/*==============================================================*/
/* Table: �˻���                                                   */
/*==============================================================*/
create table �˻���
(
   �˻������֤��              char(18) not null,
   �˻�������                varchar(20),
   �˻����Ա�                char(2),
   �˻�����ϵ�绰              varchar(20),
   ����״̬                 varchar(10),
   primary key (�˻������֤��)
);

/*==============================================================*/
/* Table: ���¥                                                   */
/*==============================================================*/
create table ���¥
(
   ���¥���                varchar(20) not null,
   �������                 varchar(20) not null,
   ���¥����                varchar(20),
   primary key (���¥���)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ���б��                 varchar(20) not null,
   ʡ���                  varchar(20) not null,
   ������                  varchar(20),
   �ʱ�                   char(6),
   primary key (���б��)
);

/*==============================================================*/
/* Table: ��λ��                                                   */
/*==============================================================*/
create table ��λ��
(
   ��λ���                 int not null,
   ���ͱ��                 varchar(20) not null,
   ��λ���                 varchar(20) not null,
   λ��                   varchar(20),
   ��ȫ��λ                 bool,
   primary key (��λ���)
);

/*==============================================================*/
/* Table: ִ�ɺ���                                                  */
/*==============================================================*/
create table ִ�ɺ���
(
   ִ�ɺ�����               varchar(20) not null,
   ������                 varchar(20) not null,
   ִ������                 date,
   ִ�м۸�                 double,
   Ԥ�����ʱ��               time,
   Ԥ�Ƶ���ʱ��               time,
   ʵ�����ʱ��               time,
   ʵ�ʵ���ʱ��               time,
   ״̬                   varchar(50),
   �ǻ���                  varchar(20),
   �ǻ�ʱ��                 time,
   primary key (ִ�ɺ�����)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   �������                 varchar(20) not null,
   ���б��                 varchar(20) not null,
   ��������                 varchar(20),
   ������ַ                 varchar(50),
   ������ϵ�绰               varchar(20),
   primary key (�������)
);

/*==============================================================*/
/* Table: ��������Ա                                                 */
/*==============================================================*/
create table ��������Ա
(
   ��¼id                 varchar(20) not null,
   ��¼����                 varchar(20),
   ��ϵ�绰                 varchar(20),
   ����                   varchar(20),
   ��������Աid              varchar(20) not null,
   Ȩ��                   varchar(100),
   primary key (��¼id)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ���ͱ��                 varchar(20) not null,
   ��������                 varchar(20),
   primary key (���ͱ��)
);

/*==============================================================*/
/* Table: ��Ʊ                                                    */
/*==============================================================*/
create table ��Ʊ
(
   ��Ʊ���                 varchar(20) not null,
   �˻������֤��              char(18) not null,
   ������                  varchar(20) not null,
   ��λ���                 varchar(20) not null,
   ִ�ɺ�����               varchar(20) not null,
   ��λ���                 int not null,
   ���������                double,
   ���շ�                  double,
   ��Ʊ�۸�                 double,
   ��ע                   varchar(200),
   ֵ��״̬                 varchar(20),
   �ǻ���                  varchar(20),
   primary key (��Ʊ���)
);

/*==============================================================*/
/* Table: ��Ʊ����                                                  */
/*==============================================================*/
create table ��Ʊ����
(
   ��λ���                 varchar(20) not null,
   ִ�ɺ�����               varchar(20) not null,
   ���ۼ۸�                 double,
   ��Ч��ʼ����               datetime,
   ��Ч��������               datetime,
   �ۿ�                   double,
   ��Ʊ��                  int,
   ������                 int,
   �������                 int,
   ��ʳ״̬                 char(2),
   �˸�ǩ����                varchar(500),
   primary key (��λ���, ִ�ɺ�����)
);

/*==============================================================*/
/* Table: �û�                                                    */
/*==============================================================*/
create table �û�
(
   ��¼id                 varchar(20) not null,
   �û�id                 varchar(20) not null,
   ��¼����                 varchar(20),
   ��ϵ�绰                 varchar(20),
   ����                   varchar(20),
   �û�����                 varchar(20),
   �û����֤��               char(18),
   �û��Ա�                 char(2),
   �û�����                 int,
   �û�����                 int,
   primary key (��¼id, �û�id)
);

/*==============================================================*/
/* Table: �û���                                                   */
/*==============================================================*/
create table �û���
(
   ��¼id                 varchar(20) not null,
   ��¼����                 varchar(20),
   ��ϵ�绰                 varchar(20),
   ����                   varchar(20),
   primary key (��¼id)
);

/*==============================================================*/
/* Table: ʡ                                                     */
/*==============================================================*/
create table ʡ
(
   ʡ���                  varchar(20) not null,
   ʡ��                   varchar(20),
   ʡ��                   varchar(20),
   primary key (ʡ���)
);

/*==============================================================*/
/* Table: ����Ա                                                   */
/*==============================================================*/
create table ����Ա
(
   ��¼id                 varchar(20) not null,
   ����Աid                varchar(20) not null,
   ��¼����                 varchar(20),
   ��ϵ�绰                 varchar(20),
   ����                   varchar(20),
   ����ԱȨ��                varchar(100),
   primary key (��¼id, ����Աid)
);

/*==============================================================*/
/* Table: ��                                                    */
/*==============================================================*/
create table ��
(
   ��¼id                 varchar(20) not null,
   �û�id                 varchar(20) not null,
   �˻������֤��              char(18) not null,
   ��ʱ��                 datetime,
   primary key (��¼id, �û�id, �˻������֤��)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ������                 varchar(20) not null,
   ���߱��                 varchar(20) not null,
   ���ͱ��                 varchar(20) not null,
   �����غ��¥���             varchar(20) not null,
   Ŀ�ĵغ��¥���             varchar(20) not null,
   �ƻ����ʱ��               time not null,
   �ƻ�����ʱ��               time not null,
   primary key (������)
);

/*==============================================================*/
/* Table: ���չ�˾                                                  */
/*==============================================================*/
create table ���չ�˾
(
   ���չ�˾���               varchar(20) not null,
   ���չ�˾����               varchar(50) not null,
   ���չ�˾��ϵ�绰             varchar(50) not null,
   primary key (���չ�˾���)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ���߱��                 varchar(20) not null,
   ��������                 varchar(20),
   �������                 varchar(20),
   primary key (���߱��)
);

/*==============================================================*/
/* Table: ��λ                                                    */
/*==============================================================*/
create table ��λ
(
   ��λ���                 varchar(20) not null,
   ��λ����                 varchar(50),
   primary key (��λ���)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ������                 varchar(20) not null,
   ��Ʊ���                 varchar(20) not null,
   ��������                 double,
   ��                    double,
   ��                    double,
   ��                    double,
   ����                   double,
   primary key (������)
);

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ����
(
   ������                  varchar(20) not null,
   ��¼id                 varchar(20) not null,
   �û�id                 varchar(20) not null,
   ��������                 datetime,
   ��Ʊ��                  int,
   ��ϵ�绰                 varchar(20),
   ���û���                 int,
   �ܶ�                   double,
   ����״̬                 varchar(50),
   primary key (������)
);

/*==============================================================*/
/* Table: ѡ����                                                   */
/*==============================================================*/
create table ѡ����
(
   ��λ���                 int not null,
   ִ�ɺ�����               varchar(20) not null,
   ״̬                   varchar(50),
   primary key (��λ���)
);

/*==============================================================*/
/* Table: �ɻ�                                                    */
/*==============================================================*/
create table �ɻ�
(
   �ɻ����                 varchar(20) not null,
   ���չ�˾���               varchar(20) not null,
   ���ͱ��                 varchar(20) not null,
   �ɻ�����                 varchar(20),
   ����                   float,
   ��λ��                  int,
   �������                 double,
   primary key (�ɻ����)
);

/*==============================================================*/
/* Table: "�ɻ�-����"                                               */
/*==============================================================*/
create table "�ɻ�-����"
(
   �ɻ����                 varchar(20) not null,
   ������                 varchar(20) not null,
   �Ƿ���빲��               bool not null,
   primary key (�ɻ����, ������)
);

alter table ���¥ add constraint FK_���¥���� foreign key (�������)
      references ���� (�������);

alter table ���� add constraint FK_Relationship_13 foreign key (ʡ���)
      references ʡ (ʡ���);

alter table ��λ�� add constraint FK_��Ӧ��λ�� foreign key (���ͱ��)
      references ���� (���ͱ��);

alter table ��λ�� add constraint FK_��Ӧ��λ foreign key (��λ���)
      references ��λ (��λ���);

alter table ִ�ɺ��� add constraint FK_ִ�ɺ��๹�� foreign key (������)
      references ���� (������);

alter table ���� add constraint FK_Relationship_14 foreign key (���б��)
      references ���� (���б��);

alter table ��������Ա add constraint FK_���3 foreign key (��¼id)
      references �û��� (��¼id);

alter table ��Ʊ add constraint FK_ֵ��ѡ�� foreign key (��λ���)
      references ѡ���� (��λ���);

alter table ��Ʊ add constraint FK_��Ӧ�˻��� foreign key (�˻������֤��)
      references �˻��� (�˻������֤��);

alter table ��Ʊ add constraint FK_���๹�� foreign key (��λ���, ִ�ɺ�����)
      references ��Ʊ���� (��λ���, ִ�ɺ�����);

alter table ��Ʊ add constraint FK_ϸĿ���� foreign key (������)
      references ���� (������);

alter table ��Ʊ���� add constraint FK_��Ʊ����1 foreign key (ִ�ɺ�����)
      references ִ�ɺ��� (ִ�ɺ�����);

alter table ��Ʊ���� add constraint FK_��Ʊ����2 foreign key (��λ���)
      references ��λ (��λ���);

alter table �û� add constraint FK_���1 foreign key (��¼id)
      references �û��� (��¼id);

alter table ����Ա add constraint FK_���2 foreign key (��¼id)
      references �û��� (��¼id);

alter table �� add constraint FK_�� foreign key (��¼id, �û�id)
      references �û� (��¼id, �û�id);

alter table �� add constraint FK_��2 foreign key (�˻������֤��)
      references �˻��� (�˻������֤��);

alter table ���� add constraint FK_R_13 foreign key (���߱��)
      references ���� (���߱��);

alter table ���� add constraint FK_������ foreign key (Ŀ�ĵغ��¥���)
      references ���¥ (���¥���);

alter table ���� add constraint FK_���͹��� foreign key (���ͱ��)
      references ���� (���ͱ��);

alter table ���� add constraint FK_Ŀ�ĵ� foreign key (�����غ��¥���)
      references ���¥ (���¥���);

alter table ���� add constraint FK_�������� foreign key (��Ʊ���)
      references ��Ʊ (��Ʊ���);

alter table ���� add constraint FK_��Ʊ foreign key (��¼id, �û�id)
      references �û� (��¼id, �û�id);

alter table ѡ���� add constraint FK_ִ�ɺ���ѡ�� foreign key (��λ���)
      references ��λ�� (��λ���);

alter table ѡ���� add constraint FK_ѡ����� foreign key (ִ�ɺ�����)
      references ִ�ɺ��� (ִ�ɺ�����);

alter table �ɻ� add constraint FK_R_1 foreign key (���չ�˾���)
      references ���չ�˾ (���չ�˾���);

alter table �ɻ� add constraint FK_Relationship_23 foreign key (���ͱ��)
      references ���� (���ͱ��);

alter table "�ɻ�-����" add constraint "FK_�ɻ�-����" foreign key (�ɻ����)
      references �ɻ� (�ɻ����);

alter table "�ɻ�-����" add constraint "FK_�ɻ�-����2" foreign key (������)
      references ���� (������);

