## info

hibernate orm project with IBM db2,maven

### initial database setting
~~~
db2 => connect to javadbs user db2admin using ajay123

   Database Connection Information

 Database server        = DB2/NT64 11.1.3.3
 SQL authorization ID   = DB2ADMIN
 Local database alias   = JAVADBS

db2 => create table student (id int not null primary key,name varchar(20),age int)
DB20000I  The SQL command completed successfully.

db2 => insert into student values(1,'ajay',27)
DB20000I  The SQL command completed successfully.
db2 => select * from student

ID          NAME                 AGE
----------- -------------------- -----------
          1 ajay                          27

  1 record(s) selected.
~~~

### after execution of the program

~~~
db2 => select * from student

ID          NAME                 AGE
----------- -------------------- -----------
          1 ajay                          27
          4 krishna                       28
~~~          