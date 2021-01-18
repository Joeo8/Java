package com.Joeo8.io;
import java.util.Scanner;
public class DemoIf {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你的分数 ： ");
        int num = sc.nextInt();
        if(num>100||num<0){
            System.out.println("你输入的成绩有误！");
        }else if(num<60){
            System.out.println("不及格！");
        }else if(num<=69&&num>=60){
            System.out.println("及格！");
        }else if (num>=70&&num<=79){
            System.out.println("良！");
        }else if(num>=80&&num<=89){
            System.out.println("好！");
        }else if(num>=90&&num<=100){
            System.out.println("优秀！");
        }
    }

}
