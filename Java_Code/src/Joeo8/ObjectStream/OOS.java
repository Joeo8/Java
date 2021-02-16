package Joeo8.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 19:48
 * Description: No Description
 */
public class OOS {
    public static void main(String[] args)  throws IOException {
        //ObjectOutputStream 对象的序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Java\\Other\\obj.txt"));
        oos.writeObject(new Person("Joeo8",22));
        oos.close();
    }
}
