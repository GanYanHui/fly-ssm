/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2012                    */
/* Created on:     2020/6/23 22:57:26                           */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('���¥') and o.name = 'FK_���¥_���¥����_����')
alter table ���¥
   drop constraint FK_���¥_���¥����_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_RELATIONS_ʡ')
alter table ����
   drop constraint FK_����_RELATIONS_ʡ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��λ��') and o.name = 'FK_��λ��_��Ӧ��λ��_����')
alter table ��λ��
   drop constraint FK_��λ��_��Ӧ��λ��_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��λ��') and o.name = 'FK_��λ��_��Ӧ��λ_��λ')
alter table ��λ��
   drop constraint FK_��λ��_��Ӧ��λ_��λ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ִ�ɺ���') and o.name = 'FK_ִ�ɺ���_ִ�ɺ��๹��_����')
alter table ִ�ɺ���
   drop constraint FK_ִ�ɺ���_ִ�ɺ��๹��_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_RELATIONS_����')
alter table ����
   drop constraint FK_����_RELATIONS_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��������Ա') and o.name = 'FK_��������Ա_���3_�û���')
alter table ��������Ա
   drop constraint FK_��������Ա_���3_�û���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ') and o.name = 'FK_��Ʊ_ֵ��ѡ��_ѡ����')
alter table ��Ʊ
   drop constraint FK_��Ʊ_ֵ��ѡ��_ѡ����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ') and o.name = 'FK_��Ʊ_��Ӧ�˻���_�˻���')
alter table ��Ʊ
   drop constraint FK_��Ʊ_��Ӧ�˻���_�˻���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ') and o.name = 'FK_��Ʊ_���๹��_��Ʊ����')
alter table ��Ʊ
   drop constraint FK_��Ʊ_���๹��_��Ʊ����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ') and o.name = 'FK_��Ʊ_ϸĿ����_����')
alter table ��Ʊ
   drop constraint FK_��Ʊ_ϸĿ����_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ����') and o.name = 'FK_��Ʊ����_��Ʊ����1_ִ�ɺ���')
alter table ��Ʊ����
   drop constraint FK_��Ʊ����_��Ʊ����1_ִ�ɺ���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��Ʊ����') and o.name = 'FK_��Ʊ����_��Ʊ����2_��λ')
alter table ��Ʊ����
   drop constraint FK_��Ʊ����_��Ʊ����2_��λ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('�û�') and o.name = 'FK_�û�_���1_�û���')
alter table �û�
   drop constraint FK_�û�_���1_�û���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����Ա') and o.name = 'FK_����Ա_���2_�û���')
alter table ����Ա
   drop constraint FK_����Ա_���2_�û���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��') and o.name = 'FK_��_��_�û�')
alter table ��
   drop constraint FK_��_��_�û�
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('��') and o.name = 'FK_��_��2_�˻���')
alter table ��
   drop constraint FK_��_��2_�˻���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_R_13_����')
alter table ����
   drop constraint FK_����_R_13_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_������_���¥')
alter table ����
   drop constraint FK_����_������_���¥
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_���͹���_����')
alter table ����
   drop constraint FK_����_���͹���_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_Ŀ�ĵ�_���¥')
alter table ����
   drop constraint FK_����_Ŀ�ĵ�_���¥
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_��������_��Ʊ')
alter table ����
   drop constraint FK_����_��������_��Ʊ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('����') and o.name = 'FK_����_��Ʊ_�û�')
alter table ����
   drop constraint FK_����_��Ʊ_�û�
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ѡ����') and o.name = 'FK_ѡ����_ִ�ɺ���ѡ��_��λ��')
alter table ѡ����
   drop constraint FK_ѡ����_ִ�ɺ���ѡ��_��λ��
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ѡ����') and o.name = 'FK_ѡ����_ѡ�����_ִ�ɺ���')
alter table ѡ����
   drop constraint FK_ѡ����_ѡ�����_ִ�ɺ���
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('�ɻ�') and o.name = 'FK_�ɻ�_R_1_���չ�˾')
alter table �ɻ�
   drop constraint FK_�ɻ�_R_1_���չ�˾
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('�ɻ�') and o.name = 'FK_�ɻ�_RELATIONS_����')
alter table �ɻ�
   drop constraint FK_�ɻ�_RELATIONS_����
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"�ɻ�-����"') and o.name = 'FK_�ɻ�-����_�ɻ�-����_�ɻ�')
alter table "�ɻ�-����"
   drop constraint "FK_�ɻ�-����_�ɻ�-����_�ɻ�"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"�ɻ�-����"') and o.name = 'FK_�ɻ�-����_�ɻ�-����2_����')
