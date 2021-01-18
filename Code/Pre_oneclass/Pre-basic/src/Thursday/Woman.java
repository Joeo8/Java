package Thursday;
//  Create a standard class
public class Woman {
    //1.定义成员变量
   private String name ;
   private int age ;

   //2.为每一个成员变量增加get/set方法
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
    //3.编写一个无参构造方法

    public Woman() {
        System.out.println("无参构造为您服务！");
    }
    //4.编写一个全参构造方法
    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造为您服务！");
    }
}

