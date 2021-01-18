package io.github.Joeo8;
public class DemoMethod {
    public static void main(String[] args) {
    printMethod();
        //用基础语句写
      /*  for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //利用方法实现功能

    }
     public static  void printMethod(){
            for (int i = 0; i < 5; i++) {
                for (int i1 = 0; i1 < 25; i1++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
