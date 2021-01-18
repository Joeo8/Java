#### B/S通信模型：

> ​	客户端计算机通过【浏览器】的帮助向服务端计算机发起请求、并索要资源。服务端中【HttpServelt】负责将被请求资源文件内容解析为二进制形式，推送回发送请求的浏览器。浏览器接收到内容后自动进行解析（文字、数字、图片、视频）与编译。



------



#### Html编程语言学习：

1. HTML编程语言介绍：
   1. HTML编程语言专业名称【超文本标签式编辑语言】
   2. HTML编程语言只能在浏览器编译、执行
   3. HTML编程语言用于控制浏览器
2. HTML编程语言作用：
   1. 通知浏览器将接收到的数据以指定形式展示    --->  【前端工程师】
   2. 控制浏览器请求行为      ---> 【前端工程师/服务端工程师】
3. HTML编程语言语法规范
   1. html语言以标签形式出现。例:<br/>
   2. html语言不区分大小写
   3. HTML编程命令分为【双目标签】和【单目标签】
      + 双目标签:由开始标签和结束标签组成。例：<tr></tr>
      + 单目标签:开始标签和结束变迁是同一个标签。例：<br/>(单目标签书写时结束斜线可以省略)
   4. HTML编程语言中所有命令都是预先设置的，不允许开发人员自定义新的命令
4. HTML文件书写规则
   1. 以.html结束文件，作为静态资源文件使用
   2. html文件存放HTML标签命令和展示数据

#### Http服务器调用资源文件分类：【背】

+ 静态资源文件：
  + 存放相对固定的数据
    + 文档文件
    + 图片文件
    + 视频文件
  + 存放数据和命令，这命令只能在浏览器中编译与执行
    + Html 文件  ---》  Html编程语言（.html）
    + Css 文件     ---》  Css编程语言 （.css）
    + JavaScript   ---》  JavaScript编程语言（.js）
+ 动态资源文件（类似.class文件）
  + 文件存放命令
  + 文件中无法在浏览器中编译执行，只能通过服务器编译、运行
  + 不同的用户索要同一个资源文件时，往往得到的结果不同

------



#### 控制浏览器请求行为:

1. ##### 浏览器请求三要素：

   1. 请求地址
   2. 请求方式
   3. 请求参数

2. ##### 控制浏览器请求地址：

   1. 超链接标签命令

      1. 格式：

         ```html
         <a href = "请求地址"> 提示信息 </a>
         ```

   2. 表单标签命令：

      1. 格式：

         ```html
         <form action = "请求地址">
             <input type = " submit " value = "提示信息">
         </form>
         ```

3. ##### 控制浏览器的请求方式：

   1. 请求方式的作用：请求方式决定着浏览器在发起请求时的行为特征
   2. 浏览器的请求方式（七种）但是目前位置开发人员只考虑其中的两种（GET/POST）

4. ##### GET和POST请求的区别：【背记】

   + Get请求：
     1. GET请求方式，要求浏览器发送请求参数数量不能超过4K
     2. GET请求方式，要求浏览器发送请求时，必须将请求参数信息在地址栏展示
     3. GET请求方式，要求浏览器发送请求时，必须将请求参数信息保存在HTTP请求协议包中请求头中
     4. GET请求方式，要求浏览器将本次返回资源与请求地址形成键值对存储在浏览器内存中
   + Post请求方式
     1. Post请求方式，要求浏览器发送请求时，不限制发送参数数量
     2. Post请求方式，要求浏览器发送请求时，必须在地址栏中屏蔽请求参数信息
     3. Post请求方式，要求浏览器发送请求时，必须将请求参数信息保存在HTTP请求协议包中请求体中
     4. Post请求方式，禁止浏览器对返回内容进行存储（阅后即焚）

5. ##### 请求方式控制

   1. 要求浏览器以Get方式发送请求

      1. 超链接标签命令执行时，要求浏览器必须采用Get方式发送请求

      2. 
         ```html
         <form action="请求地址" method="请求方式"><!--method默认值为Get
         ```

      3. 直接通过地址栏要求浏览器发送请求，其使用请求方式只能是Get

   2. 要求浏览器以Post方式发送请求

      ```html
      <form action="请求地址" method="Post">
      ```
      
   
6. ##### 请求方式应用场景

   1. 绝大多数情况下，请求方式都是Get
   2. 文件上传操作必须使用Post
   3. 登录验证操作必须使用Post
   4. 索要服务端实时更新的数据要求必须使用Post

   >因为Post中对传参没有限制，所以存在病毒风险，使用谨慎，但必要操作不得不的使用Post。而Get请求可以加载到内存中，请求速度快，但是对于实时更新数据不太理想。

7. ##### 请求参数：

   1. 请求参数格式:  请求参数的名称=请求参数内容&请求参数的名称=请求参数内容

   2. 请求参数来源： 

      1. 由超链接标签提供

         ```html
         <a href="http://www.baidu.com?username=mark&psd=123456">
         ```

      2. 表单域标签

         1. 定义：一组专门声明在表单标签<form>内部，用于在浏览器发送请求时携带参数的载体

         2. 分类：三个分类（input、select、textarea）

         3. 特征：

            所有表单域标签都拥有name属性和value属性。

            name属性设置【请求参数名】value属性设置【请求参数内容】

         4. input标签：

            ```html
            文本框：<input type="text" name="请求参数名" value="用户填写">
            密码框：<input type="password" name="请求参数名" value="用户填写">
            文件选择框：<input type="file" name="请求参数名" value="文件内容">
            单选框：<input type="radio" name="请求参数名" value="实现设置">
            多选框：<input type="checkbox" name="请求参数名" value="实现设置">
            提交按钮：<input type="submit"/>
            重置按钮：<input type="reset"/>
         命令按钮：<input type="button"/>
            ```

            ```html
            <center>
            	<form action="http://www.baidu.com">
                    姓名：<input type="text" name="username" value="请输入姓名"/><br/>
                    密码：<input type="password" name="password"/><br/>
                    头像：<input type="file" name="myFile"/><br/>
                    性别：<input type="radio" name="sex" value="man"/>男
                   		<input type="radio" name="sex" value="woman"/>女<br/>
                    擅长技术：<input type="checkbox" name="ck" value="java"> java
                    <input type="checkbox" name="ck" value="mysql"> mysql
                    <input type="checkbox" name="ck" value="html"> html        
                    <br/>
                	<input type="submit" value="百度">
                    <input type="reset" value="重置">
                    <input type="button" value="你愁啥？" onclick="fun1()">        
                </form>
         </center>
            ```

         5. select下拉列表菜单

            + ```html
              <select name="请求参数名">
                  <option value="请求参数内容">提示信息</option>
                   <option value="请求参数内容">提示信息</option>
              </select>
              ```

            + ```html
              籍贯：
                          <select name="home">
                              <option value="河南">河南</option>
                              <option value="河北">河北</option>
                              <option value="江苏">江苏</option>
                          </select><br>
              ```

         6. textarea:多行文本框

            + ```html
              <textarea name="请求参数"></textarea>
              ```

         7. 表单域标签value属性默认值
         
            1. 大多数表单域标签value属性默认值是空字符串
            2. 单选框和多选框value属性默认值是on
         
         8. 表单域标签作为请求参数条件
         
            1. 大多数表单标签只要声明在form标签内部并指定name属性作为请求参数
            2. 单选框和多选框在满足条件1的同时，还必须被用户选中的情况下才有资格作为请求参数
            3. ReadOnly设置为只读访问，不可更改；Disable可以使标签变灰，同时不能作为请求参数

------

