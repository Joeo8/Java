package Joeo8.File;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:10
 * Description: File
 */
public class File01 {
    public static void main(String[] args) {
        /*路径分隔符*/
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);    //Windows中是; --------Linux中是 :
        /*文件名称分隔符*/
        String separator = File.separator;
        System.out.println(separator);      //注：windows中是\ -------- Linux中是/
    }
}

