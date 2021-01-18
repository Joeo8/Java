package Friday;
import java.util.ArrayList;
import java.util.Random;
//题目要求：生成6个1-33之间的随机数，添加到集合，并遍历集合
/*
        思路:
         1. 需要存储6个数字，创建一个集合<Integer>
         2. 产生随机数，用到 Random
         3. 用循环6次，生成6个随机数 : for 循环
         4. 循环内调用  r.nextInt(33)+1  --->  1~33
         5. 把数字添加到集合中：add
         6. 遍历集合 ： for 、 size 、 get
*/
public class Test1_Random_ArrayList {
    public static void main(String [] args){

        //创建 Random 对象
        Random random = new Random();
        //创建一个整数集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加随机数到集合
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }

        //输出集合
        System.out.println(list);
        //遍历集合输出
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
    }
}
