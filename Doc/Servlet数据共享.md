[TOC]



### Servlet之间数据共享方案

#### 一 ServletContext接口

1. 介绍:

   + ServletContext接口来自于Servlet规范
   + ServletContext接口实现类由HTTP服务器厂商提供
   + ServletContext接口修饰对象被称为全局作用域对象
   + 来自于用一个网站下的Servlet都可以使用全局作用域对象进行数据共享

2. 使用：

   >myWeb网站中OneServlet通过全局作用域对象向TwoServlet提供共享数据
   >
   >
   >
   >运行OneServlet
   >
   >//1.通过请求对象向Tomcat索要当前网站中全局作用域对象
   >
   >ServletContext  application = request.getServletContext()
   >
   >//2.将数据添加到全局作用域对象中作为共享数据
   >
   >application.setAttribute("共享数据名"，"共享数据");
   >
   >
   >
   >运行TwoServlet
   >
   >//1.通过请求对象向Tomcat索要当前网站中的全局作用域对象
   >
   >ServletContext application = request.getServletContext()；
   >
   >//2.从全局作用域对象中读取数据
   >
   >Object 共享数据 = application.getAttribute("共享数据名")；
   
3. 生命周期 :small_red_triangle:

   +  在tomcat启动时，自动为当前网站创建一个全局作用域对象
   + 在Tomcat运行时，一个网站中有且只能有一个全局作用域对象
   + 在Tomcat关闭时，自动销毁网站中的全局作用域对象

4. 存在的问题

   1. 如果不进行限制，无限的向全局作用域对象添加数据。导致服务器计算机内存消耗殆尽
   2. 容易导致数据污染

#### 二 Cookie类

1. 介绍：

   + 来自于Servlet规范提供的一个工具类
   + 如果两个Servlet为同一个用户/同一个浏览器服务，此时借助cookie实现数据共享
   + cookie在现实生活中就类似会员卡

2. 实现原理

   <img src="C:\Users\Joeo8\Pictures\Project\cookie工作原理.png" style="zoom:50%;" />

3. 使用：

   >myWeb网站中OneServlet通过Cookie与TwoServlet实现数据共享
   >
   >
   >
   >运行OneServlet
   >
   >//1.生成一个Cookie对象
   >
   >Cookie cookie =  new Cookie("共享数据名"，"共享数据");
   >
   >//一个Cookie对象只能存储一个共享数据，而且cookie中共享数据只能是String类型
   >
   >//2.调用响应对象将Cookie写入到响应头
   >
   >response.addCookie(cookie);
   >
   >
   >
   >运行TwoServlet
   >
   >//1.调用请求对象读取请求头中所有的Cookie
   >
   >Cookie cookieArray[] =request.getCookies();
   >
   >//2.遍历循环数组，读取OneServlet在Cookie中存放的数据
   >
   >for(Cookie cookie : cookieArray){
   >
   >​		String key = cookie.getName();//返回共享数据名
   >
   >​		String value =  cookie.getValue();//返回共享数据
   >
   >}

4. 生命周期​ ​ ​ ​ :red_circle:

   + 在正常情况下，Cookie存放在浏览器内存中，在浏览器关闭时，cookie将自动销毁

   + 在命令控制下，可以要求浏览器将接收到的Cookie存放在客户端计算机的硬盘上并指定存货时间。在存货范围内，关闭浏览器、服务器、计算机都不会导致Cookie的销毁

     ```java
     Cookie.setMaxAge(60);//在硬盘上存活60秒
     ```

     

#### 三 HttpSession

1. 介绍：

   + HttpSession接口来自于Servlet规范中
   + HttpSession接口实现类由Http服务器厂商提供
   + HttpSession接口修饰对象被称为会话作用域对象
   + 如果两个Servlet为用一个用户/同一个浏览器提供服务此时可以借助于用户的HttpSession对象进行数据共享

