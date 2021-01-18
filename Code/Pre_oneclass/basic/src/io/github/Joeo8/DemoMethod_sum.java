package io.github.Joeo8;

//定义两个int类型数据相加的方法
//练习三种调用方式
public class DemoMethod_sum {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));//打印调用
        int x = sum(4, 0);//赋值调用
        System.out.println(x);
        sum(12, 23);  //单独调用
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
