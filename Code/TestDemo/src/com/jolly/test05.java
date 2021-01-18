/*
  案例：数组内容相同
    需求：
          设计一个方法，用于比较两个数组的内容是否相等
    思路：
          1.定义两个数组，分别用静态初始化完成数组元素的初始化
          2.定义一个方法，用于比价两个数组的内容是否相等
                返回值类型： boolean
                参数：int []arr1,int []arr2
          3.比较两个数组内容是否相同，按照下面的步骤就可以了
          首先比较两个数组的长度，如果长度不同，数组的内容肯定不同，返回false
          其次遍历，比较两个数组中的每一个元素，只要元素不同，返回false
          最后循环遍历结束后，返回true
          4.调用方法，用变量接受
          5.输出结果
*/
package com.jolly;
public class test05 {
    public static void main(String[] args) {
        int [] arr1 = {11,22,33,44,55,66};
        int [] arr2 = {11,22,33,44,55,66};
      boolean  flag = compare(arr1,arr2);
        System.out.println("两者是否相等：" + flag );
    }
    public  static  boolean compare(int [] arr1,int [] arr2){
    //首先比较数组的长度，如果两个数组的长度不同，数组的内容肯定不同，返回false
        if (arr1.length != arr2.length){
            return false;
        }
    //其次，循环遍历数组，比较每一个元素是否相等
        for (int i = 0;i < arr1.length;i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
    //最后循环遍历结束，返回true
        return true ;
    }
}






