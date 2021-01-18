package com.jolly;

public class Max {
    public static void main(String[] args) {
        int [] arr = { 12,45,98,66,73};
        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if( arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);

     }
}
