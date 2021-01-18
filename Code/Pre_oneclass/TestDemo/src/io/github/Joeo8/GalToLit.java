package io.github.Joeo8;
//写一个单位转换程序，从英寸到米 （1米约等于39.37英寸）
//要求转换12英尺（一英尺==12英寸），每12英寸输出一个空行
public class GalToLit {
    public static void main(String[] args) {
        Exchange();
    }
    public static  void Exchange(){
        for (double in = 1; in <= 12*12 ;++in) {
            double me = in / 39.37;
             System.out.println(in+"  inch is vaule of  "+me+"  meter");
             if (in % 12 == 0){
                 System.out.println();
                 System.out.println(in);
                 System.out.println();
             }
        }

    }
}
