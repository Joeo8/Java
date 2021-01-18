package io.github.Joe;
//实验返回值类型包括多个数据
public class TestArrayReturn {
    public static void main(String[] args) {
        int [] result = calculate(10,20,30); //赋值调用
        System.out.println("main方法里收到的返回数组值是:");
        System.out.println(result);
        System.out.println("总和 ： " + result[0]);
        System.out.println("平均数： " +result[1]);
    }
    public static int [] calculate(int a ,int b ,int c){
        int sum = a+b+c;
        int avg = sum / 3;
        int arr[]  = {sum , avg};
        System.out.println("calculate方法内部数组是 ：");
        System.out.println(arr); // 输出的为地址值
        return arr;
    }
}






