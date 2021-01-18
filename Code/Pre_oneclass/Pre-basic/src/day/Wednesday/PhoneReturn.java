package day.Wednesday;
//对象作为方法的返回值
public class PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }
    public  static  Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 7368;
        one.color = "玫瑰金";

        return one;
    }
}
