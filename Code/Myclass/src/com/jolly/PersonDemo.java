package com.jolly;
public class PersonDemo {
    public static void main(String[] args) {
//        创建对象
        Person p = new Person();
//        成员变量
        p.name = "乔政";
        p.setAge(20);
//        成员方法
        p.show();
        System.out.println(p.getName()+"------"+p.getAge());
    }
}
