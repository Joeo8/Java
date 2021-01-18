package Friday;
/*
    == 对于引用类型是进行地址值的比价。如果确实需要用到内容的比较，可以使用两个方法
    public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true。否则false
    注意事项：
    1.任何对象都可以用Object进行接受
    2.equals方法具有对称性，也就是说a.equals(b)和 b.equals(a)效果一样
    3.如果比较双方一个常量一个变量，那么推荐把常量写在前
    推荐："abc".equals(a)  不推荐：a.equals("abc")
    防止空指针错误异常

    public boolean equalsIgnoreCase(String str):忽略大小写，进行内容粗略比较
*/
public class Demo04StringEquals {
    public static void main(String[] args) {
        String st1 = "hello";
        String st2 = "hello";

        char [] charArray = {'h','e','l','l','o'};
        String st3 = new String(charArray);

        System.out.println(st1.equals(st2)); //true
        System.out.println(st2.equals(st3)); //true
        System.out.println(st1.equals("hello"));//true
        System.out.println("hello".equals(st1));//true
        System.out.println("Hello".equals(st3));//false

        System.out.println("HELLO".equalsIgnoreCase(st3));//true

        String st5 = null;
        System.out.println("abc".equals(st5)); //false
        System.out.println(st5.equals("abc"));//Error 空指针异常
    }
}
