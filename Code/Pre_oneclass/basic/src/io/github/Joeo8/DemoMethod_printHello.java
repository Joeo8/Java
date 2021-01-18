package io.github.Joeo8;
//题目要求，打印指定次数的helloworld
public class DemoMethod_printHello {
    public static void main(String[] args) {
        printHello(7);
    }
    public static void printHello(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println("Hello  World " + i);
        }
    }
}
