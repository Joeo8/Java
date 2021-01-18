## JDBC操作

#### 1. JDBC开发步骤

1. 建立通道  --》  DriverManager
2. 交通工具  --》  PreparedStatement
3. 将SQL命令推送到数据库  --》 psmt.executeQuery / executeUpdate
4. 销毁信道所有的连接

#### 2. executeQurey  vs  executeUpdate	

+ 推送SQl命令类型不同 ： 
  + executeQuery  -->   DQL命令 （select）
  + executeUpdate -->   DML命令（insert/delete/update）
+ 返回结果类型不同
  + executeQuery  -->  返回ResulteSet接口类型结果，表示本次查询的临时数据表
  + executeUpdate --> 返回int类型结果，表示本次对多少行数据进行了操作

3. #### ResulteSet对于临时表中数据的读取管理

   1. ResultSet对象通过【指针】管理数据行

   2. ResultSet提供next()方法：每次执行要求指针向下移动一行，移动到数据则返回ture；移动到空（即触及末尾）返回false   

   3. 遍历数据行

      ```java
      while(table.next() == true){
          读取当前数据行指定字段中的内容
      }
      ```

   4. 读取指针指向的数据行中的指定字段的内容

      ```java
        int d_id = Rs.getInt("d_id");
        String d_name = Rs.getString("d_name");
      // 所有类型字段的值都可以用getString接收
      ```

   ```java
   // 获取Rs中查询到的临时表信息
    ResultSetMetaData data = Rs.getMetaData();
    int columnCount = data.getColumnCount();
    for (int i = 1; i <= columnCount; i++) {
    		String columnName = data.getColumnName(i);
    		System.out.print("\t\t"+columnName);
      }
    System.out.println("\n\t\t----------------------------------");
          // 遍历临时表中的数据
    while (Rs.next()){
       int d_id = Rs.getInt("d_id");
       String d_name = Rs.getString("d_name");
       String d_loc = Rs.getString("d_loc");      System.out.println("\t\t"+d_id+"\t\t\t"+d_name+"\t\t"+d_loc);
        }
   System.out.print("\t\t----------------------------------");
   ```

```java
Output:
		d_id		d_name		d_loc
		----------------------------------
		10			人事部		suzhou
		20			市场部		zhengzhou
		30			办公室		beijing
		40			技术部		nanjing
		50			电力部		shanghai
		60			后勤部		shenzhen
		----------------------------------
```



#### 4.JDBC预处理SQL命令

>字符串拼接方式存在的问题：
>
>1. 增加SQL命令书写难度
>2. 容易被SQL注入

#### 5.JDBC预编译SQL命令

> 预编译SQL命令格式： 
>
> 1. 书写SQL命令时，使用 <font color=red> ? </font> 代替赋值数据  ---》  占位符
>
>    ```mysql
>     insert into dept values(?,?,?);
>     delete from dept where deptno = ? ;
>     select count(*) from emp where ename = ? and empno = ? ; 
>    ```
>
> 2. 在推送SQL命令之前，用PreparedStatement对象负责对占位符进行赋值
>
> 好处： 
>
> + 降低了SQL命令编写难度
> + 有效降低了SQL注入攻击