alter table "�ɻ�-����"
   drop constraint "FK_�ɻ�-����_�ɻ�-����2_����"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('�˻���')
            and   type = 'U')
   drop table �˻���
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('���¥')
            and   name  = '���¥����_FK'
            and   indid > 0
            and   indid < 255)
   drop index ���¥.���¥����_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('���¥')
            and   type = 'U')
   drop table ���¥
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = 'Relationship_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.Relationship_13_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��λ��')
            and   name  = '��Ӧ��λ_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��λ��.��Ӧ��λ_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��λ��')
            and   name  = '��Ӧ��λ��_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��λ��.��Ӧ��λ��_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��λ��')
            and   type = 'U')
   drop table ��λ��
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ִ�ɺ���')
            and   name  = 'ִ�ɺ��๹��_FK'
            and   indid > 0
            and   indid < 255)
   drop index ִ�ɺ���.ִ�ɺ��๹��_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ִ�ɺ���')
            and   type = 'U')
   drop table ִ�ɺ���
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = 'Relationship_14_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.Relationship_14_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��������Ա')
            and   type = 'U')
   drop table ��������Ա
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ')
            and   name  = 'ֵ��ѡ��_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ.ֵ��ѡ��_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ')
            and   name  = '���๹��_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ.���๹��_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ')
            and   name  = '��Ӧ�˻���_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ.��Ӧ�˻���_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ')
            and   name  = 'ϸĿ����_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ.ϸĿ����_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��Ʊ')
            and   type = 'U')
   drop table ��Ʊ
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ����')
            and   name  = '��Ʊ����1_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ����.��Ʊ����1_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��Ʊ����')
            and   name  = '��Ʊ����2_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��Ʊ����.��Ʊ����2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��Ʊ����')
            and   type = 'U')
   drop table ��Ʊ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('�û�')
            and   name  = '���1_FK'
            and   indid > 0
            and   indid < 255)
   drop index �û�.���1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('�û�')
            and   type = 'U')
   drop table �û�
go

if exists (select 1
            from  sysobjects
           where  id = object_id('�û���')
            and   type = 'U')
   drop table �û���
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ʡ')
            and   type = 'U')
   drop table ʡ
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����Ա')
            and   name  = '���2_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����Ա.���2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����Ա')
            and   type = 'U')
   drop table ����Ա
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��')
            and   name  = '��2_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��.��2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('��')
            and   name  = '��_FK'
            and   indid > 0
            and   indid < 255)
   drop index ��.��_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��')
            and   type = 'U')
   drop table ��
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = '���͹���_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.���͹���_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = 'Ŀ�ĵ�_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.Ŀ�ĵ�_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = '������_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.������_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = 'R_13_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.R_13_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysobjects
           where  id = object_id('���չ�˾')
            and   type = 'U')
   drop table ���չ�˾
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysobjects
           where  id = object_id('��λ')
            and   type = 'U')
   drop table ��λ
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = '��������_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.��������_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('����')
            and   name  = '��Ʊ_FK'
            and   indid > 0
            and   indid < 255)
   drop index ����.��Ʊ_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('����')
            and   type = 'U')
   drop table ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ѡ����')
            and   name  = 'ѡ�����_FK'
            and   indid > 0
            and   indid < 255)
   drop index ѡ����.ѡ�����_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ѡ����')
            and   type = 'U')
   drop table ѡ����
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('�ɻ�')
            and   name  = 'Relationship_23_FK'
            and   indid > 0
            and   indid < 255)
   drop index �ɻ�.Relationship_23_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('�ɻ�')
            and   name  = 'R_1_FK'
            and   indid > 0
            and   indid < 255)
   drop index �ɻ�.R_1_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('�ɻ�')
            and   type = 'U')
   drop table �ɻ�
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"�ɻ�-����"')
            and   name  = '�ɻ�-����2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "�ɻ�-����"."�ɻ�-����2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"�ɻ�-����"')
            and   name  = '�ɻ�-����_FK'
            and   indid > 0
            and   indid < 255)
   drop index "�ɻ�-����"."�ɻ�-����_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"�ɻ�-����"')
            and   type = 'U')
   drop table "�ɻ�-����"
