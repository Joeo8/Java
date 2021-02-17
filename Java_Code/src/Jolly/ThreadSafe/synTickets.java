package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:11
 * Description: No Description
 */
public class synTickets implements Runnable {
    private int ticket = 100;
    //创建一个锁对象 (放在run方法外部,否则调用一次tun方法生成一个锁对象,不能锁住所有线程)
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //synchronized 放置可能出现线程安全的代码(即访问共享数据)
            synchronized (obj) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
