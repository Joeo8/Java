#### Tomcat调用动态资源文件原理：

>对于一个网站来说，tomcat只能调用网站中的Servlet接口实现类
>
>Tomcat接收到请求之后，根据url中文名称定位被访问Servlet接口实现类
>
>1. Tomcat通过Class.forName()方法将硬盘中类文件加载到内存
>2. Tomcat通过反射机制通知JVM创建当前类的实例对象
>3. Tomcat通过实例对象调用init方法来实现对实例对象初始化操作
>4. Tomcat通过实例对象调用service方法处理当前用户请求
>5. Tomcat通过输出流将service方法处理结果写入到响应体交还给发起请求浏览器

```java
package com.joeo8.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tomcat {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //tomcat启动时创建一个Map对象，存储Servelt实现类全限定名和对外别名
        Map map = new HashMap();
        map.put("/one", "com.joeo8.demo.servelt_1");
        map.put("/two", "com.joeo8.demo.servelt_2");
        //tomcat接受来自浏览器发出的请求
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入请求地址：");
        String url = sc.next();
        System.out.print("请输入请求方式：");
        String method = sc.next();
        //tomcat根据请求信息调用动态资源文件
        String uri = url.substring(url.lastIndexOf("/"));
        String classPath = (String) map.get(uri);
        //加载Servelt接口实现类
        Class classFile = Class.forName(classPath);
        //创建Servelt接口实现类的实例方法
        servelt obj = (servelt) classFile.newInstance();  //通知JVM调用当前类中无参构造方法创建当前类的实例对象
        obj.init();
        obj.service();
    }
}
/*
Output:
		请输入请求地址：http://localhost:8080/myWeb/one
		请输入请求方式：GET
		servelt_1正在处理用户请求..........................
*/
```



#### 适配器设计模式：

1. 作用：降低接口实现类开发难度。可以让接口实现类自由选择接口中的方法重写

2. 创建接口实现类继承于【抽象类】，此时接实现类开发时只要重写感兴趣的方法

   >抽象类可以实现部分接口方法，也可以不管接口中的方法。而常规的接口实现类都必须全部实现接口中的方法。其次，抽象类不能被实例化，所以将抽象类作为父类，子类继承过去，拿到其中的方法。

+ 接口是最抽象的一层，不需要进行任何实现；抽象层可以实现部分接口方法，也可以自定义方法；实现类必须实现所有方法。
+ 接口能被类（抽象类和具体类）实现，区别在于抽象类实现接口，可以实现该接口的方法，也可以不实现该接口的方法；具体类必须实现接口的所有方法
+ 接口可以被接口继承，但不允许被类继承
+ 类之间可以相互继承，而且只能单继承
+ abstract是抽象的意思，在java中，规定只能修饰类或者方法，所以不能修饰属性。被abstract修饰的内容都是暂未被实现的，比如类、方法。属性之所以不能被abstract修饰，是因为属性不存在"尚未被实现"的状态。比如你可能会联想到int age; 或是String name; 但可惜的是，在申明变量时，int会默认给age赋予初始值0，String会默认给name赋予初始值""。因此属性达不到"尚未被实现的状态"，从而不能被abstract修饰。
+ 抽象类和普通类在于：抽象类不能进行实例化，一方面抽象方法类似于接口的方法；另一方面，非抽象方法又和普通类方法相同，所以它兼备接口和普通类两种特型。
+ 由于抽象类不能实例化，因此一般是作为父类，由子类进行扩充和实例化，因此，在抽象类的所有protected级别以上的方法或变量，均可以在子类中调用.

#### 模板设计模式：

>​		子类只需要考虑相关方法重写实现，不需要考虑方法的调用场景。子类方法的调用规则由父类进行控制。



