package com.jolly;
public class Student {
    String name ;
    private int age ;
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

    public void study(){
        System.out.println("好好学习，天天向上！");
    }
    public void  doHomework(){
        System.out.println("键盘敲碎，月薪过万！");
    }
    public void  show(){
        System.out.println(name +"  "+age);
    }

}
