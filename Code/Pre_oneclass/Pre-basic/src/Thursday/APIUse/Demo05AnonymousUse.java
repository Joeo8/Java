package Thursday.APIUse;
import java.util.Scanner;
//用匿名对象作为参数和返回值
public class Demo05AnonymousUse {
    public static void main(String[] args) {

        //使用普通方式
     /*   Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();*/

        //使用匿名对象方式
       /* int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);*/

        //使用一般写法传入参数
        /*Scanner sc = new Scanner(System.in);
        methodParam(sc);*/

        //使用匿名对象传入参数
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是： "+ num);
    }
    public static  void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("你输入的是： " + num);
    }
    public static Scanner methodReturn(){

        //Scanner返回值的一般写法
     /*   Scanner sc = new Scanner(System.in);
        return  sc ;*/

        //直接用匿名返回值
        return new Scanner(System.in);
    }
}
