package Friday;
/*
    题目：
        定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。
        格式参考：[word1#word2#word3]
    分析：
        1.首先准备一个int[]数组，内容是1，2，3
        2.定义一个方法，用来将数组变成字符串
        三要素：
           返回值类型：String
           方法名称：formArrayToString
           参数列表：int[]
         3.格式：[word1#word2#word3]
         用到：for循环、字符串拼接、每个数组元素之间都有一个word字样、分割使用的是#、区分是否为最后一个
         4.调用方法,得到返回值，打印并输出字符串
*/
public class Test05StringPractise {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        String s = formArrayToString(array);
        System.out.println(s);
    }
    public static  String formArrayToString(int [] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                str += "word"+arr[i]+"]";
            }else{
                str += "word"+arr[i]+"#";
            }


        }
         return str;
    }
}
