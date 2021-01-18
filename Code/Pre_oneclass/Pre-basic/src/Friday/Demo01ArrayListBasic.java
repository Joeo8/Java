package Friday;

import java.util.ArrayList;

public class Demo01ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();//创建一个字符串集合
       // ArrayList<int> listB = new ArrayList<int>();//想要创建一个整数集合。Err
        //写法错误！泛型只能是引用类型，不能基本数据类型

        ArrayList<Integer>  listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
//        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第一号元素是: " + num);

    }
}
