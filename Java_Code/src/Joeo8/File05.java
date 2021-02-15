package Joeo8;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 21:07
 * Description: No Description
 */
public class File05 {
    public static void main(String[] args) {
        //File遍历功能方法
        showList();
        System.out.println();
        showListFiles();
    }

    public static void showList() {
        //以String类型接收获取到的目录或子文件(带文件路径)
        File file = new File("C:\\Java");
        String[] list = file.list();
        assert list != null;
        for (String str :
                list) {
            System.out.println(str);
        }
    }

    public static void showListFiles() {
        //以File类型接收目录和子文件
        File file = new File("C:\\Java");
        File[] fileList = file.listFiles();
        assert fileList != null;
        for (File f :
                fileList) {
            System.out.println(f);
        }
    }
}
