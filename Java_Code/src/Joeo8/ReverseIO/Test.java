package Joeo8.ReverseIO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 19:36
 * Description: No Description
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //转换文件编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Java\\Other\\utf.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Java\\Other\\utf-gbk.txt"), "GBK");

        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
