public class methodDemo02 {
    public static void main(String[] args) {
        boolean flag = isEvenNmber(10);
        System.out.println(flag);
    }
    public  static  boolean isEvenNmber(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return  false;
        }
    }
}
