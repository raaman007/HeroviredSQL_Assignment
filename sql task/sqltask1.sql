
create database Employee
--  2)Create a table name - “Employee Details”.
create table Employee_details (
Employee_id int not null ,
Employee_name varchar(20) not null,
Job_role varchar(20) not null,
Managerid int not null ,
Hire_date varchar(20) not null ,
Salary int not null ,
Department_id int not null 
);
-- 3)Insert the details  of 10 employess in the “Employee Details” table  - 
insert into Employee_details  values(88,"Raaman","Front End-developer",10,"10-02-2024",95000,1001);
insert into Employee_details  values(11,"Vinni","Tester",4,"19-02-2024",104000,1002);
insert into Employee_details  values(95,"Sanjay","Back-End Developer",7,"22-01-2022",95000,1003);
insert into Employee_details values(01,"Akash","Developer",5,"04-06-2020",98000,1004);
insert into Employee_details  values(99,"Raj","resource specialist",6,"16-09-2021",65000,1005);
insert into Employee_details  values(87,"Jitesh ","software developer",8,"11-11-2023",90000,1006);
insert into Employee_details  values(83,"Mukesh","HR",9,"22-01-2008",150000,1007);
insert into Employee_details  values(71,"Abhi","Cloud Assistant",1,"22-01-2009",200000,1008);
insert into Employee_details  values(94,"Nithin","Cloud Assistant",3,"22-11-2010",94000,1009);
insert into Employee_details  values(78,"Rajesh","Developer",2,"12-01-2019",110000,1010);
-- 4)Find the salaries of all the employees from the “Employee Details” table.
select Salary from Employee_details
-- 5)Find the unique designations of the employees from the table
select distinct Job_name from Employee_details;
-- 6)Change the salary of the employee  “Raj”.
update Employee_details set Salary= 95000 where Employee_name ="Raj";
