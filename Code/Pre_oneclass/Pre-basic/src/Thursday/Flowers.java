package Thursday;
//          Definition and use of constructor methods
public class Flowers {
    //member variables
    private String name;
    private int age;
    //A parametrically constructed method
    public Flowers(){
        System.out.println("无参构造方法运行！");
    }
    //Full parameter constructed method
    public Flowers(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("全参构造方法执行！");
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getter /Setter
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
