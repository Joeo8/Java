package Jolly.ExceptionDemo;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:56
 * Description: No Description
 */
public class Exception02 {
    public static void main(String[] args) {
        //RequireNonNull
        method(null);
    }
    public static  void method(Object o){
        //判断输入的参数是否为空,Object静态的throw  new RuntimeException
        Objects.requireNonNull(o,"参数为空");
    }
}
