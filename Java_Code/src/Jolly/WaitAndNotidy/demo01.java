package Jolly.WaitAndNotidy;

//等待唤醒 (线程之间的通信)
//利用同步代码块将生产者和消费者包裹起来,保证只能有一个线程在执行(锁对象要唯一)

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 17:40
 * Description: No Description
 */
public class demo01 {
    public static void main(String[] args) {
        Object obj = new Object();

        //创建一个消费者线程
        new Thread() {
            @Override
            public void run() {
                //使用同步代码块
                synchronized (obj) {
                    System.out.println("我要xxxxx");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒消费者之后的操作
                    System.out.println("收到,谢谢！");
                }
            }
        }.start();

        //创建一个生产者线程
        new Thread() {
            @Override
            public void run() {
                //需要5秒来准备
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //使用同步代码块
                synchronized (obj) {
                    System.out.println("给你xxxxx");
                    obj.notify();   //唤醒消费者
                }
            }
        }.start();
    }
}
