/*
  定义一个方法，用数组遍历通用格式对数组进行遍历
    两个明确：
        返回值类型： void
        参数 ： int [] arr
*/
public class methodTest02 {
    public static void main(String[] args) {
        int [] arr = { 11 , 22 , 33 , 44 , 55};
        ArraryList(arr);
    }
    public  static  void ArraryList(int [] arr){
        System.out.print("[");
        for(int x = 0; x < arr.length ; x++ ){
            if(x == arr.length-1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x] + " , ");
            }
        }
        System.out.print("]");
    }

}
