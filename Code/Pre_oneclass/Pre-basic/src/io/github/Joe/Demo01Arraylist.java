package io.github.Joe;
//练习：遍历数组
public class Demo01Arraylist {
    public static void main(String[] args) {
        //静态初始化定义一个数组
        int [] array01 = new int[]{1,2,3,4,5,6,7,8,9,0};
        ArrayList(array01);
    }
    public static void ArrayList(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
}
