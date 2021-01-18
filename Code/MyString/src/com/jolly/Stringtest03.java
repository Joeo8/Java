/*
*  统计字符个数：
*       需求：键盘录入一个字符串，统计该字符串中 大写字母字符、小写字母字符、数字字符出现的次数（不考虑其他字符）
*       思路：
*           1.键盘录入一个字符串，用Scanner实现
*           2.要统计三种类型的字符个数，需要定义三个统计变量，初始值为0
*           3.遍历字符串，得到每一个字符
*           4.判断该字符属于哪种类型，然后对应统计变量+1
*    加入ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围内即可
*          大写字母 ： ch > 'A'  && ch <'Z'
*          小写字母 ： ch > 'a'  && ch < 'z'
*           数字 ： ch > '0' && ch < '9'
*           5.输出三种类型的字符个数
* */
package com.jolly;
import java.util.Scanner;
public class Stringtest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对应字符串 ： ");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i =0;i<line.length();i++){
            char ch = line.charAt(i);
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else if (ch>='0'&&ch<='9'){
                numberCount++;
            }
        }
        System.out.println("大写 ： "+bigCount+"位");
        System.out.println("小写 ： "+smallCount+"位");
        System.out.println("数字 :  "+numberCount+"位");
    }
}
