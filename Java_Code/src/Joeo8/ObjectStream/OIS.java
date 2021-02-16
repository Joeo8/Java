package Joeo8.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Date: 2021/2/16
 * Time: 19:54
 * Description: No Description
 */
public class OIS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream 对象的反序列流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Java\\Other\\obj.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
