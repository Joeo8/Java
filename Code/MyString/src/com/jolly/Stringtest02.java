//遍历字符串
package com.jolly;

import java.util.Scanner;

public class Stringtest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串 ： ");
        String line = sc.nextLine();

        for (int i = 0 ; i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
