package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 13:13
 * Description: No Description
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            System.out.println("run"+i);
        }
    }
}
