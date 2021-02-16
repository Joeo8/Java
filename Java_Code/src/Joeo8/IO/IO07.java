package Joeo8.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 15:40
 * Description: No Description
 */
public class IO07 {
    public static void main(String[] args) {
        //Try Catch处理流中异常
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Java\\Other\\a.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("Joeo8" + i + "\r\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