go

/*==============================================================*/
/* Table: �˻���                                                   */
/*==============================================================*/
create table �˻��� (
   �˻������֤��              char(18)             not null,
   �˻�������                varchar(20)          null,
   �˻����Ա�                char(2)              null,
   �˻�����ϵ�绰              varchar(20)          null,
   ����״̬                 varchar(10)          null,
   constraint PK_�˻��� primary key nonclustered (�˻������֤��)
)
go

/*==============================================================*/
/* Table: ���¥                                                   */
/*==============================================================*/
create table ���¥ (
   ���¥���                varchar(20)          not null,
   "������/������"            varchar(20)          not null,
   ���¥����                varchar(20)          null,
   constraint PK_���¥ primary key nonclustered (���¥���)
)
go

/*==============================================================*/
/* Index: ���¥����_FK                                              */
/*==============================================================*/
create index ���¥����_FK on ���¥ (
"������/������" ASC
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ���б��                 varchar(20)          not null,
   ʡ���                  varchar(20)          not null,
   ������                  varchar(20)          null,
   �ʱ�                   char(6)              null,
   constraint PK_���� primary key nonclustered (���б��)
)
go

/*==============================================================*/
/* Index: Relationship_13_FK                                    */
/*==============================================================*/
create index Relationship_13_FK on ���� (
ʡ��� ASC
)
go

/*==============================================================*/
/* Table: ��λ��                                                   */
/*==============================================================*/
create table ��λ�� (
   ��λ���                 int                  not null,
   ���ͱ��                 varchar(20)          not null,
   ��λ���                 varchar(20)          not null,
   λ��                   varchar(20)          null,
   ��ȫ��λ                 bit                  null,
   constraint PK_��λ�� primary key nonclustered (��λ���)
)
go

/*==============================================================*/
/* Index: ��Ӧ��λ��_FK                                              */
/*==============================================================*/
create index ��Ӧ��λ��_FK on ��λ�� (
���ͱ�� ASC
)
go

/*==============================================================*/
/* Index: ��Ӧ��λ_FK                                               */
/*==============================================================*/
create index ��Ӧ��λ_FK on ��λ�� (
��λ��� ASC
)
go

/*==============================================================*/
/* Table: ִ�ɺ���                                                  */
/*==============================================================*/
create table ִ�ɺ��� (
   ִ�ɺ�����               varchar(20)          not null,
   ������                 varchar(20)          not null,
   ִ������                 datetime             null,
   ִ�м۸�                 double precision     null,
   Ԥ�����ʱ��               datetime             null,
   Ԥ�Ƶ���ʱ��               datetime             null,
   ʵ�����ʱ��               datetime             null,
   ʵ�ʵ���ʱ��               datetime             null,
   ״̬                   varchar(50)          null,
   �ǻ���                  varchar(20)          null,
   �ǻ�ʱ��                 datetime             null,
   constraint PK_ִ�ɺ��� primary key nonclustered (ִ�ɺ�����)
)
go

/*==============================================================*/
/* Index: ִ�ɺ��๹��_FK                                             */
/*==============================================================*/
create index ִ�ɺ��๹��_FK on ִ�ɺ��� (
������ ASC
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   "������/������"            varchar(20)          not null,
   ���б��                 varchar(20)          not null,
   ��������                 varchar(20)          null,
   ������ַ                 varchar(50)          null,
   ������ϵ�绰               varchar(20)          null,
   constraint PK_���� primary key nonclustered ("������/������")
)
go

