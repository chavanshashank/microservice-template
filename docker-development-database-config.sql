create database microservice_template;
create user vainoracha_test with password 'microservice_template_test';
alter database microservice_template OWNER TO microservice_template_test;
\connect microservice_template;
create SCHEMA IF NOT EXISTS microservice_template_1;
GRANT ALL PRIVILEGES ON SCHEMA microservice_template_1 TO GROUP microservice_template_test;