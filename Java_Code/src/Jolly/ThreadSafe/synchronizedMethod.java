package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:57
 * Description: No Description
 */
public class synchronizedMethod implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        System.out.println(this);
        while (true) {
            payTickets();
        }
    }

    public synchronized void payTickets() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
            tickets--;
        }
    }
}
