package Joeo8.BufferIO;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 18:39
 * Description: No Description
 */
public class BFTest {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //文件复制(利用缓冲流)
        FileInputStream fis = new FileInputStream("C:\\Java\\Other\\1.png");
        FileOutputStream fos = new FileOutputStream("C:\\Java\\Other\\2.png");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte [] bytes = new byte[1024];
        int len = 0 ;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("文件复制共耗时："+(end-start)+"ms");
    }
}
