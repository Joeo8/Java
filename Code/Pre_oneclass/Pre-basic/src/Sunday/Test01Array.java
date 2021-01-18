package Sunday;
import java.util.Arrays;
//题目:
//请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒叙输出
public class Test01Array {
    public static void main(String[] args) {
        String str = "dakwdgadalkwhdqaw93712";
        //如何使用升序排列  --->  sort
        //必须是一个数组，才能用Arrays.sort方法
        //String -->  数组， toCharArray

        char[] chars = str.toCharArray();
        Arrays.sort(chars); //对数组进行升序排列

        //需要倒序遍历数组
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(" "+chars[i]+" ");
        }
    }
}
