drop table if exists t_order_0;
drop table if exists t_order_1;
drop SEQUENCE t_order_0_id_seq;
drop SEQUENCE t_order_1_id_seq;

create table t_order_0 (
  id bigint  PRIMARY KEY,
  order_id int not null ,
  user_id int not null
);

create table t_order_1 (
  id bigint  PRIMARY KEY,
  order_id int not null ,
  user_id int not null
);

CREATE SEQUENCE t_order_0_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
alter table t_order_0 alter column id set default nextval('t_order_0_id_seq');

CREATE SEQUENCE t_order_1_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 alter table t_order_1 alter column id set default nextval('t_order_1_id_seq');


 drop table if exists t_order;
drop SEQUENCE t_order_id_seq;

create table t_order (
  id bigint  PRIMARY KEY,
  order_id int not null ,
  user_id int not null
);

CREATE SEQUENCE t_order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
alter table t_order alter column id set default nextval('t_order_id_seq');