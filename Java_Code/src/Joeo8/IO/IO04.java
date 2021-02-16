package Joeo8.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 12:39
 * Description: No Description
 */
public class IO04 {
    public static void main(String[] args) throws IOException {
        //FileInputStream 文件输入流
        FileInputStream fis = new FileInputStream("C:\\Java\\Other\\b.txt");
        /*int len = 0 ;
        //用循环输出多个字节
        while(( len = fis.read())!=-1){
            System.out.println((char) len);
        }*/
/*

        //用构造方法依次输出多个字节
        byte [] bytes = new byte[10];
        int read = fis.read(bytes);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
*/

        //优化一次读取多个字节的操作
        byte [] bytes1 = new byte[1024];
        int len = 0 ;
        while ((len = fis.read(bytes1)) != -1){
            System.out.println(new String(bytes1,0,len));
        }
        fis.close();

    }
}
