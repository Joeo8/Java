package Saturday;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组有关的工具类，里面提供了大量的静态方法，用来实现数组常见操作
puplic static String toString(数组)：将参数数组变成字符串（按照默认格式[元素1，元素2，元素3····· ]）
public  static void sort(数组):按照默认升序（从小到大），对数组的元素进行排序

注意事项：
1. 如果是数值，sort默认按照升序从小到大
2. 如果是字符串，sort默认按照字母升序
3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持（今后学习）
*/
public class Demo05Arrays {
    public static void main(String[] args) {
        int [] array = {10,20,30};
        //将int[]数组按照默认格式变成字符串
        String inSt = Arrays.toString(array);
        System.out.println(inSt);  // [10, 20, 30]

        //调用排序方法，对数组进行排序
        int [] array1 = {2,5,1,57,43,6,8,71,19,10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
      //  [1, 2, 5, 6, 8, 10, 19, 43, 57, 71]

        // 对于字符串，sort方法默认按照字符的字母顺序进行升序
        String [] array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); //[aaa, bbb, ccc]
    }
}
