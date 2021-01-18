package com.jolly;
/*
* 多个对象指向相同
* */
public class StudentDemo {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();
        s1.name = "林青霞";
        s1.setAge(30);
//        s1.age  = 30;
        s1.show();

        Student s2 = s1;
        //当两个对象指向相同的时候，其中一个对象就修改了堆内存中的数据，另一个对象在访问时也修改过的
        //        Student s2 = new Student();
        s2.name = "张曼玉";
//        s2.age  = 29;
        s2.setAge(28);
            s1.show();
            s2.show();

    }
}
