package Thursday.APIUse;
//创建一个简单的类（成员变量、 成员方法、get/set）
public class Woman {
    private String name ;
    private int age;

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

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman() {
    }
}
