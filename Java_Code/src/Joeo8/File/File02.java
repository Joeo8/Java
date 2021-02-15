package Joeo8.File;
   /*路径:
        *   绝对路径 （完整的路径）与 相对路径（相对于当前的简化目录）
        注 :
        * 1)路径不区分大小写
        * 2)路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个真实的反斜杠
        * */

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:19
 * Description: No Description
 */
public class File02 {
    public static void main(String[] args) {
        showPath();
    }

    public static void showPath() {
        //File 中的获取功能方法体验
        File file01 = new File("C:\\Java\\Other");
        String abPath = file01.getAbsolutePath();
        String file01Path = file01.getPath();
        String file01Name = file01.getName();
        System.out.println(abPath + "\t\t" + file01Path + "\t\t" + file01Name);
        File file02 = new File("a.text");
        String absolutePath = file02.getAbsolutePath();
        String file02Path = file02.getPath();
        String file02Name = file02.getName();
        System.out.println(absolutePath + "\t\t" + file02Path + "\t\t" + file02Name);
    }
}

/*
* Output:
*   C:\Java\Other		C:\Java\Other		Other
    C:\Users\Joeo8\Desktop\Java\Java_Code\a.text		a.text		a.text
* */