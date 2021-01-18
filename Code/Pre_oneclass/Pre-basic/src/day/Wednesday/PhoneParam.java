package day.Wednesday;
//对象作为方法的一个参数
public class PhoneParam {
    public static void main(String[] args) {
         Phone one = new Phone();
         one.brand = "苹果";
         one.price = 8388;
         one.color = "土豪金";
         method(one);
    }
    //Phone对象作为method的一个参数
    public static void method(Phone param){
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }

}
