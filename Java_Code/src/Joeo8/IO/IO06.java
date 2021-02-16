package Joeo8.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:25
 * Description: No Description
 */
public class IO06 {
    public static void main(String[] args) throws IOException {
        //Writer 字符输出流
        FileWriter fw = new FileWriter("C:\\Java\\Other\\d.txt");
        fw.write(97);
        fw.flush();
        fw.write("Joeo8你好");
        fw.close();
    }
}
