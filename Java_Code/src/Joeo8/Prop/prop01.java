package Joeo8.Prop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
//Properties集合配合IO使用
//load读取硬盘中的数据到集合中
//store将集合中的临时数据持久写入硬盘中存储

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 17:59
 * Description: No Description
 */
public class prop01 {
    public static void main(String[] args) throws IOException {

//        show01();
//        show02();
    show03();
    }

    private static void show03() throws IOException {
        //load读取数据
        Properties prop = new Properties();
        prop.load(new FileReader("C:\\Java\\Other\\prop.txt"));

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "-->" + value);
        }
    }

    private static void show02() throws IOException {
        //store 存储数据
        Properties prop = new Properties();
        prop.setProperty("Jolly", "181");
        prop.setProperty("Joeo8", "182");
        prop.setProperty("Pablo Jolly", "183");

        FileWriter fw = new FileWriter("C:\\Java\\Other\\prop.txt");

        prop.store(fw, "save date");
        fw.close();

    }


    public static void show01() {
        //Properties的基础使用
        Properties prop = new Properties();
        prop.setProperty("Jolly", "181");
        prop.setProperty("Joeo8", "182");
        prop.setProperty("Pablo Jolly", "183");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "-->" + value);
        }
    }
}
