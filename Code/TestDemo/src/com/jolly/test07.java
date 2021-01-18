/*
 反转:
         需求:
            已知一个数组 arr ={19,28,37,46,50};用程序实现数组中的元素交换;
            交换后的数组 arr ={50,46,37,28,19};并在控制台输出交换后的数组元素
         思路:
            1.定义一个数组，用静态初始化完成数组元素的初始化
            2.循环遍历数组，第一次初始化语句定义了两个索引变量，判断条件是开始索引小于等于结束索引
            3.变量交换
            4.遍历数组
*/

package com.jolly;

public class test07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
      /*  for (int start = 0,end =arr.length-1 ;start<=end;start++,end--){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }*/
//        System.out.print("原数组为：  " + arr);
        System.out.println("反转后的数组为： ");
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.print("]");

    }

    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}