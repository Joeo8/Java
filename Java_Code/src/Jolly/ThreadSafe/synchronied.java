package Jolly.ThreadSafe;
//解决线程安全问题   ==>   1.同步代码块  2.同步方法  3.Lock锁

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:06
 * Description: No Description
 */
public class synchronied {
    public static void main(String[] args) {
        //synchronized 同步代码块
        //原理: 让多个线程使用同一个锁对象(把同步代码块锁住,保证只有一个线程在同步代码块中执行)
        //总结: 同步中的线程没有执行完毕不会释放锁;同步外的线程没有锁,进不去
        //缺点: 程序频繁的判断锁,获取锁,释放锁,程序的效率降低
        synTickets run = new synTickets();

        Thread th01 = new Thread(run);
        Thread th02 = new Thread(run);
        Thread th03 = new Thread(run);

        th01.start();
        th02.start();
        th03.start();

    }
}
