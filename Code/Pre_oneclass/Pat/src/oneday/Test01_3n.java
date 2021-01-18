package oneday;
import java.util.Random;
import java.util.Scanner;
/*
     PAT：   1001 （3n+1）猜想
    给定一个数，如果是偶数，砍掉一半；如果是奇数，将（3n+1）砍掉一半
        计算一共需要砍几下才能到1
*/
/*public class Test01_3n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int num = sc.nextInt();
        int count = 0 ;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (3 * num + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}*/

//游戏版
    public class Test01_3n {
    public static void main(String[] args) {
        System.out.println("得到一个随机数： ");
        Random sc = new Random();
        int num = sc.nextInt();
        int count = 0 ;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (3 * num + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}