/*
 String 和 StringBuilder 的转换
    StringBuilder →  String ：
        public String toString():通过toString()就可以实现把转化
    String → StringBuilder ：
        public StringBuilder(String s):通过构造方法就可以实现转化
 */

package com.jolly;
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        String s = " hello ";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s);

        String ss = sb.toString();
        System.out.println(ss);
    }
}
