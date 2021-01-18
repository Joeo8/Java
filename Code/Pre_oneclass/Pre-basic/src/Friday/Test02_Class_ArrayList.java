package Friday;

import java.util.ArrayList;

/*
    自定义存储对象
    题目：自定义四个学生对象，添加到集合，并遍历

    思路:
       1.自定义Student学生类，四个部分
       2.创建一个集合，用来存储学生对象。泛型<Student>
       3.根据类，创建4个学生对象
       4.将四个学生对象添加到集合中  add
       5.遍历集合 for 、 size 、 get
*/
public class Test02_Class_ArrayList {
    public static void main(String [] args ){
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("李翔宇",20);
        Student two = new Student("罗杰",20);
        Student three = new Student("范冰冰",41);
        list.add(one);
        list.add(two);
        list.add(three);

//       System.out.println(list.get(1).getName());
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名  "+stu.getName()+" ,年龄 ： "+stu.getAge());
        }
    }
}
