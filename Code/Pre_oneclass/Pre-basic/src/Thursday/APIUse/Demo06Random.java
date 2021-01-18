package Thursday.APIUse;

import java.util.Random;
/*
    Random用来生成随机数字。使用起来三个步骤:
    1.导包：import java.util.Random
    2.创建：Random r = new Random()
    3.使用：
      int num = r.netxInt();   括号内留空表示获取一个随机的int数字（范围是int）
      int num1 = r.nextInt(10);  括号内的数表示范围（类似数组）实际范围是0~9
*/
//使用Random生成随机数
public class Demo06Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("产生的随机数是：" + num);
    }
}