/*==============================================================*/
/* Index: Relationship_14_FK                                    */
/*==============================================================*/
create index Relationship_14_FK on ���� (
���б�� ASC
)
go

/*==============================================================*/
/* Table: ��������Ա                                                 */
/*==============================================================*/
create table ��������Ա (
   ��¼id                 varchar(20)          not null,
   ��¼����                 varchar(20)          null,
   ��ϵ�绰                 varchar(20)          null,
   ����                   varchar(20)          null,
   ��������Աid              varchar(20)          not null,
   Ȩ��                   varchar(100)         null,
   constraint PK_��������Ա primary key nonclustered (��¼id)
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ���ͱ��                 varchar(20)          not null,
   ��������                 varchar(20)          null,
   constraint PK_���� primary key nonclustered (���ͱ��)
)
go

/*==============================================================*/
/* Table: ��Ʊ                                                    */
/*==============================================================*/
create table ��Ʊ (
   ��Ʊ���                 varchar(20)          not null,
   �˻������֤��              char(18)             not null,
   ������                  varchar(20)          not null,
   ��λ���                 varchar(20)          not null,
   ִ�ɺ�����               varchar(20)          not null,
   ��λ���                 int                  not null,
   ���������                double precision     null,
   ���շ�                  double precision     null,
   ��Ʊ�۸�                 double precision     null,
   ��ע                   varchar(200)         null,
   ֵ��״̬                 varchar(20)          null,
   �ǻ���                  varchar(20)          null,
   constraint PK_��Ʊ primary key nonclustered (��Ʊ���)
)
go

/*==============================================================*/
/* Index: ϸĿ����_FK                                               */
/*==============================================================*/
create index ϸĿ����_FK on ��Ʊ (
������ ASC
)
go

/*==============================================================*/
/* Index: ��Ӧ�˻���_FK                                              */
/*==============================================================*/
create index ��Ӧ�˻���_FK on ��Ʊ (
�˻������֤�� ASC
)
go

/*==============================================================*/
/* Index: ���๹��_FK                                               */
/*==============================================================*/
create index ���๹��_FK on ��Ʊ (
��λ��� ASC,
ִ�ɺ����� ASC
)
go

/*==============================================================*/
/* Index: ֵ��ѡ��_FK                                               */
/*==============================================================*/
create index ֵ��ѡ��_FK on ��Ʊ (
��λ��� ASC
)
go

/*==============================================================*/
/* Table: ��Ʊ����                                                  */
/*==============================================================*/
create table ��Ʊ���� (
   ��λ���                 varchar(20)          not null,
   ִ�ɺ�����               varchar(20)          not null,
   ���ۼ۸�                 double precision     null,
   ��Ч��ʼ����               datetime             null,
   ��Ч��������               datetime             null,
   �ۿ�                   double precision     null,
   ��Ʊ��                  int                  null,
   ������                 int                  null,
   �������                 int                  null,
   ��ʳ״̬                 char(2)              null,
   �˸�ǩ����                varchar(500)         null,
   constraint PK_��Ʊ���� primary key nonclustered (��λ���, ִ�ɺ�����)
)
go

/*==============================================================*/
/* Index: ��Ʊ����2_FK                                              */
/*==============================================================*/
create index ��Ʊ����2_FK on ��Ʊ���� (
��λ��� ASC
)
go

/*==============================================================*/
/* Index: ��Ʊ����1_FK                                              */
/*==============================================================*/
create index ��Ʊ����1_FK on ��Ʊ���� (
ִ�ɺ����� ASC
)
go

/*==============================================================*/
/* Table: �û�                                                    */
/*==============================================================*/
create table �û� (
   ��¼id                 varchar(20)          not null,
   �û�id                 varchar(20)          not null,
   ��¼����                 varchar(20)          null,
   ��ϵ�绰                 varchar(20)          null,
   ����                   varchar(20)          null,
   �û�����                 varchar(20)          null,
   �û����֤��               char(18)             null,
   �û��Ա�                 char(2)              null,
   �û�����                 int                  null,
   �û�����                 int                  null,
   constraint PK_�û� primary key nonclustered (��¼id, �û�id)
)
go

