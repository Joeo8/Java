package Joeo8.ReverseIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/16
 * Time: 19:29
 * Description: No Description
 */
public class ISR {
    public static void main(String[] args) throws IOException {
        //InputStreamReader 转化输入流
        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Java\\Other\\gbk.txt"), "GBK");
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Java\\Other\\utf.txt"), "UTF-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }
        isr.close();
    }
}
