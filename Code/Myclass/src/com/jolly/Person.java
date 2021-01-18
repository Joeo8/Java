package com.jolly;

public class Person {
    String name;
    private  int age;
//    添加private关键字后，成员变量只能在本类中修改，同时提供getXXX和setXXX方法
    public void  setAge(int age ){
       this.age = age;      //使用this关键字，将局部变量的值赋值给成员变量
//                        方法被哪个对象调用，this就代表哪个对象
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }
    public  int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name + "," +age);
    }
}
