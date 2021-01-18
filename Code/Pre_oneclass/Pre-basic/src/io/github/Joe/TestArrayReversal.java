package io.github.Joe;
//实现数组元素的反转
public class TestArrayReversal {
    public static void main(String[] args) {
        //静态初始化数组
        int [] arr = new int[]{7,2,3,0,5};
        PrintArr(arr);
        System.out.println("反转过：");
        Reversal(arr);
    }
    //定义一个方法，正常打印输出数组元素
    public static void PrintArr(int [] arr){
        System.out.println("原始数组为： ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("[ "+arr[i]);
            }else if(i == arr.length-1){
                System.out.print(" "+arr[i]+" ]");
            }else{
                 System.out.print(" "+arr[i]  );
            }
        }
        System.out.println();
    }
    //定义方法，实现数组元素的反转功能
    public static void Reversal(int [] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
          if (i< arr.length/2){
                temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
          }
          if (i == 0){
                System.out.print("[ "+arr[i]);
            }else if(i == arr.length-1){
                System.out.print(" "+arr[i]+" ]");
            }else{
                 System.out.print(" "+arr[i]  );
            }
        }
    }
}

/*
    回顾for循环：
        for（初始化条件；判断条件；步进表达式）{
                循环体
        }
*/