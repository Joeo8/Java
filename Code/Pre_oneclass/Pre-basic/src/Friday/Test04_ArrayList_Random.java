package Friday;
import java.util.ArrayList;
import java.util.Random;
/*
    题目：筛选集合中的随机数
    用一个大集合，存放20个随机数字，然后筛选其中的偶数元素，放在小集合中。要求使用自定义的方法实现筛选
 分析：
    1.需要创建一个大集合存放20个随机数 <Integer>
    2.随机数字用的就是Random nextInt
    3.循环20次，把随机数放入大集合：for循环，add方法
    4.定义一个方法，用于筛选

    筛选：根据大集合，筛选符合条件的元素，得到小集合
    三元素：
    返回值类型：ArrayList小集合（里面的元素不确定）
    方法名称：getSmallArrayList
    参数列表：ArrayList大集合（装20个随机数字）
    5.判断（if）是偶数：num % 2 == 0
    6.如果是偶数就放到小集合中，否则不放

*/
public class Test04_ArrayList_Random {
    public static void main(String[] args) {
        ArrayList<Integer> Biglist = new ArrayList<>();//创建大集合
        Random random = new Random(); //引入随机数

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(10)+1;//接受随机数，并无范围要求
            Biglist.add(num);//依次存放20个随机数
        }

        System.out.println("大集合中的随机数： ");
        System.out.println(Biglist);//检查收到的随机数
        System.out.println("====================================");
        ArrayList tosmall = Tosmall(Biglist);
        System.out.println("偶数小集合有"+tosmall.size()+"个 ：");
        System.out.println(tosmall);

    }
        //自定义一个方法，用于筛选
        //此方法中，接受大集合参数，返回小集合结果
        public static ArrayList Tosmall(ArrayList<Integer> list){
            ArrayList<Integer> Smalllist = new ArrayList<>();//创建一个小集合，接受大集合中的偶数元素
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0){
                    Smalllist.add(list.get(i));//把大集合中的偶数赋值给小集合
                }
            }
            return Smalllist; //返回小集合
        }

}
