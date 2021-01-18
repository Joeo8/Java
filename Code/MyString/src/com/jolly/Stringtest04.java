/*
*   字符串拼接 :
*        需求 :
*           定义一个方法，把int数组中的数据按照指定的格式拼接成y一个字符串返回，调用该方法，并在控制台输出结果
*           例如 ： 数组为 int []arr = {1,2,3},执行方法后的输出为[1,2,3]
*       思路 :
*           1.定义一个int类型的数组，用静态初始化完成数组元素的初始化
*           2.定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回
*               返回值类型为String ，参数列表为 int[] arr
*           3.在方法中遍历数组，按照要求进行拼接
*           4.调用方法用一个变量接受结果
*           5.输出结果
*/

package com.jolly;
public class Stringtest04 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        String s = StringPrint(arr);
        System.out.println("s : " +s);
    }
    public  static  String StringPrint( int [] arr){
        String s = "";
        s += "[";
        for (int i =0 ;i<arr.length ; i++){
            if (i == arr.length-1){
                s += arr[i];
            }else{
                s += arr[i];
                s +=", ";
            }
        }
        s += "]";
        return s;
    }
}
