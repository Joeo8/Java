package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/17
 * Time: 15:37
 * Description: No Description
 */
public class demo04 {
    public static void main(String[] args) {
        //匿名内部类实现线程的创建
        //1.实现extends Thread
        new Thread(()->System.out.println(Thread.currentThread().getName() + "-->" + "Joeo8")).start();

        //2.实现Implement Runnable
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "jolly");
            }
        };
        new Thread(r).start();

        //3.简化Runnable 实现接口的写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "Pablo");
            }
        }).start();
    }
}
