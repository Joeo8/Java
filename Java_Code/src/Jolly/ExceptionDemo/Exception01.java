package Jolly.ExceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Throwable
//Exception 异常  throws \ try catch
//Error  错误     修改代码
/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:33
 * Description: No Description
 */
public class Exception01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999-02-13");
        System.out.println(date);
    }
}
