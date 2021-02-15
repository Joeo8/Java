package Joeo8.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 21:24
 * Description: No Description
 */
public class Test01 {
    public static void main(String[] args) {
        //遍历打印多级目录
        File file = new File("C:\\Java");
        getAllFiles(file);
    }

    public static void getAllFiles(File file) {
        System.out.println(file);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFiles(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
