package com.Joeo8.io;
//题目：求1-100之间的偶数和（要求使用三种循环语句）
public class TestSum {
    public static void main(String[] args) {
        int sum = 0;
        //for循环 ------方法一
        /* for (int i = 1;i <= 100; i++){
            if (i % 2 == 0){
                  sum += i ;
            }
        }*/
        //while循环-------方法二
        /*int i = 1;
        while(i<=100){
           if (i % 2 == 0){
               sum +=i;
           }
           i ++;
        }*/
        //do...while循环 -----方法三
        int i = 1;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);


        System.out.println("1-100的偶数和为： " + sum);
    }
}
