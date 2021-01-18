#### 关于授权访问远程数据库：

在mysql8.0之后(用如下命令授权)

>老方法（不合适）：
>
>
>```mysql
>grant all privileges on *.* to 'root'@'%' identified by '你的密码' with grant option
>```
>



>8.0+的方法：
>
>```mysql
>CREATE USER 'root'@'%'  IDENTIRFIED BY '111111' ； 
>GRANT ALL ON *.* TO 'root'@'%'；
>ALTER USER 'root'@'%' IDENTIFIED  WITH mysql_native_password BY '11111';
>FLUSH PRIVILEGES ; 
>```

