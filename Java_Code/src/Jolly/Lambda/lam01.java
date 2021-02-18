package Jolly.Lambda;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:14
 * Description: No Description
 */
public class lam01 {
    public static void main(String[] args) {
        /*//创建Runnable接口实现类
        RunnableImp run =  new RunnableImp();
        //创建一个Thread
        Thread thread = new Thread(run);
        //调用start方法,开启线程
        thread.start();
*/

        /*//简化代码,使用匿名内部类,实现多线程程序
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(run).start();*/

        /*//进一步简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();*/

        //简化冗余代码
        //进一步简化 ==> Lambda函数式编程思想 (参数,箭头,重写接口抽象方法的代码)
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }
        ).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
