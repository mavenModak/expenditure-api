drop database moneytrackerdb;
drop user tracker;
create user tracker with password 'tiger123';
create database moneytrackerdb with template template0 owner tracker;
\connect moneytrackerdb;
alter default privileges grant all on tables to tracker;
alter default privileges grant all on sequences to tracker;

create table users(
user_id integer primary key not null,
first_name varchar(50) not null,
last_name varchar(50) not null,
email varchar(30) not null,
password text not null
);

create table categories(
category_id integer primary key not null,
user_id integer not null,
title varchar(30) not null,
description varchar(50) not null
);

alter table categories add constraint cat_users_fk
    foreign key (user_id) references users(user_id);

create table transactions(
transaction_id integer primary key not null,
category_id integer not null,
user_id integer not null,
amount numeric(10,2) not null,
note varchar(50) not null,
transaction_date bigint not null
);

alter table transactions add constraint trans_cat_fk
    foreign key (category_id) references categories(category_id);
alter table transactions add constraint trans_users_fk
    foreign key (user_id) references users(user_id);

create sequence users_seq increment 1 start 1;
create sequence categories_seq increment 1 start 1;
create sequence transactions_seq increment 1 start 1000;
