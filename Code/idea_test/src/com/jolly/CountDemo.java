package com.jolly;
import  java.util.Scanner;
public class CountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数： ");
        int number = sc.nextInt();
        int ge  = number % 10;
        int shi = number /10 % 10;
        int bai = number /100 % 10;
        System.out.println("该整数的每一位切分为： "+ bai +"   "+ shi +"  "+ ge );


    }
}
