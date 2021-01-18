package com.jolly;

    /*    Scanner :
                用于获取键盘录入数据。(基本数据类型，字符串类型)
        public  String nextLine();
                用于获取键盘录入的字符串数据
             */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符 ： ");
//        String Line = sc.nextLine();
        String line = sc.nextLine();
        System.out.print("你输入的字符是： "+line);
    }
}
