/*
      字符串反转：
        需求:
            定义一个方法，实现字符串的反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        思路:
            1.键盘录入一个字符串，用Scanner实现
            2.定义一个方法，实现字符串反转。返回值类型是String，参数String s
            3.在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串返回
            4.调用方法，用一个变量接受结果
            5。输出结果
*/
package com.jolly;
import java.util.Scanner;
public class Stringtest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:  ");
        String s = sc.nextLine();
        String s1 = StringReversal(s);
        System.out.println(s1);
    }
    public static  String StringReversal(String s ){
        String ss = "";
        for (int i =s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
