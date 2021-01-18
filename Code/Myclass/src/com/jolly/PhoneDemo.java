package com.jolly;

public class PhoneDemo {
    public static void main(String[] args) {
//        创建对象
        Phone p =new Phone();
//        使用成员变量
        System.out.println(p.name);
        System.out.println(p.price);
        p.name = "小米";
        p.price = 2999;
        System.out.println(p.name);
        System.out.println(p.price);

//        使用成员方法
        p.call();
        p.message();
    }
}
