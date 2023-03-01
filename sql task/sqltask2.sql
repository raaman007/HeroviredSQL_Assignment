
create database Football
-- 2)Create a table name - “Football Venue”.
create table Football_Venue(
Venue_id int not ,
Venue_Country varchar(20) ,
Country_id number ,
Stadium_Capacity int null 
);
-- 3)Insert 10 details in the “Football Venue” table  -
insert into Football_Venue values(1,"Brazil",118,80000);
insert into Football_Venue values(2,"Italy",119,10010);
insert into Football_Venue values(3,"Rome",113,59000);
insert into Football_Venue values(4,"USA",112,75000);
insert into Football_Venue values(5,"Sweden",111,90000);
insert into Football_Venue values(6,"Poland",114,100500);
insert into Football_Venue values(7,"Switzerland",507,96025);
insert into Football_Venue values(8,"Argentina",508,87560);
insert into Football_Venue values(9,"Australia",509,87520);
insert into Football_Venue values(10,"France",510,100750);
-- 4)Count the number of venues of the football world cup
select count(Venue_Country)  from footballvenue;
-- 5)List all the venue names and capacities in the format of “Location” and “Volume”.

select  Venue_Country as Location ,
Stadium_Capacity as Volume from footballvenue
-- 6) Delete all the details where Venue_Country is equal to “Australia”

delete from  footballvenue where venue_name="Australia";
