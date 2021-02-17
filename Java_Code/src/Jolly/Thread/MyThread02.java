package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/17
 * Time: 15:11
 * Description: No Description
 */
public class MyThread02 extends Thread{
    public MyThread02() {
    }

    public MyThread02(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

      /*  Thread thread = Thread.currentThread();
        System.out.println(thread);
        String name = thread.getName();
        System.out.println(name);*/
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
