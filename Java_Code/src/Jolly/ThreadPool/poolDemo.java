package Jolly.ThreadPool;
//线程池 JDK5之后提供了线程池工厂类Executors用于生产指定数量的线程池

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:01
 * Description: No Description
 */
public class poolDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());

        es.shutdown();      //销毁线程池
    }
}
