package Joeo8.BufferIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 18:33
 * Description: No Description
 */
public class BF02 {
    public static void main(String[] args) throws IOException {
        //BufferedInputStream 字节缓冲输入流
        FileInputStream fis = new FileInputStream("C:\\Java\\Other\\bf.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte [] bytes = new byte[1024];
        int len = 0 ;
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