/*==============================================================*/
/* Index: ���1_FK                                                */
/*==============================================================*/
create index ���1_FK on �û� (
��¼id ASC
)
go

/*==============================================================*/
/* Table: �û���                                                   */
/*==============================================================*/
create table �û��� (
   ��¼id                 varchar(20)          not null,
   ��¼����                 varchar(20)          null,
   ��ϵ�绰                 varchar(20)          null,
   ����                   varchar(20)          null,
   constraint PK_�û��� primary key nonclustered (��¼id)
)
go

/*==============================================================*/
/* Table: ʡ                                                     */
/*==============================================================*/
create table ʡ (
   ʡ���                  varchar(20)          not null,
   ʡ��                   varchar(20)          null,
   ʡ��                   varchar(20)          null,
   constraint PK_ʡ primary key nonclustered (ʡ���)
)
go

/*==============================================================*/
/* Table: ����Ա                                                   */
/*==============================================================*/
create table ����Ա (
   ��¼id                 varchar(20)          not null,
   ����Աid                varchar(20)          not null,
   ��¼����                 varchar(20)          null,
   ��ϵ�绰                 varchar(20)          null,
   ����                   varchar(20)          null,
   ����ԱȨ��                varchar(100)         null,
   constraint PK_����Ա primary key nonclustered (��¼id, ����Աid)
)
go

/*==============================================================*/
/* Index: ���2_FK                                                */
/*==============================================================*/
create index ���2_FK on ����Ա (
��¼id ASC
)
go

/*==============================================================*/
/* Table: ��                                                    */
/*==============================================================*/
create table �� (
   ��¼id                 varchar(20)          not null,
   �û�id                 varchar(20)          not null,
   �˻������֤��              char(18)             not null,
   ��ʱ��                 datetime             null,
   constraint PK_�� primary key nonclustered (��¼id, �û�id, �˻������֤��)
)
go

/*==============================================================*/
/* Index: ��_FK                                                 */
/*==============================================================*/
create index ��_FK on �� (
��¼id ASC,
�û�id ASC
)
go

/*==============================================================*/
/* Index: ��2_FK                                                */
/*==============================================================*/
create index ��2_FK on �� (
�˻������֤�� ASC
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ������                 varchar(20)          not null,
   ���߱��                 varchar(20)          not null,
   ���ͱ��                 varchar(20)          not null,
   ���¥���                varchar(20)          not null,
   ���¥_���¥���            varchar(20)          not null,
   �ƻ����ʱ��               datetime             not null,
   �ƻ�����ʱ��               datetime             not null,
   constraint PK_���� primary key nonclustered (������)
)
go

/*==============================================================*/
/* Index: R_13_FK                                               */
/*==============================================================*/
create index R_13_FK on ���� (
���߱�� ASC
)
go

/*==============================================================*/
/* Index: ������_FK                                                */
/*==============================================================*/
create index ������_FK on ���� (
���¥_���¥��� ASC
)
go

/*==============================================================*/
/* Index: Ŀ�ĵ�_FK                                                */
/*==============================================================*/
create index Ŀ�ĵ�_FK on ���� (
���¥��� ASC
)
go

/*==============================================================*/
/* Index: ���͹���_FK                                               */
/*==============================================================*/
create index ���͹���_FK on ���� (
���ͱ�� ASC
)
go

/*==============================================================*/
/* Table: ���չ�˾                                                  */
/*==============================================================*/
create table ���չ�˾ (
   ���չ�˾���               varchar(20)          not null,
   ���չ�˾����               varchar(50)          not null,
   ���չ�˾��ϵ�绰             varchar(50)          not null,
   constraint PK_���չ�˾ primary key nonclustered (���չ�˾���)
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ���߱��                 varchar(20)          not null,
   ��������                 varchar(20)          null,
   �������                 varchar(20)          null,
   constraint PK_���� primary key nonclustered (���߱��)
)
go

