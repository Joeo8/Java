package Jolly.WaitAndNotidy;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 13:08
 * Description: No Description
 */
public class ChiHuo extends Thread {
    private BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    //吃货吃包子
    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //线程被唤醒之后的操作 (吃包子)
                System.out.println("吃货正在吃" + baoZi.pi + baoZi.xian + "的包子");
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("吃货吃完了" + baoZi.pi + baoZi.xian + "的包子,包子铺可以继续做了");
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }
}
