/*
*   逢七过
*       规则是：从任意一个数字开始报当要报的数字包含7或者是7的倍数的时候都要说过
*       为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印1-100之间满足逢7过规则的数据
*   思路
*       1.循环遍历100之内的整数
*       2.控制语句中（X%7==0||X%10==7||X/10%10 ==7）
*       3.在控制台输出满足规则的数据
* */
package com.jolly;
public class test02{    public static void main(String[] args) {

    sevenN();
    }
    public  static  void sevenN(){
        for (int i = 1;i<=100;i++){
            if (i%7==0||i%10==7||i/10%10==7){
                System.out.print(i+", ");
            }
        }
    }
}