/*==============================================================*/
/* Table: ��λ                                                    */
/*==============================================================*/
create table ��λ (
   ��λ���                 varchar(20)          not null,
   ��λ�ȼ�                 varchar(50)          null,
   constraint PK_��λ primary key nonclustered (��λ���)
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ������                 varchar(20)          not null,
   ��Ʊ���                 varchar(20)          not null,
   ��������                 double precision     null,
   ��                    double precision     null,
   ��                    double precision     null,
   ��                    double precision     null,
   ����                   double precision     null,
   constraint PK_���� primary key nonclustered (������)
)
go

/*==============================================================*/
/* Index: ��������_FK                                               */
/*==============================================================*/
create index ��������_FK on ���� (
��Ʊ��� ASC
)
go

/*==============================================================*/
/* Table: ����                                                    */
/*==============================================================*/
create table ���� (
   ������                  varchar(20)          not null,
   ��¼id                 varchar(20)          not null,
   �û�id                 varchar(20)          not null,
   ��������                 datetime             null,
   ��Ʊ��                  int                  null,
   "�ѹ�/���ͷ���"            varchar(50)          null,
   ��ϵ�绰                 varchar(20)          null,
   ���û���                 int                  null,
   �ܶ�                   double precision     null,
   ����״̬                 varchar(50)          null,
   constraint PK_���� primary key nonclustered (������)
)
go

/*==============================================================*/
/* Index: ��Ʊ_FK                                                 */
/*==============================================================*/
create index ��Ʊ_FK on ���� (
��¼id ASC,
�û�id ASC
)
go

/*==============================================================*/
/* Table: ѡ����                                                   */
/*==============================================================*/
create table ѡ���� (
   ��λ���                 int                  not null,
   ִ�ɺ�����               varchar(20)          not null,
   ״̬                   varchar(50)          null,
   constraint PK_ѡ���� primary key nonclustered (��λ���)
)
go

/*==============================================================*/
/* Index: ѡ�����_FK                                               */
/*==============================================================*/
create index ѡ�����_FK on ѡ���� (
ִ�ɺ����� ASC
)
go

/*==============================================================*/
/* Table: �ɻ�                                                    */
/*==============================================================*/
create table �ɻ� (
   �ɻ�����                 varchar(20)          not null,
   ���չ�˾���               varchar(20)          not null,
   ���ͱ��                 varchar(20)          not null,
   �ɻ�����                 varchar(20)          null,
   ����                   float                null,
   ��λ��                  int                  null,
   �������                 float                null,
   constraint PK_�ɻ� primary key nonclustered (�ɻ�����)
)
go

/*==============================================================*/
/* Index: R_1_FK                                                */
/*==============================================================*/
create index R_1_FK on �ɻ� (
���չ�˾��� ASC
)
go

/*==============================================================*/
/* Index: Relationship_23_FK                                    */
/*==============================================================*/
create index Relationship_23_FK on �ɻ� (
���ͱ�� ASC
)
go

/*==============================================================*/
/* Table: "�ɻ�-����"                                               */
/*==============================================================*/
create table "�ɻ�-����" (
   �ɻ�����                 varchar(20)          not null,
   ������                 varchar(20)          not null,
   �Ƿ���빲��               bit                  not null,
   constraint "PK_�ɻ�-����" primary key nonclustered (�ɻ�����, ������)
)
go

/*==============================================================*/
/* Index: "�ɻ�-����_FK"                                            */
/*==============================================================*/
create index "�ɻ�-����_FK" on "�ɻ�-����" (
�ɻ����� ASC
)
go

/*==============================================================*/
/* Index: "�ɻ�-����2_FK"                                           */
/*==============================================================*/
create index "�ɻ�-����2_FK" on "�ɻ�-����" (
������ ASC
)
go

alter table ���¥
   add constraint FK_���¥_���¥����_���� foreign key ("������/������")
      references ���� ("������/������")
go

alter table ����
   add constraint FK_����_RELATIONS_ʡ foreign key (ʡ���)
      references ʡ (ʡ���)
go

alter table ��λ��
   add constraint FK_��λ��_��Ӧ��λ��_���� foreign key (���ͱ��)
      references ���� (���ͱ��)
go

alter table ��λ��
   add constraint FK_��λ��_��Ӧ��λ_��λ foreign key (��λ���)
      references ��λ (��λ���)
