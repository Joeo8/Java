package io.github.Joeo8;
//定义一个方法，比较两个数字是否相等
public class DemoMethod_isSame {
    public static void main(String[] args) {
        System.out.println(   isSame(10,20));
        System.out.println( isSame(20,20));
    }

    public static boolean isSame(int a , int b ){
        //第一种方法
       /* if (a == b ){
            return true;
        }else {
            return false;
        }*/
        //第二种方法（三元运算）
      /*  boolean result = a == b ? true : false;
        return  result;*/
        //第三种方法（最简洁高效）
       return a == b;
    }
}
