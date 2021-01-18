public class methodTest {
    public static void main(String[] args) {
    //调用方法并输出
       /* int result = getMax(10,20);
        System.out.println(result);*/
        System.out.println(getMax(10,20));
    }
    //定义一个方法比较得出两个数中的较大值
    public  static int getMax(int a, int b){
        if(a > b){
            return a;
        }else{
            return  b ;
        }
    }
}
