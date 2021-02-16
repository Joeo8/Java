package Joeo8.BufferIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 18:50
 * Description: No Description
 */
public class BF03 {
    public static void main(String[] args)  throws IOException {
        //BufferedWriter 字符缓冲输出流
        BufferedWriter  bw = new BufferedWriter(new FileWriter("C:\\Java\\Other\\bw.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("Joeo8"+i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
