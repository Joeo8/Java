package com.Joeo8.io;
public class Student {
     private String name ;
     private  int age;
    /* public Student(){
         System.out.println("这是一个无参构造方法！");
     }*/
    public Student(){}
    public  Student(String name){
        this.name = name ;
    }
    public Student(int age ){
        this.age =age;
    }
    public Student(String name ,int age){
        this.name = name ;
        this.age = age;
    }
     public void show(){
         System.out.println(name +" "+age);
     }
//
//     //构造方法
//    public Student(){}
//    public Student(String name){
//        this.name = name ;
//    }
//    public Student(){}
//    public Student(int age){
//        this.age = age ;
//    }
}
