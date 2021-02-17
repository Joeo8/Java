package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/17
 * Time: 15:28
 * Description: No Description
 */
public class RunnableImp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
