package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:52
 * Description: No Description
 */
public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                try {
                    //为了显现安全问题,卖票过程中睡眠(放弃当前线程的CPU执行权)
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
