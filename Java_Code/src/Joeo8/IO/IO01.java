package Joeo8.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//FileOutputStream文件字节输出流 ==> 将内存中的数据写入到硬盘的文件中
//写入数据的原理:
//java程序==>JVM==>OS==>OS调用写数据的方法(Write)==>将数据写入到文件中
//字节输出流的使用步骤
//1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
//2.调用FileOutputStream中的write方法,将数据写入到文件中
//3.释放资源(流会占用一定的内存,使用完毕应将内存清空,提高程序的性能)

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 11:38
 * Description: No Description
 */
public class IO01 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\Other\\a.text");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(666);
        fos.close();
    }
}
