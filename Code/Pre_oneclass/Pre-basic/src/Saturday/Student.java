package Saturday;
//定义一个标准类
//一个标准类的四部分： 成员变量 、 无参构造  、全参构造 、Getter\Setter
public class Student {
    //定于成员变量
    private int id;
    private String name;
    private int age ;
    static String  Classroom;

    private static int Idcounter = 0;//定义一个计数器，每当new一个新对象时，自动计数
  //定义无参构造

    public Student() {
        this.id = ++Idcounter;
    }

    //定义全参构造
    public Student( String name, int age) {
        this.id = ++Idcounter;
        this.name = name;
        this.age = age;
    }

    //Getter\Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static int getIdcounter() {
        return Idcounter;
    }

    public static void setIdcounter(int idcounter) {
        Idcounter = idcounter;
    }
}
