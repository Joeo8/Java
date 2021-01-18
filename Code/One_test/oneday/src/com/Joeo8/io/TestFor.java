package com.Joeo8.io;
//循环的嵌套
//题目要求：输出    时   分   秒
public class TestFor {
    public static  void main(String[] args){
        for (int i = 1; i <= 24 ; i++){
            for (int j = 1; j <= 60 ; j ++ ){
                for (int k = 1;k <=60;k++){
                    System.out.println( i + "时" + j + "分" + k + "秒" );
                }
            }
        }
    }
}
