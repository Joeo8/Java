package Friday;
/*
    字符串分割：
        public String [] split(String regex):按照参数的规则，将字符串切分为若干部分
        注意事项：
            split方法的参数其实是一个‘正则表达式’，日后学习
            今天要注意，如果按照英文句点“.”切分，必须写“\\.”（两个反斜杠）
*/
public class Demo08StringSplit {
    public static void main(String[] args) {
        String s1 = "aaa,bbb,ccc";
        String [] list1 = s1.split(",");
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }
        System.out.println("======================");

        String s2 = "aaa bbb ccc";
        String[] list2 =s2.split(" ");
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
        System.out.println("=======================");

        String s3 = "XXX.YYY.ZZZ";
        String [] list3 = s3.split(".");
        System.out.println(list3.length);//0
        System.out.println("=======================");

//        如果split方法是一个正则表达式，遇到"."，必须写成"\\."
        String[] list4 = s3.split("\\.");
        System.out.println(list4.length);
        for (int i = 0; i < list4.length; i++) {
            System.out.println(list4[i]);
        }
        System.out.println("========================");
    }
}
