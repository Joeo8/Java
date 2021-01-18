package Thursday.APIUse;
//创建匿名对象
public class Demo04Anonymous {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "高圆圆";
        p.Print();
        System.out.println("==========");
        //匿名对象
        new Person().name = "赵又廷";
        new Person().Print(); //显示我叫null，可见匿名对象只能使用唯一的一次
    }

}
