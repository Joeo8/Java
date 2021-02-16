package Joeo8.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:46
 * Description: No Description
 */
public class IO08 {
    public static void main(String[] args) {
        //JDK7处理异常try（）针对括号中的异常处理后自动关闭
        //文件复制  --> 一读一写
        try (FileInputStream fis = new FileInputStream("C:\\JAVA\\Other\\1.png");
             FileOutputStream fos = new FileOutputStream("C:\\JAVA\\1.png");
        ) {
            long start = System.currentTimeMillis();
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("本次文件复制共耗时: " + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
