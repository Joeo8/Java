package com.Joeo8;
public class Student {
    private int age;
    private String name;

    //get/set方法

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name +" , "+age);
    }
}
