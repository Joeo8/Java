/*
评委打分：
        需求：
            在编程竞赛中，有6个评委为参赛的选手打分，分手为0-100的整数分
            选手的最后得分为：去掉一个最高分，去掉一个最低分后的4个评委的评价比分(不考虑小数部分)
        思路：
            定义一个数组，用动态初始化完成数组的初始化，长度为6
            键盘录入评委分数
            由于是6个评委打分，所以，接受评委分数的操作，用循环改进
            定义方法实现获取数组中的最高分（数组最大值），调用方法
            定义方法实现获取数组中的最低分（数组最小值），调用方法
            定义方法实现获取数组中所有元素的和（数组元素求和），调用方法
            按照计算规则进行计算得到平均分
            输出平均分
*/

package com.jolly;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        for (int i =0 ; i< arr.length ; i++){
            System.out.print("请输入"+(i+1)+"个评委的打分 : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("评委的打分组合为 ： ");
        pritnArray(arr);
        System.out.println("");
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int grades = (sum - max - min) / (arr.length -2);
        System.out.println("总分为 ： "+ sum);
        System.out.println("去掉一个最低分： "+min);
        System.out.println("去掉一个最高分： "+max);
        System.out.println("最终得分为： "+grades);

    }
    public  static  void pritnArray(int []arr){
         System.out.print("[");
        for (int x = 0;x<arr.length;x++){
            if (x == arr.length - 1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+", ");
            }
        }
        System.out.print("]");
    }
    public static  int getMax(int [] arr){
            int max = arr[0];
        for (int x = 0;x < arr.length;x++ ){
            if(max<arr[x]){
                max = arr[x];
            }
        }
        return  max;
    }
    public static  int getMin(int [] arr){
        int min = arr[0];
        for (int x = 0;x<arr.length;x++){
            if (min>arr[x]){
                min = arr[x];
            }
        }
        return min;
    }
    public  static  int getSum(int [] arr){
        int sum = 0;
        for (int x = 0 ;x< arr.length;x++){
            sum += arr[x];
        }
        return sum;
    }
}
