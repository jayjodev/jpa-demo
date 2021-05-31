## Spring JPA(hibernate) demo

Create `test` database / user & give a permission.
 
```
mysql -u root -p

mysql> CREATE DATABASE test;
mysql> 
CREATE USER 'admin'@'%';
ALTER USER 'admin'@'%'
IDENTIFIED BY 'admin' ;
GRANT Create role ON *.* TO 'admin'@'%';
GRANT Create user ON *.* TO 'admin'@'%';
GRANT Drop role ON *.* TO 'admin'@'%';
GRANT Event ON *.* TO 'admin'@'%';
GRANT File ON *.* TO 'admin'@'%';
GRANT Process ON *.* TO 'admin'@'%';
GRANT Reload ON *.* TO 'admin'@'%';
GRANT Replication client ON *.* TO 'admin'@'%';
GRANT Replication slave ON *.* TO 'admin'@'%';
GRANT Show databases ON *.* TO 'admin'@'%';
GRANT Shutdown ON *.* TO 'admin'@'%';
GRANT Super ON *.* TO 'admin'@'%';
GRANT Create tablespace ON *.* TO 'admin'@'%';
GRANT Usage ON *.* TO 'admin'@'%';
GRANT XA_RECOVER_ADMIN ON *.* TO 'admin'@'%';
GRANT SHOW_ROUTINE ON *.* TO 'admin'@'%';
GRANT TABLE_ENCRYPTION_ADMIN ON *.* TO 'admin'@'%';
GRANT SERVICE_CONNECTION_ADMIN ON *.* TO 'admin'@'%';
GRANT ROLE_ADMIN ON *.* TO 'admin'@'%';
GRANT CONNECTION_ADMIN ON *.* TO 'admin'@'%';
GRANT CLONE_ADMIN ON *.* TO 'admin'@'%';
GRANT FLUSH_USER_RESOURCES ON *.* TO 'admin'@'%';
GRANT REPLICATION_SLAVE_ADMIN ON *.* TO 'admin'@'%';
GRANT APPLICATION_PASSWORD_ADMIN ON *.* TO 'admin'@'%';
GRANT REPLICATION_APPLIER ON *.* TO 'admin'@'%';
GRANT FLUSH_OPTIMIZER_COSTS ON *.* TO 'admin'@'%';
GRANT RESOURCE_GROUP_ADMIN ON *.* TO 'admin'@'%';
GRANT ENCRYPTION_KEY_ADMIN ON *.* TO 'admin'@'%';
GRANT BINLOG_ENCRYPTION_ADMIN ON *.* TO 'admin'@'%';
GRANT PERSIST_RO_VARIABLES_ADMIN ON *.* TO 'admin'@'%';
GRANT BINLOG_ADMIN ON *.* TO 'admin'@'%';
GRANT INNODB_REDO_LOG_ENABLE ON *.* TO 'admin'@'%';
GRANT AUDIT_ADMIN ON *.* TO 'admin'@'%';
GRANT RESOURCE_GROUP_USER ON *.* TO 'admin'@'%';
GRANT SET_USER_ID ON *.* TO 'admin'@'%';
GRANT SYSTEM_VARIABLES_ADMIN ON *.* TO 'admin'@'%';
GRANT INNODB_REDO_LOG_ARCHIVE ON *.* TO 'admin'@'%';
GRANT FLUSH_STATUS ON *.* TO 'admin'@'%';
GRANT SYSTEM_USER ON *.* TO 'admin'@'%';
GRANT SESSION_VARIABLES_ADMIN ON *.* TO 'admin'@'%';
GRANT GROUP_REPLICATION_ADMIN ON *.* TO 'admin'@'%';
GRANT FLUSH_TABLES ON *.* TO 'admin'@'%';
GRANT BACKUP_ADMIN ON *.* TO 'admin'@'%';
GRANT Alter ON *.* TO 'admin'@'%';
GRANT Create ON *.* TO 'admin'@'%';
GRANT Create view ON *.* TO 'admin'@'%';
GRANT Delete ON *.* TO 'admin'@'%';
GRANT Drop ON *.* TO 'admin'@'%';
GRANT Grant option ON *.* TO 'admin'@'%';
GRANT Index ON *.* TO 'admin'@'%';
GRANT Insert ON *.* TO 'admin'@'%';
GRANT References ON *.* TO 'admin'@'%';
GRANT Select ON *.* TO 'admin'@'%';
GRANT Show view ON *.* TO 'admin'@'%';
GRANT Trigger ON *.* TO 'admin'@'%';
GRANT Update ON *.* TO 'admin'@'%';
GRANT Alter ON test.* TO 'admin'@'%';
GRANT Create ON test.* TO 'admin'@'%';
GRANT Create view ON test.* TO 'admin'@'%';
GRANT Delete ON test.* TO 'admin'@'%';
GRANT Drop ON test.* TO 'admin'@'%';
GRANT Grant option ON test.* TO 'admin'@'%';
GRANT Index ON test.* TO 'admin'@'%';
GRANT Insert ON test.* TO 'admin'@'%';
GRANT References ON test.* TO 'admin'@'%';
GRANT Select ON test.* TO 'admin'@'%';
GRANT Show view ON test.* TO 'admin'@'%';
GRANT Trigger ON test.* TO 'admin'@'%';
GRANT Update ON test.* TO 'admin'@'%';
GRANT Alter routine ON test.* TO 'admin'@'%';
GRANT Create routine ON test.* TO 'admin'@'%';
GRANT Create temporary tables ON test.* TO 'admin'@'%';
GRANT Execute ON test.* TO 'admin'@'%';
GRANT Lock tables ON test.* TO 'admin'@'%';
```
 
Check application.properties 

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/test?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
spring.datasource.username=admin
spring.datasource.password=admin
```

Run Application 

```
mvn package
```
```
java -jar target/jpamysql-0.0.1-SNAPSHOT.jar
```