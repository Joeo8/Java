package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 17:11
 * Description: No Description
 */
public class Lock {
    public static void main(String[] args) {
        //Lock 处理线程安全问题
        //创建一个ReentrantLock对象
        //在出现安全问题的代码前加上lock
        //在finally中unlock(将锁释放)
        lockpayTickets lock = new lockpayTickets();

        Thread thread01 = new Thread(lock);
        Thread thread02 = new Thread(lock);
        Thread thread03 = new Thread(lock);

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
