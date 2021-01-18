package com.Joeo8.io;
public class DataType01 {
    public static void main(String[] args){
        int num = (int)100L;
        System.out.println(num);
        int num2 = (int)6000000000L;//1705032704 数据溢出 （洒了）
        System.out.println(num2);
        int num3 = (int)3.9;
        System.out.println(num3);
        char zifu = 'A';
        System.out.println(zifu+1); // 66  计算机底层会用一个数字表示字符A
        //一旦char类型参与数学运算，字符就会按照y一定的规则翻译成为一个数字
        byte num4 = 40 ;
        byte num5 = 50 ;
        int result = num4 + num5;  // byte + byte -->  int + int = int
        System.out.println(result);

        short num6 = 60;
        short result2 = (short)(num4 + num6) ;
        System.out.println(result2);
    }
}
