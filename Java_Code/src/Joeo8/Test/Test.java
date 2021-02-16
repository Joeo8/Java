package Joeo8.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 11:24
 * Description: No Description
 */
public class Test {
    /* public static void main(String[] args) {
         //递归输出多级目录
         File file = new File("C:\\JavaSE_Code");
         showAll(file);
     }

     public static void showAll(File file) {
         File[] files = file.listFiles();
         for (File f : files) {
             if (f.isDirectory()) {
                 showAll(f);
             } else {
                 System.out.println(f);
             }
         }
     }*/
    public static void main(String[] args) {
        //文件查找,遍历文件的同时显示对应的以.java结尾的文件
        File file = new File("C:\\JavaSE_Code");
        showFiles(file);
    }

    public static void showFiles(File file) {
       /*//1.使用匿名内部类编写FileFilter
       File[] files = file.listFiles(new FileFilter() {
           @Override
           public boolean accept(File pathname) {
               return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
           }
       });*/
        //2.使用Lambda优化代码
        //File[] files = file.listFiles(pathname -> (pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java")));

        /*//3.使用FileNameFilter过滤器
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });*/
        //4.使用Lambda优化FileNameFilter
        File[] files = file.listFiles((dir,name) -> (new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java")));
        for (File f : files) {
            if (f.isDirectory()) {
                showFiles(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
