/*
   查找
*   需求：已知一个数组 arr = {19，28，37，46，50}；键盘录入一个数据，查找该元素在数组中的索引，并在控制台输出找到的索引值
*   思路：
*       1.定义一个数组，用静态初始化完成数组的初始化
*       2.键盘录入一个要查找的数据，用一个变量接收
*       3.定义一个索引变量，初始值为-1
*       4.遍历数组，获取得到数组中的每一个元素
*       5.拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引值给索引变量，并结束循环
*       6.输出索引变量
*/

package com.jolly;
import java.util.Scanner;
public class test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您要查找的数据： ");
        int number = sc.nextInt();
        int [] arr = {19,28,37,46,50};
        int index = getIndex( arr ,number);
        System.out.println("你要找的数据在第"+(index+1)+"个");
       /* int index = -1;
        for (int i=0;i<arr.length;i++){
            if (number == arr[i]){
                index = i;
            }
        }
        System.out.println("您所查找的数据对应第"+(index+1)+"个");*/
    }
    public  static  int getIndex(int []arr,int number){
            int index = -1;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==number){
                    index = i;
                    break;
                }
            }
            return  index;
    }
}
