open module org.springframework {
    requires spring.core;
    requires spring.context;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.jdbc;


    requires java.sql;
/*    requires java.annotation;*/
    requires java.persistence;
    requires spring.boot.starter.data.jpa;
    requires spring.tx;


}
