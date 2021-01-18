package com.Joeo8.io;
//循环控制关键字 --- continue （跳过当前循环，进入下一循环）
public class DemoIfCut1 {
    public static  void main(String[] args){
        for ( int i = 1; i <= 10;i ++){
            if (i == 4){
                continue;
            }
            System.out.println("第"+ i + "次循环");
            //continue直接跳过当前循环，进入下一循环
        }
    }
}
