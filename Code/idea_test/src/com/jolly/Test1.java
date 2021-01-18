package com.jolly;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=sc.nextInt();
        String s = String.valueOf(a);
        System.out.print("输出该整数值每一位的数字为: ");
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                System.out.print(s.charAt(i));
            } else {
                System.out.print(s.charAt(i) + "  ");
            }
        }
        System.out.println();
        sc.close();
    }
}
