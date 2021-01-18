package Thursday.APIUse;
import java.util.Random;
import java.util.Scanner;
/*
    写一个猜数字小游戏
    用到Scanner 和 Random
    倘若猜大或猜小了，请重试；若猜对则退出游戏
*/
public class Demo07Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random() ;
        int number = r.nextInt(100)+1;
        while(true){
            System.out.println("请输入一个整数（1~100）：");
            int gusses = sc.nextInt();
            if (gusses>number){
                System.out.println("您猜大了，请重试！");
            }else if(gusses < number){
                System.out.println("您猜小了，请重试！");
            }else{
                System.out.println("恭喜你！猜中了！");
                break;//猜中后，结束游戏

            }
        }
         System.out.println("游戏结束！");
    }
}
