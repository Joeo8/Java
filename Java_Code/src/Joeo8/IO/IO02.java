package Joeo8.IO;
//将数据写入文件执行过程中
//一切接字节
//在流中write的内容会被转换成二进制传送给文件,通过记事本或其他程序打开文件的同时,记事本会对照ASCII码表或其他码表,将内容转换

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 12:08
 * Description: No Description
 */
public class IO02 {
    public static void main(String[] args) throws IOException {
        //要求写入的文件中内容显示100 ==> 需要写三个字节 (多个wirte)
        FileOutputStream fos = new FileOutputStream("C:\\Java\\Other\\b.text");
        fos.write(49); //1
        fos.write(48); //0
        fos.write(48); //0

        //调用write方法依次写入多个字节
        //如果第一个字节是整数(0-127)会对应ASCII
        //如果第一个是负数,则会和后者组合转换成中文GBK输出
        byte[] by = {65, 66, 67, 68, 69};
        fos.write(by);
        byte[] byy = {-65, -66, -67, 68, 69};
        fos.write(byy);

        //写入String
        byte[] bytes = "你好".getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);
        fos.close();
    }
}
