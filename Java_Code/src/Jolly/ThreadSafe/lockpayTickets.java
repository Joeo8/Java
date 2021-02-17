package Jolly.ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 17:18
 * Description: No Description
 */
public class lockpayTickets implements Runnable {
    private int tickets = 100;

    //    ReentrantLock rt = new ReentrantLock();
    Lock rt = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            rt.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    rt.unlock();
                }
            }
        }
    }
}
