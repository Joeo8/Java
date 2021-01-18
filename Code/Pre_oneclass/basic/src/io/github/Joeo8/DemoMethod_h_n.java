package io.github.Joeo8;
//体验 有参/无参方法
public class DemoMethod_h_n {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("==============");
        print();
    }
    public static void sum(int a ,int b ){  //没有返回值，直接输出
        int result = a * b ;
        System.out.println("结果是 ：" + result);  //不需要return
    }
    public static void print(){
        for (int i = 0; i < 6; i++) {
            System.out.println("HelloWorld");
        }
    }
}