2. Cookie与Session的区别：:red_circle:

   1. 类型不同:  Cookie是一个类，HttpSession是一个接口。

   2. 存放位置不同：Cookie存放在客户端计算机；Session存放在服务端计算机内存中

   3. 存放共享数据个数不同：

      一个Cookie只能存放一个共享数据；而Session通过Map存储，可以存储任意个共享数据

   4. 存放数据类型不同：Cookie只能存放String类型的共享数据，Session可以存放Object类型的共享数据

   5. 与用户的关系不同：一个用户可以有多个Cookie，但只能有一个Session

   6. 参照物不同：Cookie相当于会员卡，Session相当于在服务端拥有的个人储物柜

3. HttpSession工作原理

   <img src="C:\Users\Joeo8\Pictures\Project\HttpSession工作原理.png" style="zoom:50%;" />

4. 使用

   >myWeb网站中OneServlet通过HttpSession与TwoServlet实现数据共享
   >
   >
   >
   >//运行OneServlet
   >
   >//1.调用请求对象向Tomcat索要当前私人储物柜
   >
   >HttpSession session = request.getSession();
   >
   >//2.将共享数据添加到当前用户的私人储物柜中
   >
   >session.setAttribute("共享数据名")
   >
   >
   >
   >//运行TwoServlet
   >
   >//1.调用请求对象向Tomcat索要当前用户私人储物柜
   >
   >HttpSession session = request.getSession(false);
   >
   >//2.读取OneServlet存入的共享数据
   >
   >Object data = session.getAttribute("共享数据名")

5. request.getSession()  -----   request.getSession(false)

   + request.getSession()：
     + 如果当前用户在服务端拥有私人储物柜，要求tomcat返回这个储物柜（引用地址）；如果没有储物柜，则为其创造一个并返回
   + request.getSession(false)
     + 如果当前用户在服务端拥有私人储物柜，要求tomcat返回这个储物柜（引用地址）；如果没有储物柜，则返回一个null，结束
   + 两者的应用：:red_circle:
     + 如果当前用户身份【经过登录验证审核判定为合法】，此时应该使用request.getSession()来索要私人储物柜
     + 如果当前用户身份尚未确认合法，则使用request.getSession(false)来索要私人储物柜

6. Session销毁时机：:red_circle:

   >1)在浏览器关闭时，服务端是否会销毁用户的Session
   >
   > 		在浏览器关闭时，等同于切断了用户与浏览器的练习；但是tomcat时服务端计算机中资源调度软件，它无法侦测到浏览器何时关闭。因此在浏览器关闭时，服务端是不会销毁用户的Session的。
   >
   >2）呢Session是何时销毁的呢？
   >
   >​		tomcat在创建Session对象时，设置了一个【最大空闲时间】。如果Session对象从上一次使用完到到现在空闲时间达到了【最大空闲时间】，tomcat认为用户已经放弃了自己的Session，此时tomcat负责将其销毁。
   >
   >3）Tomcat设置的【最大空闲时间】是30分钟
   >
   >4）网站自定义【最大空闲时间】
   >
   >```xml
   >web.xml
   ><session-config>
   >	<session-timeout>5</session-timeout> <!--5分钟-->
   ></session-config>
   >```



#### 四 HttpServletRequest实现Servlet之间的数据共享

1. 前提条件：

   ​        在一次【请求转发】过程中，两个Servlet共享同一个请求协议包。因此两个Servlet共享这个请求协议包中的请求对象和响应对象。所以在请求转发过程中两个Servlet可以通过当前请求对象实现数据共享。

   ​        当请求对象实现数据共享时使用内部Attribute属性存储共享数据，此时开发人员将请求对象称为【请求作用域对象】

2. 使用：

   在一次请求转发过程中OneServlet需要通过请求对象将数据共享给TwoServlet

   1. 运行OneServlet

      ```java
      request.setAttribute("共享数据名",共享数据);
      request.getRequestDispatcher("/two").forward(request,response)
      ```

   2. 运行TwoServlet

      ```java
      Object 共享数据 = request.getAttribute("共享数据名");
      ```

      

