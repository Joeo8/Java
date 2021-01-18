package Thursday.APIUse;

import java.util.Scanner;

//  Use Scanner
//        Enter two integers from the keyboard and sum them
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int numone = sc.nextInt();
        int numtwo = sc.nextInt();
        int sum = numone + numtwo ;
        System.out.println("你输入的两个数的和是： "+ sum);
    }
}
