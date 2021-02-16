package Joeo8.BufferIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/16
 * Time: 18:54
 * Description: No Description
 */
public class BF04 {
    public static void main(String[] args) throws IOException {
        //BufferedReader 字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("C:\\Java\\Other\\bw.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
