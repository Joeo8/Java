package Friday;
/*
    String 当中与转换相关的常用方法
        public char [] toCharArray():将当前字符串拆分为字符数组返回
        public byte [] getBytes():获取当前字符串数组的底层字节数组
        public String replace(CharSeqwuence oldString,CharSequence newString):
        自定义用新的字符取代字符串中指定的老字符
        注意事项：CharSequence意思就是接受字符串类型
*/
public class Demo07StringConvert {
    public static void main(String[] args) {
        //转化成字符数组
        char [] chars = "Hello".toCharArray();
        //遍历输出字符数组内容
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("==========================");
        //转换成字节数组
        byte [] bytes = "abc".getBytes();
        //遍历输出字节数组
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===========================");
        //运用字符替代
        String s1 = "How do you do";
        String s2 = s1.replace("o","*");
        System.out.println(s1);
        System.out.println(s2);
    }
}
