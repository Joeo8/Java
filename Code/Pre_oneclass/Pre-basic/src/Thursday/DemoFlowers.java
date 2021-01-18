package Thursday;
//Define test classes and use Flowers classes
public class DemoFlowers {
    public static void main(String[] args) {
        Flowers f = new Flowers();
        System.out.println("=============");
        Flowers ff = new Flowers("玫瑰",2);
        System.out.println(ff.getName()+"已经种植"+ff.getAge()+"年了");
        //如果需要改变对象中的成员变量的数据内容，仍然需要用到set方法
        ff.setName("百合");
        ff.setAge(5);
        System.out.println(ff.getName()+"已经种植"+ff.getAge()+"年了");
    }
}