go

alter table ִ�ɺ���
   add constraint FK_ִ�ɺ���_ִ�ɺ��๹��_���� foreign key (������)
      references ���� (������)
go

alter table ����
   add constraint FK_����_RELATIONS_���� foreign key (���б��)
      references ���� (���б��)
go

alter table ��������Ա
   add constraint FK_��������Ա_���3_�û��� foreign key (��¼id)
      references �û��� (��¼id)
go

alter table ��Ʊ
   add constraint FK_��Ʊ_ֵ��ѡ��_ѡ���� foreign key (��λ���)
      references ѡ���� (��λ���)
go

alter table ��Ʊ
   add constraint FK_��Ʊ_��Ӧ�˻���_�˻��� foreign key (�˻������֤��)
      references �˻��� (�˻������֤��)
go

alter table ��Ʊ
   add constraint FK_��Ʊ_���๹��_��Ʊ���� foreign key (��λ���, ִ�ɺ�����)
      references ��Ʊ���� (��λ���, ִ�ɺ�����)
go

alter table ��Ʊ
   add constraint FK_��Ʊ_ϸĿ����_���� foreign key (������)
      references ���� (������)
go

alter table ��Ʊ����
   add constraint FK_��Ʊ����_��Ʊ����1_ִ�ɺ��� foreign key (ִ�ɺ�����)
      references ִ�ɺ��� (ִ�ɺ�����)
go

alter table ��Ʊ����
   add constraint FK_��Ʊ����_��Ʊ����2_��λ foreign key (��λ���)
      references ��λ (��λ���)
go

alter table �û�
   add constraint FK_�û�_���1_�û��� foreign key (��¼id)
      references �û��� (��¼id)
go

alter table ����Ա
   add constraint FK_����Ա_���2_�û��� foreign key (��¼id)
      references �û��� (��¼id)
go

alter table ��
   add constraint FK_��_��_�û� foreign key (��¼id, �û�id)
      references �û� (��¼id, �û�id)
go

alter table ��
   add constraint FK_��_��2_�˻��� foreign key (�˻������֤��)
      references �˻��� (�˻������֤��)
go

alter table ����
   add constraint FK_����_R_13_���� foreign key (���߱��)
      references ���� (���߱��)
go

alter table ����
   add constraint FK_����_������_���¥ foreign key (���¥_���¥���)
      references ���¥ (���¥���)
go

alter table ����
   add constraint FK_����_���͹���_���� foreign key (���ͱ��)
      references ���� (���ͱ��)
go

alter table ����
   add constraint FK_����_Ŀ�ĵ�_���¥ foreign key (���¥���)
      references ���¥ (���¥���)
go

alter table ����
   add constraint FK_����_��������_��Ʊ foreign key (��Ʊ���)
      references ��Ʊ (��Ʊ���)
go

alter table ����
   add constraint FK_����_��Ʊ_�û� foreign key (��¼id, �û�id)
      references �û� (��¼id, �û�id)
go

alter table ѡ����
   add constraint FK_ѡ����_ִ�ɺ���ѡ��_��λ�� foreign key (��λ���)
      references ��λ�� (��λ���)
go

alter table ѡ����
   add constraint FK_ѡ����_ѡ�����_ִ�ɺ��� foreign key (ִ�ɺ�����)
      references ִ�ɺ��� (ִ�ɺ�����)
go

alter table �ɻ�
   add constraint FK_�ɻ�_R_1_���չ�˾ foreign key (���չ�˾���)
      references ���չ�˾ (���չ�˾���)
go

alter table �ɻ�
   add constraint FK_�ɻ�_RELATIONS_���� foreign key (���ͱ��)
      references ���� (���ͱ��)
go

alter table "�ɻ�-����"
   add constraint "FK_�ɻ�-����_�ɻ�-����_�ɻ�" foreign key (�ɻ�����)
      references �ɻ� (�ɻ�����)
go

alter table "�ɻ�-����"
   add constraint "FK_�ɻ�-����_�ɻ�-����2_����" foreign key (������)
      references ���� (������)
go

