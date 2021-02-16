package Joeo8.ReverseIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 19:25
 * Description: No Description
 */
public class OSW {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter 转换输出流
        write_UTF_8();
        write_GBK();
    }

    private static void write_GBK() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Java\\Other\\gbk.txt"), "GBK");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    private static void write_UTF_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Java\\Other\\utf.txt"), "UTF-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
