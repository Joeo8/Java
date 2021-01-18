package io.github.Jolly;
/*
        定义一个类：用来模拟“学生”事物。其中两个部分组成
       属性（是什么） : 年龄 、 性别
       行为（做什么） : 睡觉 、 吃饭 、学习
    对应到Java类中：
        成员变量 （属性） :
        String  name； //姓名
        int age ；     //年龄
        成员方法 （行为） :
        public void ear() //吃饭
        public void sleep() //睡觉
        public void study()  //学习
*/

//两个注意事项：
//  1. 成员变量是定义在类当中的，在方法外边的
//  2.成员方法不能加static关键字
public class Student {
    //成员变量
    String name ; //姓名
    int age ;  //年龄
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
