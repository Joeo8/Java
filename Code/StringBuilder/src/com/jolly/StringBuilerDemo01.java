/*
StringBuilder 构造方法 :
    public StringBuilder() : 创建一个空白的可变字符串对象，不含有任何内容
    public StringBuilder(String ste):根据字符串内容，来创建可变字符对象
*/
package com.jolly;
public class StringBuilerDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb : " + sb);
        System.out.println("sb.length() : " +sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2 : "+ sb2);
        System.out.println("sb2.length() : "+ sb2.length());
    }
}
