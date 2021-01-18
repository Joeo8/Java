package com.jolly;

public class Student {
    private String name;
    private int age;

    //熟悉this用法，应用get、set方法中
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + " , " + age);
    }
}
