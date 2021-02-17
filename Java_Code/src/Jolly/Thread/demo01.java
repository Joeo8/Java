package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:34
 * Description: No Description
 */
public class demo01 {
    //创建多线程  extends Thread  ==> run()   ==>start()
    public static void main(String[] args) {
        //创建一个线程(Java中是抢占式任务调度)
        MyThread mt = new MyThread();
        mt.start();

        for (int i=1;i<20 ;i++) {
            System.out.println("main"+i);
        }
    }
}
