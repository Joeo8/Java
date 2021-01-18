package io.github.Joeo8;
//练习：比较两个数据是否相等，参数类型分别为两个byte、两个short、两个int、和两个long类型
public class DemoMethodOverload {
    public static void main(String[] args) {
        System.out.println(Same(12L,12L));
    }
    public static  boolean Same(int a ,int b ){
        System.out.println("两个int类型！");
        return a == b;
    }
     public static  boolean Same(short a ,short b ){
         System.out.println("两个short类型！");
        return a == b;
    } public static  boolean Same(long a ,long b ){
        System.out.println("两个long类型！");
        return a == b;
    } public static  boolean Same(byte a ,byte b ){
        System.out.println("两个byte类型！");
        return a == b;
    }
}
