package com.Joeo8.io;

//循环控制关键字 break练习
public class DemoIfCut {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            } // 使用break循环控制关键之，直接打断循环，循环立即结束
            System.out.println("第 " + i + " 次输出！");

        }
    }
}
