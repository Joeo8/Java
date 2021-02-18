package Jolly.Lambda;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:31
 * Description: No Description
 */
public class Person {
    private int age ;
    private String name ;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
}
