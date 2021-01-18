/*
*   方法重载练习
*   需求：
*        使用方法重载的思想，设计比较两个整数是否相等的方法，兼容全部类型（byte、short、int、long）
*   思路：
*        1.定义比较两个数字是否相等的方法compare(),参数选择两个int型参数
*        2.定义对应的重载方法，变更相应的参数类型，参数更为两个long型参数
*        3.定义所有的参数方法，两个byte类型和两个short类型参数
*        4.完成方法的调用，测试运行结果
*/
public class methodTest01 {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare(10.0,10.00));
        System.out.println(compare(12,12));
        System.out.println(compare(1000000,1000000));

    }
    //定义四个类型的方法重载
    public  static  boolean compare(int a,int b ){
        return  a == b;
    }
    public  static  boolean compare(double a,double b ){
        return  a == b;
    }
    public  static  boolean compare(short a,short b ){
        return  a == b;
    }
    public  static  boolean compare(long a,long b ){
        return  a == b;
    }

}
