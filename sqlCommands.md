<All the Important commands used in the sql database>
---------------------------------------------------

<Before Starting just read this>
-------------------------------
tip1-databases are cyclinder-> in which all the tables(u can call them classes) are kept->in side the class u have related attributes which defines the table;
tip2-letters can be uppercase and lowercase as well but u should write keywords in upper case that is a default convention :)

<DATABASE COMMANDS>
> create database database_name; -> database create krne k liye
> use database_name; -> bnane k baad usme enter krne k liye
> show databases; -> saare databases jitne b hai sql mai dekhne k liye 

<TABLE COMMANDS>
> create table table_name values(col_name type(digits),-,-,-,-........ any number of cols can be added);
> create table table_name values(col1_name type(digits) not null primary key,col2_name type(digits) default 'xyz');
> desc table_name -> to check all the data that is inside the table;
> show tables; to check all the tables present in the current database;
> rename table old_Name to new_Name

<INSERT COMMANDS>
> insert into table_name values(-,-,jitne col bnaye hai utni values dalni padegi(except default values));
> insert into table_name(col_name1,col_name2---upto n) values(col1_value,col2_value); u can leave default values
