package Thursday;
//      Define a test class using the sayHello method
public class DemoPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "王健林";
        p.sayHello("王思聪");
        System.out.println(p); //Used to see if the address value is the same
    }
}
