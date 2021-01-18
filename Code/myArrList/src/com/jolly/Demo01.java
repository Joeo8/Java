/*
    数组：是一种用于存储多个相同类型数据的存储模型

    定义格式：（推荐方式）
        数据类型 [] 数组名；
        eg： int [] arr;
    数组初始化：
        a:所谓初始化就是为数组中的每个元素分配内存空间，并为每个元素赋值
        b:数组初始化     动态初始化
                        静态初始化
        动态初始化：
            初始化时只指定数组的长度，由系统为数组分配初始值
            格式 : 数据类型 [] 变量名 = new 数据类型[ 数据长度 ]；
            eg： int [] arr  = new int[3];

*/

package com.jolly;

public class Demo01 {
    public static void main(String[] args) {
//        System.out.println("");
        int [] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
    }

}
