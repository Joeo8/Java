package Jolly.Lambda;

import com.sun.deploy.net.cookie.CookieUnavailableException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 14:27
 * Description: No Description
 */
public class lam02Cook {
    public static void main(String[] args) {
        //1.一般写法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了。。。");
            }
        });
        //2.Lambda优化写法
        invokeCook(() -> System.out.println("Lambda真香！！！"));

    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
