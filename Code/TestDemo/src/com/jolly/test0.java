/*
*   不死神兔
*   需求：
*       有一对兔子，从出生后的第三个月开始每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月兔子的对数为多少？
*   思路：
        1.为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        2.第一个月，和第二月的兔子对数已知，均为一
        3.循环实现计算每个月兔子的对数
        4.输出数组中最后一个元素的值，就是第20个月兔子的对数
*/
package com.jolly;
public class test0 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int  x = 2 ; x < arr.length;x ++){
            arr [x] = arr [x-2] + arr [x-1];
        }
        System.out.println("第二十个月兔子的对数为 ： " + arr[19]);
    }
}
