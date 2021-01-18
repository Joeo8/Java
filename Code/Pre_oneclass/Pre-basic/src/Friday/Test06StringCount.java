package Friday;

import java.util.Scanner;

/*
    题目：
        键盘录入一个字符串，并且统计其中各种字符出现的次数
        种类有：大写字符、小写字符、数字、其他
    思路:
        1.Scanner键盘录入
        2.定义四个变量记录四个种类字符的数量
        3.需要得到字符串中的每一个字符，toCharArray（）
        4.遍历char[] 数组，对每一个字符进行判断分类，相应变量++
        5.打印输出四个变量，代表不同四种种类的统计结果
*/
public class Test06StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next();
        //定义四个变量---->用于统计不同种类出现的次数
        int Upper = 0;
        int Lower = 0;
        int Number= 0;
        int Other = 0;
        //定义一个char[]数组接受字符串中的每一个字符
        char [] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//存储当前单个字符
            if('A'<=ch && ch <='Z'){
                Upper++;
            }else if ('a'<=ch && ch <='z'){
                Lower++;
            }else if ('0' <= ch && ch <='9' ){
                Number ++;
            }else{
                Other++;
            }
        }
        System.out.println("大写字符有："+Upper);
        System.out.println("小写字符有："+Lower);
        System.out.println("数字有   ："+Number);
        System.out.println("其他字符有："+Other);
    }
}
//代码的缺陷就是遇到空格就中断后续读取