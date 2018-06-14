create schema logparser;

create table logparser.logs

(

id  serial primary key,

date datetime(3),

IP varchar(16),

request varchar(20),

status int,

user_agent text

)

 