package Friday;
//字符串的构造方法和直接创建
public class Demo02String {
    public static void main(String [] args){
        //1.使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串里有： " + str1);
        //2.根据字符数组创建字符串
        char [] charArray = new char[]{'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串里有 : "+ str2);
        //3.根据字节数组创建字符串
        byte [] byteArray = new byte[]{97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串里有 : " + str3);
        //直接写上一个双引号，就是字符串对象
        String str4 = "Hello";
        System.out.println("第四个字符串里有 : "+str4);
    }
}
