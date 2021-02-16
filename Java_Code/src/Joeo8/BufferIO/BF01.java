package Joeo8.BufferIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 18:28
 * Description: No Description
 */
public class BF01 {
    public static void main(String[] args) throws IOException {
        //BufferedOutputStream 字节缓冲输出流
        FileOutputStream fos = new FileOutputStream("C:\\Java\\Other\\bf.txt");
        BufferedOutputStream bf = new BufferedOutputStream(fos);
        bf.write("将数据写入到文件中".getBytes());
        bf.flush();
        bf.close();
    }
}
