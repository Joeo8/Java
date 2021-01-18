package Thursday.APIUse;

import java.util.ArrayList;

/*
    数组的长度不可以改变 ，但是ArrayList集合的长度是可以随意改变的
    对于ArrayList来说，有一个尖括号<E>代表泛型。
    泛型：也就是装在集合中的所有元素，全部都是统一的什么类型
    注意：泛型只能是引用类型，不能是基本数据类型

    注意事项：
    对于ArrayList来说，直接打印得到的不是地址，而是内容
    如果内容为空，得到的是空的中括号 : []
 */
public class Demo09ArrayList {
    public static void main(String [] args){
        //创建了一个ArrayList集合，集合的名称是list，里面装的全部都是String字符串类型的数据
        //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>尖括号本身是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        System.out.println(list);
     //   list.add(100); //Err!因为创建的时候尖括号里标注String类型，填进去的元素就必须是字符串才行
    }
}
