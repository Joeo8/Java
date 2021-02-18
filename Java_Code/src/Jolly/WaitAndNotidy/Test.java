package Jolly.WaitAndNotidy;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 13:14
 * Description: No Description
 */
public class Test {
    public static void main(String[] args) {
         BaoZi  baozi = new BaoZi();
         new BaoZiPu(baozi).start();
         new ChiHuo(baozi).start();
    }
}
