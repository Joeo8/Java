package Joeo8.ObjectStream;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/16
 * Time: 19:50
 * Description: No Description
 */
public class Person implements Serializable {
    //避免InvalidClassException --> 手动设置序列号
    private static  final long serialVersionUID=1L;
    private String name;
    private int age;
    //不能被序列化
//    private static String name;
//    private transient int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
