<All the Important commands used in the sql database>
---------------------------------------------------

<Before Starting just read this>
-------------------------------
tip1-databases are cyclinder-> in which all the tables(u can call them classes) are kept->in side the class u have related attributes which defines the table;
tip2-letters can be uppercase and lowercase as well but u should write keywords in upper case that is a default convention :)

<<<<<<<DML COMMANDS>>>>>>>>
    <create database database_name;> -> database create krne k liye
    <use database_name;> -> bnane k baad usme enter krne k liye
    <show databases;> -> saare databases jitne b hai sql mai dekhne k liye 

<TABLE COMMANDS>
    <create table table_name values(col_name type(digits),col_name2(digits(20)));>
    <create table table_name values(col1_name type(digits) not null primary key, col2_name type(digits) default 'xyz');>
    <desc table_name;> -> to check all the data that is inside the table;
    <show tables;> to check all the tables present in the current database;


<INSERT COMMANDS>
    <insert into table_name values(-,-,jitne col bnaye hai utni values dalni padegi(except default values));>
    <insert into table_name(col_name1,col_name2---upto n) values(col1_value,col2_value);> u can leave default values

<RENAME COMMANDS>
    <rename table old_Name to new_Name;> to change one table name
    <rename table oldName to newName,oldname2 to newName2;> to change multiple names at the same time; 

<TRUNCATE COMMANDS>
    <truncate table_name;> to remove all the rows of the table ;

<DROP COMMANDS>
    <drop table table_name;> to drop the whole table
    <drop database database_name> to delete the database;

<ALTER COMMANDS>
    <ADD>
        <alter table table_name add(col_name type(digit),-,-);> to add one or more columns in the table;
        <alter table table_name add(col_name type(digits) default 'xyz');>
    <MODIFY>
        <alter table table_name modify column column_name type(digits)>; to modify the column details of the table
    <CHANGE>
        <alter table table_name change column_name newCol_name type(digits);>
    <DROP>
        <alter table table_name drop column_name;> to drop a perticular column

<SELECT COMMANDS>
    <select * from table;> saare values ko select krne k liye;
    <select col1_name,col2_name from table;> to select perticular columns from the table;
    <select col2_name,col1_name from table;> aage piche b select kr skte hai;

<UPDATE COMMANDS>
    <update table_name set col_name = "anything";>

<AGGRIGATE FUNCTIONS> THEY ARE GENERALLY USED WITH SELECT
    <AVGERAGE>
        <select avg(col_name) from table_name>
    <MINIMUM>
        <select min(col_name) from table_name>
    <MAXIMUM>
        <select max(col_name) from table_name>
    <COUNT> IT DOESN'T COUNT NULL VALUES
        <select count(col_name) from table_name>
    <SUM>
        <select sum(col_name) from table_name>
    <COUNT(*)> IT COUNTS NULL VALUES
        <select count(*) from table_name>
    

WE CAN ALSO SELECT MULTIPLE MIN MAX FUNTIONS-> <select avg(col_name), max(col_name) from table_name>;


        
