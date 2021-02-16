package Joeo8.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 13:09
 * Description: No Description
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        //文件复制  --> 一读一写
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\JAVA\\Other\\1.png");
        FileOutputStream fos = new FileOutputStream("C:\\JAVA\\1.png");
        byte [] bytes = new byte[1024];
        int len = 0 ;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0, len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("本次文件复制共耗时: "+(end-start)+"ms");
    }
}
