package Joeo8.File;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:50
 * Description: No Description
 */
public class File04 {
    public static void main(String[] args) {
        //File创建删除类功能方法
       /* showCreate();
        showMkDir();
        showMkDirs();*/
        showDelete();
    }

    public static void showCreate() {
        //创建文件
        //要求：父路径必须存在,否则会抛出异常;创建的文件不得是已存在(只创建一遍)
        File file01 = new File("C:\\Java\\Other\\B.py");
        boolean newFile = false;
        try {
            newFile = file01.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newFile);
    }

    public static void showMkDir() {
        //创建单级文件夹
        File file01 = new File("C:\\Java\\Other\\B");
        boolean mkdir = file01.mkdir();
        System.out.println(mkdir);
    }

    public static void showMkDirs() {
        //创建单级或多级文件夹
        File file01 = new File("C:\\Java\\Other\\B\\C\\D");
        boolean mkdirs = file01.mkdirs();
        System.out.println(mkdirs);
    }
    public static void showDelete(){
        //删除文件或文件夹操作
        //注:该操作直接在硬盘上进行操作,不走回收站;所以操作需谨慎
        File file01 = new File("C:\\Java\\Other\\B");
        boolean delete = file01.delete();
        System.out.println(delete);
    }
}
