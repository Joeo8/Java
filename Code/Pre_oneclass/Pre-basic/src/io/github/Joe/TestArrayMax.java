package io.github.Joe;
//练习题：求数组中的最大值
public class TestArrayMax {
    public static void main(String[] args) {
        //静态初始化定义一个arr数组
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        //调用方法输出数组中的最大值（有返回值）
        GetMax(arr); //单独调用不会输出最值
        /*
        方法的调用有三种类型：
                1. 单独调用
                2. 赋值调用
                3. 打印调用
        */
        System.out.print("最大值为： ");
        System.out.println(GetMax(arr));
    }
    //定义方法实现输出最大值
    public static int  GetMax(int [] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];       //循环中更换最值
            }
        }
        return max; //返回int类型最值
    }
}
