package Joeo8.IO;
//使用字节流读取中文时会出现乱码(GBK --> 3 个字节 | UTF-8 --> 2 个字节)
//字符流(一次读写一个字符)
//Reader 字符输入流

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:11
 * Description: No Description
 */
public class IO05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Java\\Other\\b.txt");
        int len = 0;
        /*
        //第一种循环输出单个字符
        while((len= fr.read())!=-1){
            System.out.println((char) len);
        }*/

        //第二种 一次读取多个字符
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
