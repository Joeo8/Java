/*
    StringBuilding；添加和反转方法
        public StringBuilder append(任意类型) :添加数据，并返回对象本身
        public StringBuilder reversal();返回相应的字符序列
*/
package com.jolly;
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb =new StringBuilder();
//        StringBuilder sb2 = sb.append("hello");

        sb.append("Hello ");
        sb.append("World ");
        sb.append("Java");
        System.out.println(sb);
//        链式编程
    /*    sb.append("hello").append("java").append(99);
        System.out.println(sb);*/

        sb.reverse();
        System.out.println("bs : "+ sb);

    }
}
