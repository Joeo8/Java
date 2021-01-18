/*
*   制作一个减肥计划：
*           根据输入的星期数，指定对应的训练计划
*
*
*/

package com.jolly;
import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        System.out.print("请输入当前的星期数 ： ");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        //对当前的星期数进行判断
        switch(week){
            case 1 :
                System.out.println("跑步");
                break;
            case 2 :
                System.out.println("游泳");
                break;
        }
    }
}
