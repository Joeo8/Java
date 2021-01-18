package com.jolly;
import  java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
System.out.println("请输入一个整数（1000以内）：");
int number = sc.nextInt();
int i = 0;
while (number != 1){
    if(number%2==0){
    i++;
    number /=2;
    }else{
    number = (number*3 + 1)/2;
    i++;
}
  }
System.out.println("共需要砍 " + i + "下！");
}
}
