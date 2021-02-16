package Joeo8.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:20
 * Description: No Description
 */
public class print {
    public static void main(String[] args) throws FileNotFoundException {
        // PrintStream 打印流
        PrintStream ps = new PrintStream("C:\\Java\\Other\\ps.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
