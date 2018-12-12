
create database football;
use football;
create user 'springuser'@'%' identified by 'password'; -- Creates the user
grant all on football.* to 'springuser'@'%';
