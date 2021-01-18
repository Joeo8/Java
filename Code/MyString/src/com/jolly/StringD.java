//实验String对象的特点
package com.jolly;
public class StringD {
    public static void main(String[] args) {
//        第一种方式，构造方法的方式得到对象
        char [] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1 == s2);

//        第二种方法，直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";
        System.out.println( s3 == s4);
//        比较字符串对象地址是否相等
        System.out.println(s1 == s3);
    }

}
