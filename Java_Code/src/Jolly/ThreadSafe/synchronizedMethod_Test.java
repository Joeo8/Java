package Jolly.ThreadSafe;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 17:00
 * Description: No Description
 */
public class synchronizedMethod_Test {
    public static void main(String[] args) {
        //处理线程安全问题: 同步方法(实质同步锁住的还是Runnable接口)
        synchronizedMethod symethod = new synchronizedMethod();
        System.out.println(symethod);
        Thread thread01 = new Thread(symethod);
        Thread thread02 = new Thread(symethod);
        Thread thread03 = new Thread(symethod);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
