[TOC]

### Servlet规范

------

#### 一 Servlet规范

+ Servlet规范由Sun公司提供
+ Servlet规范指定动态资源文件调用管理规则
+ Servlet规范涉及接口实现类由Http服务器厂商提供
+ tomcat对于Servlet规范提供接口实习类在lib/servlet-api.jar

#### 二 Servlet规范细节

+ 指定了Servlet接口实现类开发步骤
+ 指定了tomcat调用Servlet接口实现类规则
+ 指定了tomcat如何管理Servlet接口实现类的实例对象
+ 指定了多个Servlet接口实现类之间的调用规则
+ 指定了多个Servlet接口实现类之间的数据共享方案 

#### 三 Servlet接口实现类开发步骤

+ Servlet规范认为，只有作为Servlet接口的实现类才可以被称为动态资源文件，只有动态资源文件才有资格被tomcat服务器进行调用
+ 开发步骤：
  + 创建一个Java类继承HttpServlet
  + 重写一个doGet/doPost方法
  + 在网站中web.xml中注册Servlet接口实现类

#### 四 Servlet生命周期

1. 一个网站中所有的Servlet接口实现类的实例对象都应该由Http服务器负责创建

2. 在正常情况下，只有Tomcat接收到第一个针对当前Servlet接口实现类请求时才会创建其实例对象；通过命令干预，可以要求Tomcat在启用时自动创建Servlet接口实现类实例对象(load-on-startup标签用于初始化一个Servlet实例化对象，最先加载到内存中，一般存放常量和常用方法)

   ```xml
   web.xml
   <Servlet>
   	<Servlet-name></Servlet-name>
       <Servlet-class></Servlet-class>
       <load-on-startup>67</load-on-startup>大于零的整数即可
   </Servlet>
   ```

3. 一个Servlet接口实现类最多只能被创建一个实力对象

4. 在Tomcat关闭时负责销毁网站中的所有Servlet接口实现类实例对象

#### 五 HttpServletResponse接口 :triangular_flag_on_post:

1. 介绍：
   + HttpServletResponse接口来自于Servlet规范
   + HttpServletResponse接口实现类由Http服务器厂商提供
   + HttpServletResponse接口可以将Servlet中运行结果写入到响应包
   + 开发人员习惯于将HttpServletResponse接口修饰的对象称为【响应对象】
2. 主要功能：
   + HttpServletResponse接口负责将Servlet运行结果以二进制形式写入到响应包中的响应体
   
   + HttpServletResponse接口负责设置响应包中响应头中【content-type】属性控制浏览器采用对应解析器和编译器对响应体中的二进制数据进行处理
   
   + HttpServletResponse接口负责将一个请求地址写入到响应头中location属性中来控制浏览器下一次请求的方式
   
     >1.tomcat发现响应头中location属性被赋值，此时产生一个302状态码并写入到响应包的状态行中
     >
     >2.tomcat负责推送响应包返回发起请求的浏览器
     >
     >3.浏览器接收到响应包之后，读取状态码中的302状体吗。此时浏览器直接读取响应头中的location地址并更新到浏览器的地址栏中
     >
     >4.由于在浏览器启动时，自动生成的了一个线程对象用于扫描浏览器地址栏。当这个线程发现了地址栏发生变化，此时浏览器立刻根据新地址进行请求

#### 六 HttpServletRequest接口  :triangular_flag_on_post:

1. 介绍
   + HttpServletRequest接口来自于Servlet规范
   + HttpServletRequest接口由Http服务器厂商提供
   + HttpServletRequest接口读取请求协议包内容
   + 开发人员习惯于将HttpServletRequest接口修饰对象称为【请求对象】
2. 主要功能
   + 读取请求包中的请求行中的信息【url，method】
   + 读取请求包中的请求头或者请求体中的请求参数
   + 代替浏览器向tomcat索要资源文件

```java

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求行中的url属性信息
        String  requestURL = req.getRequestURL().toString();
        //获取请求行中的Method属性信息
        String method = req.getMethod();
        System.out.println("url : "+ requestURL);//url : http://localhost:8080/yourWeb/one
        System.out.println("method : "+ method);//  method : GET
        /*
            获取请求行中的uri属性信息
            1.在请求行中并不存在uri属性
            2.uri从url中截取一段字符串. 格式： "/网站名/资源文件名"
            3.uri帮助tomcat进行资源文件定位
         */
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);             ///yourWeb/one
    }
}

```

#### 七 Servlet运用

```java
//综合运用Servlet分别使用GET和POST方式发送请求
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通知请求对象使用UTF-8字符集对请求体中内容再进行一次解析（默认解析格式不支持中文）
        request.setCharacterEncoding("UTF-8");
        //读取请求体中的参数信息
        String info = request.getParameter("info");
        System.out.println("从请求体中拿到的参数信息 : "+info);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //读取请求头中的参数信息
        String  value = request.getParameter("info");
        System.out.println("从请求头中的得到的参数信息 : " + value);
    }
}

```

编码中遇到的小问题：（POST方式发送中文，接受到乱码）

>问题描述：
>
>​		1）以GET方式发送的中文参数内容可以被正常读取
>
>​		2）以POST方式发送的中文参数内容读取时出现乱码
>
>问题分析：
>
>​		1）以GET 方式发送请求，请求参数存放在请求头中。在请求协议包到达服务器之后，由Tomcat服务器对请求头中的二进制数据解析。Tomcat9默认使用UTF-8字符集对请求头中二进制数据进行解析
>
>​		2）而以POST方式发送的请求，请求参数存放在请求体中。在请求协议到达服务器之后，由当前的【请求对象】（request）对二进制进行解析。问题就出在这里，请求对象request默认使用的是【ISO-8859-1】字符集。
>​			（关于如何查看默认字符集类型，可以再网页中检视源码-->network中查看）
>
>解决方案:
>
>​		在POST请求方式下，应该先让请求对象使用【UTF-8】字符集对请求体中的参数信息进行一次解析，然后再读取。
>
>扩展延伸：
>
>```java
>response.setContentType    -VS-    request.setCharacterEncoding
>   1）前者用于设置响应头content-type，要求浏览器使用正确的解析器和编译器对响应体二进制数据进行处理
>   2）后者要求请求对象使用正确的字符集对请求体二进制数据进行解析 
>```

#### 八 请求对象和响应对象的生命周期

1. Tomcat在接收到浏览器发送请求协议包时，自动为当前请求协议包生成一个请求对象和和一个响应对象

2. Tomcat在调用Servlet接口实现类时，负责将一个请求对象和一个响应对象作为参数传入到doGet或者doPost

3. doGet或者doPost方法执行完毕时，意味着本次请求处理完毕。在Tomcat准备推送相应包之前，负责销毁本次请求涉及请求对象和响应对象

   **请求对象和响应对象生命周期贯穿一次请求处理过程中**





 





























