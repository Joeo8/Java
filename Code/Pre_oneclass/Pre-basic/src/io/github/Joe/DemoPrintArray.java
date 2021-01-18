package io.github.Joe;

import java.util.Arrays;

//对比面向对象和面向过程进行输出数组元素
public class DemoPrintArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        Print(arr);
        System.out.println("=====================");
        //面向对象吗，找一个JDK给我们提供好的Array类
        //其中的toString方法就可以直接达到我们想要的结果
        System.out.println(Arrays.toString(arr));
    }
    public static void Print(int [] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
