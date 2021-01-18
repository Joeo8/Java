/*模拟用户登录 :
        需求： 已知用户名和密码，请使用程序模拟永华登录。一共有三次机会，登录之后，给出相应的提示
        思路：
        1.已知用户名和密码，定义两个字符串表示即可
        2.键盘录入要登陆的用户名和密码，用Scanner实现
        3.拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals（）实现
        4.用循环实现多次机会，这里的次数明确，采用for循环，并在登录成功后，使用break结束循环*/
package com.jolly;

import java.util.Scanner;

public class Stringtest01 {
    public static void main(String[] args) {
        String username = "songg";
        String password = "jolly";
        for (int i = 0;i<3;i++){

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名 : ");
        String  name = sc.nextLine();
        System.out.print("请输入密码 ： ");
        String pwd = sc.nextLine();
        if (name.equals(username) && password.equals(pwd)){
            System.out.println("登陆成功 ！");
            break;
        }else{
            if (2-i == 0){
                System.out.println("你的账户被锁定，请与管理员练习！");
            }else{
                 System.out.println("登陆失败，你还有"+(2-i)+"次机会");
            }

        }
        }

    }
}
