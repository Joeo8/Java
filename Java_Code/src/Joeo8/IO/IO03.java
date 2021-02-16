package Joeo8.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 12:29
 * Description: No Description
 */
public class IO03 {
    public static void main(String[] args) throws IOException {
        //换行写,追加写
        FileOutputStream fos = new FileOutputStream("C:\\Java\\Other\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
