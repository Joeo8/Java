package Thursday.APIUse;


import java.util.Scanner;

//use Scanner
public class Demo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            //System.in  表示从键盘录入
        System.out.println("请输入一个字符：");
        String str = sc.next();
        //sc.next 表示获取从键盘输入的字符
        //sc.nextInt 表示获取从键盘输入的整数
        System.out.println("您输入的是： "+ str);
    }
}
