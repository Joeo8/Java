package Thursday.APIUse;

import java.util.Scanner;

//利用Scanner输入三个整数，并判断最大值，将其输出
//思路：
    //同时输入三个整数，先进行前两个比较，记录最大值。再用最大值和第三个数进行比较
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       int max = a > b ? a : b;
        if (max < c){
            max = c;
        }
        System.out.println("三者的最大值为： "+max);
    }
}
