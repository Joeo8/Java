package com.jolly;

public class Min {
    public static void main(String[] args) {
        int [] arr = {12,35,66,45,89,2,15};
        int min = arr[0];
        for (int i = 0 ; i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值是 ：" + min);
    }
}
