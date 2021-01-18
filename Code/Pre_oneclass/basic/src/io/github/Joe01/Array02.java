package io.github.Joe01;
public class Array02 {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int [] ArrayA = {10,20,30};

        //静态初始化的标准格式，可以写成两个步骤
        int [] ArrayB;
        ArrayB  = new int[]{10,20,30};

        //动态初始化也可以分成两个步骤
        int [] ArrayC;
        ArrayC = new int [3];

       /* //静态初始化的省略格式，不能拆分为两个步骤
        int [] ArrayD;
        ArrayD = {10,20,30};   //报错*/
    }
}
