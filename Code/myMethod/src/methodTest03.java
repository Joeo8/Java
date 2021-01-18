//调用方法遍历数组输出最值
public class methodTest03 {
    public static void main(String[] args) {
        int[] arr = {12,56,94,45,35,89};
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        System.out.println("数组1中的最值为：");
        getM(arr);
        System.out.println("数组2中的最值为：");
        getM(arr2);
       /* int number = getM(arr);
        System.out.println(number);*/
    }
    public  static  void getM(int [] arr){
        int max = arr[0];
        int min = arr[0];
         for(int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr [i];
            }
        }
//         return max;

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
