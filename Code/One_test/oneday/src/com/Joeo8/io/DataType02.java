package com.Joeo8.io;
public class DataType02 {
    public static void main(String[] args) {
        //两个常量之间可以进行数学运算
        System.out.println(20 + 30); //50
        //两个变量之间也可以进行数学运算
        int a = 20 ;
        int b = 30 ;
        System.out.println(a + b );  //50
        //常量和变量之间可以混着用
        System.out.println(a * 10); //200
        int x = 10 ;
        int y = 3 ;
        int result  = x / y ;  //3
        System.out.println( result);
        int result2 = x % y;
        System.out.println(result2);  //1
        //int + double --> double + double -->double
        double result3 = x + 2.5;
        System.out.println(result3);  //12.5
    }
}
