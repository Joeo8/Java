package Friday;
 /*
    String 中与获取有关的方法如下：
        public  int length():获取字符串的长度
        public String concat(String str):拼接字符串
        public char charAt(int index):获取指定位置的单个字符
        public int indexOf(String str):获取参数字符串在本字符串首次出现的索引位置，如果没有返回-1
    */
public class Demo05StringGet {
  public static void main(String[] args) {
     //获取字符串的长度
   int length = "dajwgdagdawudha".length();
   System.out.println(length);
   //拼接字符串
   String s1 = "Hello";
   String s2 = "World";
   String s3 = s1.concat(s2);
   System.out.println(s3);
   //获取指定位置的单个字符
   char ch = "Hello".charAt(1);
   System.out.println("索引位置为1的字符是 "  + ch);
   //查找目标字符在字符串中的首次出现位置
   String orginal = "HelloWorld";
   int llo = orginal.indexOf("llo");
   System.out.println("llo在字符串中的位置为："+llo);

  }
}
