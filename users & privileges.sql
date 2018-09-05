create tablespace aebd_project
datafile '\u01\app\oracle\oradata\orcl12\orcl\aebd_project_01.dbf'
size 100M;

create temporary tablespace aebd_project_temp
tempfile '\u01\app\oracle\oradata\orcl12\orcl\aebd_project_temp.dbf'
size 50M
autoextend on;

select * from dba_tablespaces;

alter session set "_ORACLE_SCRIPT"=true;

create user Bruno
identified by 1234
default tablespace aebd_project
temporary tablespace aebd_project_temp
quota 10M on aebd_project
account unlock;

grant connect to Bruno;

create user Luis
identified by 1234
default tablespace aebd_project
temporary tablespace aebd_project_temp
quota 10M on aebd_project
account unlock;

grant connect to Luis;

create user Maria
identified by 1234
default tablespace aebd_project
temporary tablespace aebd_project_temp
quota 10M on aebd_project
account unlock;

grant connect to Maria;


create user Joao
identified by 1234
default tablespace aebd_project
temporary tablespace aebd_project_temp
quota 10M on aebd_project
account unlock;

grant connect to joao;

select *  from dba_users;

grant create table, create view, create trigger to Luis;

grant drop any table to luis;

grant create sequence to bruno, maria, luis, joao;

grant create trigger to bruno, maria, luis, joao;