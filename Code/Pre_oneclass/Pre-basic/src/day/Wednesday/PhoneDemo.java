package day.Wednesday;

//建一个测试类
public class PhoneDemo {
    public static void main(String[] args) {
        //根据phone类，创建一个名为one的对象
        //格式： 类名称   对象名  =   new   类名称 （）；
        Phone one = new Phone();
        System.out.println(one.brand); //null
        System.out.println(one.color); //null
        System.out.println(one.price); //o.o
        System.out.println("===");
        one.brand = "Iphone";
        one.color = "black";
        one.price = 8366.88;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("SongGG");
        one.sendMessage();

        System.out.println("--------------------------------");
        //再次new一个对象
        Phone two = new Phone();
         System.out.println(two.brand); //null
        System.out.println(two.color); //null
        System.out.println(two.price); //o.o
        System.out.println("===");
        two.brand = "华为";
        two.color = "white";
        two.price = 6666.88;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        two.call("Joo8");
        two.sendMessage();
        
        Phone three = new Phone();
         System.out.println(three.brand); //null
        System.out.println(three.color); //null
        System.out.println(three.price); //o.o
        System.out.println("===");
        three.brand = "华为";
        three.color = "white";
        three.price = 6666.88;
        System.out.println(three.brand);
        System.out.println(three.color);
        System.out.println(three.price);
        three.call("Joeo8");
        three.sendMessage();
    }
}
