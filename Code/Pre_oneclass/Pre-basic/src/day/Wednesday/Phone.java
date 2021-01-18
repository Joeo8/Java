package day.Wednesday;
/*
        定义一个手机类，用来模拟“手机”事物
        属性：品牌、价格、颜色
        行为：打电话、发短信

        对应到类中
        成员变量（属性）：
            String brand; //品牌
            double price; //价格
            String color; //价格
        成员方法（行为）：
            public void call(String who){}//打电话
            public void sendmeeage(){} //发短信
*/
public class Phone {
    //定义成员变量（属性）
    String brand;   //品牌
    double price;   //价格
    String color;   //颜色
    //成员方法 （行为）
    public void call(String who){
        System.out.println("给 "+who+" 打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
