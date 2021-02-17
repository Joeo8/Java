package Jolly.Thread;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:27
 * Description: Runnable Implements
 */
public class demo03 {
    public static void main(String[] args) {
        //创建线程的第二种方法 实现Runnable接口 ==> Thread ==> start()
        //这种方法的好处: 多实现,增强了代码的扩展性,降低了程序的耦合(解耦)
        RunnableImp runnableImp = new RunnableImp();
        Thread thread = new Thread(runnableImp);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
