package com.jolly;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        //使用set方法给成员变量赋值
        s.setName("Jolly");
        s.setAge(20);
        s.show();
    }
}
