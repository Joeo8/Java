/*进行字符串的比较
        ==：
        数值类型：比较值是否相等
        引用类型：比较地址值是否相等
        eruql（）：
                比较内容是否相同
 */
package com.jolly;
public class StringCompare {
    public static void main(String[] args) {
        char [] chs = {'a','b','c'};
    String s1 =  new String(chs);
    String s2 = new String(chs);
    String s3 = "abc";
    String s4 = "abc";
//    比较字符串对象的地址值是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("------------");
//        比较字符串内容是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }

}
