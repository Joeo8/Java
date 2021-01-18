package Friday;
/*
    字符串常量池：程序中直接写上的双引号字符串，就在字符串常量池中
    对于基本数据类型： ==  表示进行数值的比较
    对于引用数据类型： == 表示进行【地址值】的比较
*/
public class Demo03StringPool {
    public static void main(String [] args ){
        String s1 = "abc";
        String s2 = "abc";

        char [] charArray = {'a','b','c'};
        String s3 = new String(charArray);

        System.out.println(s1 == s2); //true
        System.out.println(s2 == s3); //false
        System.out.println(s1 == s3); //false
        // s1  和  s2 均在堆的常量池中，地址值相同 。而s3在堆中new出（不再池当中）
    }
}
