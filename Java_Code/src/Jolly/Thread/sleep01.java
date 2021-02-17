package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:23
 * Description: No Description
 */
public class sleep01 {
    public static void main(String[] args) {
        //sleep方法  模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);     //单位是毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
