package com.Joeo8.io;
public class Datatype {
    public static void main(String[] args) {
        System.out.println(1024);  //这是一个整数，默认类型就是int
        System.out.println(3.14);  //这是一个浮点数，默认类型就是double类型
        //左边是long类型，右边是默认的int类型，左右不一样   （int < long）符合范围从小到大的原则  --自动转换
        long num1 = 100 ;
        System.out.println(num1);  //100
        //左边是double，右边是float类型，左右两边不一样  （float < doule）符合范围从小到大的原则  --自动转换
        double num2 = 2.5F ;
        System.out.println(num2);  //2.5
        //左边是float，右边是long类型，左右两边不用 （long < float） 符合范围从小到大的原则  --自动转换
        float num3 = 30L;
        System.out.println(num3);  //30.0
    }
}
