package Joeo8;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:43
 * Description: No Description
 */
public class File03 {
    public static void main(String[] args) {
        //File中判断类方法
        showExit();
        showDir();
        showFile();
    }

    public static void showExit() {
        //判断路径是否存在
        File file01 = new File("C:\\Java\\Other");
        boolean exists = file01.exists();
        System.out.println(exists);
    }

    public static void showDir() {
        //判断是否是文件夹
        File file01 = new File("C:\\Java\\Other");
        boolean isDir = file01.isDirectory();
        System.out.println(isDir);
    }

    public static void showFile() {
        //判断是否是文件
        File file01 = new File("C:\\Java\\Other");
        boolean isfile = file01.isFile();
        System.out.println(isfile);
    }
}
