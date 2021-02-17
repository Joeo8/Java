package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:52
 * Description: ThreadSafe
 */
public class demo01 {
    public static void main(String[] args) {
        //线程安全问题:售票问题(卖票中出现了重复的票和不存在的票)
        SellTicket sellTicket = new SellTicket();

        Thread thread01 = new Thread(sellTicket);
        Thread thread02 = new Thread(sellTicket);
        Thread thread03 = new Thread(sellTicket);

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
