package Joeo8.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 21:24
 * Description: No Description
 */
public class Test02 {
    public static void main(String[] args) {
        //输出多目录下以java结尾的文件
        File file = new File("C:\\JavaSE_Code");
        getAllFiles(file);
    }

    public static void getAllFiles(File file) {
//        System.out.println(file);
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files) {
            if (f.isDirectory()) {
                getAllFiles(f);
            } else {
                if (f.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }
}
