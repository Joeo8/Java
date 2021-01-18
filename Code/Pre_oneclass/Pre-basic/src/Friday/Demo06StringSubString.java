package Friday;
/*
    字符串的截取：
     public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
    public String substring(int begin ,int end):截取指定位置的新字符串
    注意事项：
        [begin，end)，左闭右开
*/
public class Demo06StringSubString {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = s1.substring(5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("=====================");

        String s3 = s1.substring(4,7);
        System.out.println(s3);
    }
}
