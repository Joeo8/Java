package Joeo8.Test;

import Joeo8.Filter.FileFilter;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/15
 * Time: 22:53
 * Description: No Description
 */
public class Test03 {
    public static void main(String[] args) {
        //文件查找操作(借助过滤器进行实现)
        File file = new File("C:\\JavaSE_Code");
        GetFiles(file);
    }
    public static void GetFiles(File f){
        File[] files = f.listFiles(new FileFilter());
        for (File file: files) {
            if (file.isDirectory()){
                GetFiles(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
