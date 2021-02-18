package Jolly.WaitAndNotidy;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 12:28
 * Description: No Description
 */
public class BaoZiPu extends Thread {
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            //生产包子
            synchronized (baoZi) {
                //有包子直接吃,没有包子,开始做
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒之后的操作(交替生产两种包子)
                if (count % 2 == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜馅";
                } else {
                    baoZi.pi = "厚皮";
                    baoZi.xian = "牛肉馅";
                }
                count++;

                System.out.println("包子铺正在生产" + baoZi.pi + baoZi.xian + "的包子");
                //生产包子需要三秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产好了包子,将包子的flag改位true并唤醒包子
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子铺已经生产好了" + baoZi.pi + baoZi.xian + "的包子,可以吃了");
            }
        }
    }
}
