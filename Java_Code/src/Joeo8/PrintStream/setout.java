package Joeo8.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:24
 * Description: No Description
 */
public class setout {
    public static void main(String[] args) throws FileNotFoundException {
        //ps中使用setOut改变输出的地址
        System.out.println("在控制台输出");
        PrintStream ps = new PrintStream("C:\\Java\\Other\\ps.txt");
        System.setOut(ps);
        System.out.println("在指定文件下输出");
    }
}
