package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:10
 * Description: No Description
 */
public class demo02 {
    public static void main(String[] args) {
        //获取线程名称  GetName() \  currentThread.getName()
        MyThread02 mt = new MyThread02();
        mt.start();
        new MyThread02().start();
        new MyThread02().start();
        //获取主线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
