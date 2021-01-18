package com.jolly;
public class Car {
    private  String name;
    private  int price;

//    构造方法
    public  Car(){
        System.out.println("无参构造方法");
    }
    public  void show(){
        System.out.println(name +","+ price);
    }
}
