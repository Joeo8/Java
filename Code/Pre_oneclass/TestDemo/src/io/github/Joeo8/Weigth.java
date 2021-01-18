package io.github.Joeo8;
import java.util.Scanner;
//月球上的重力是地球的17%，请编写一个程序来计算你在月球的实际体重
public class Weigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你当前的体重值: ");
        double weight = sc.nextDouble();
        WeightMath(weight);
    }
    public static  void WeightMath(double weight){
        double RealWeight = weight * 0.17;
        System.out.println("你在月球的真实体重为： "+RealWeight);
    }
}
