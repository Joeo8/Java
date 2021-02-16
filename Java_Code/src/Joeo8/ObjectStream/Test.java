package Joeo8.ObjectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 20:10
 * Description: No Description
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化流保存对象集合
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",21));
        list.add(new Person("王五",20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Java\\Other\\objs.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Java\\Other\\objs.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        Iterator iterator = list2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ois.close();
        oos.close();
    }
}
