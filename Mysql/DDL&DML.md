A:数据库

  ~~~sql
  1.mysql -u root -p                                           	进入数据库

  2.create databse 数据库名;                           			创建数据库

  3.drop database 数据库名;                            			删除数据库

  4.use 数据库名;                                                使用数据库

  5.select database();                                         	查看当前使用的是哪个数据库

  6.show databases;                                          	查看一共有多少数据库

  7.create database character set 编码名称(utf-8/gbk);         	 设置数据库编码模式

  8.show create database 数据库名;                            	 查看该数据库编码模式

  ~~~



B:表

  ~~~
  1.drop table 表名;                                           删除表

  2.desc 表名;                                                 查看表的结构

  3.show tables;                                               查看该数据库中有多少表

  4.show create table 表名;                                    查看该表的编码模式

  5.create table 表名(           创建一张表  
  		字段名  数据类型(长度)  [约束],
  		字段名  数据类型(长度)  [约束],
  		字段名  数据类型(长度)  [约束]
  );
  
例如:
create table tb_user(          创建了一个名为tb_user的表,主键为uId,
   uId int(32) primary key auto_increment,
   uName varchar(32),
   uPassword varchar(32)
); 

  ~~~



C:表的操作

 ~~~
  1.alter table 表名 add  列名 数据类型(长度) [约束];                 	修改此表,添加该列

  2.alter table 表名 drop 列名;                                        修改此表,删除该列

  3.alter table 表名 modify 数据类型(长度) [约束];                      修改此表的数据类型和约束

  4.alter table 表名 change 旧列名 新列名 数据类型(长度) [约束];         修改此表的列名

  5.rename table 表名 to 新表名;                                       修改此表的表名

  6.alter table 表名 character set 字符集;                             修改此表的字符集

 ~~~



  

D:表的增删改
  1.insert into 表名 values(值1,值2,值3....);                         插入数据到该表中(依次)
      insert into tb_user values(1,'张三','123456','20');

  2.update 表名 set 字段名(或列名) = 值 where [条件];                更新该表中的字段名=值;
      update tb_user set uName ='李四' where uPassword='123456'; 

  3.delete from 表名 where [条件]                                当uId=1时,删除该列
     delete from tb_user where uId='1'; 

  4.表的乱码问题:
      a:win+R
      b:cmd
      c:mysql>   set names gbk;

E:简单查询
   1.select * from 表名;                                           查询所有商品
       select * from product;

   2.select (列名1,,列名2....)  from 表名;                         查询商品名和商品价格
        select pId , pName   from product;
   3.select * from 表名 as **;                                     使用表别名查询(查询的是整张表)
       select * from product as p;

   4.select 列名 as ** from 表名;                                  使用列别名查询(查询的该列)
       select pName as name from product;(支持多列一起查询)

   5.select distinct 列名 from 表名;                               去掉重复值查询
      select distinct price from product;(去掉表中价格相同的列，只保留一列)

   6.运算查询
       select pName,price+10 from product;          (将表中的所有商品价格+10)   

F:条件查询
  1.select * from 表名 where 列名='***';                           查询名称为**的那一列
        select * from product where pname='张三';                  

  2.select * from 表名 where 列名 >**;(比较运算符都行)             查询名称>**的那一列
        select * from product where price>80;   

  3.select * from 表名 where 列名 like '%**%';                     
        select * from product where pName like '%三%';             查询出名字中带三的所有列

  4.select * from product where pId in (1,2,3,4);                  查询在**返回内的id   

G:排序
     默认为升序排列   select * from product order by price;
     
     1.select * from product order by price asc;                      升序排列  
    
     2.select * from product order by price desc;                     降序排列
    

  

H:聚合

  ~~~
  1.select sum(price) from product;                                和

  2.select avg(price) from product;                                平均值

  3.select max(price) from product;                                最大值

  4.select min(price) from product;                                最小值

  5.select count(*) from product;                                  个数

  ~~~



I:分组:
   设置分组:
      alter table product add cId varchar(32);              --->添加一个列
      update product set '1';                               --->设置所有cId为1
      update product set '2' where pId in(4,5,6);           --->设置其中一部分为2
      
      这样就以cId为组名分成两个组了

  select cId ,count(*) from product group by cId;             根据cId分组,分组后统计商品的个数

  select cId,avg(price) from product group by cId having avg(price)>60;
                                                              根据cId分组,求分组后平均价格>60的平均价格价格  

   分页查询:
        select * from product limit 6 ,3;      分页查询,从滴7列开始，查询3列

​		
关闭外键约束:SET FOREIGN_KEY_CHECKS = 0
打开外键约束:SET  FOREIGN_KEY_CHECKS = 1


`alter table 表名 add constraint FK_ID foreign key(你的外键字段名) REFERENCES 外表表名(对应的表的主键字段名);`