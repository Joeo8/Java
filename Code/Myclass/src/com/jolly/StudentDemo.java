package com.jolly;
public class StudentDemo {
    public static void main(String[] args) {
//        创建对象
    Student s = new Student();
//    使用成员变量
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = "乔政";
        s.age  = 21 ;
        System.out.println(s.name);
        System.out.println(s.age);
//        调用成员方法
        s.study();
        s.doHomework();

    }
}
