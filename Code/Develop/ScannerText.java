/*

案例：三个和尚
	分析： 1.身高未知，采用键盘录入方式。首先导包，然后创建对象
			$ import java.util.Scanner;
			$ Scanner sc = new Scanner(System.in);
		   2.键盘录入三个身高分别赋值给三个变量。
			$ int height1 = sc.nextInt();
			$ int height2 = sc.nextInt();
			$ int height3 = sc.nextInt();
		   3.用三元运算符获取两个和尚的较高身高值，并用临时身高变量保存起来。
			$ (height1 > height2 )? height1 : height2 ;
		   4.用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高值变量保存。
			$ (tempHeight > height3 )? tempHeight ：height3;
		   5.输出结果。

*/

import java.util.Scanner;

public class ScannerText{
	public static void main(String[ ] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入第一个和尚的身高： ");
		int height1 = sc.nextInt();
		
		System.out.print("请输入第二个和尚的身高： ");
		int height2 = sc.nextInt();
		
		System.out.print("请输入第三个和尚的身高： ");
		int height3 = sc.nextInt();
		
		int tempHeight = height1 > height2 ? height1 : height2;
		int maxHeigtht = tempHeight > height3 ? tempHeight : height3;

		System.out.println("maxHeigtht:  " + maxHeigtht );
	}
  

}