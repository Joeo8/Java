package io.github.Joeo8;
//题目要求写出一个方法用来求1-100的累加和
public class DemoMethodSum {
    public static void main(String[] args) {
        System.out.println("1-100的累加和为： "+Sum());
    }
    public static int Sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return  sum;
    }
}
