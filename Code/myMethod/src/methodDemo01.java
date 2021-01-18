public class methodDemo01 {
    public static void main(String[] args) {
    //调用带参方法并带参
        //常量值的调用
        isEvenNumber(10);
        //变量值的调用
        int number  = 11 ;
        isEvenNumber(number);
    }
    //定义一个带参方法，判断给定的数值是否为欧式
    public static  void  isEvenNumber( int number ){

        if (number % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
