package Friday;

import java.util.ArrayList;

/*
        ArrayList练习三  打印集合方法

        定义以指定格式打印集合的方法（ArrayList作为参数），
        使用{}括起来，并使用@分隔每个元素。
        格式参照 ---  {元素@元素@元素}
*/
public class Test03_Method_ArrayList {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("樊林雅");
        list.add("张一帆");
        list.add("程晓旭");
        list.add("赵雯雅");
        System.out.println("初始格式为： ");
        System.out.println(list); //[樊林雅, 孙一凡, 程晓旭, 赵雯雅]
        //定义一个方法，转换输出的格式
        System.out.println("=========================");
        System.out.println("修改过的格式为 ： ");
        printArrayList(list);

    }
    public static  void printArrayList(ArrayList<String> list){
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() -1 ){
                System.out.print(name + " }");
            }else
            System.out.print(name + " @ ");
        }
    }
}
