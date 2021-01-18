import java.util.Scanner;
public class SwitchDemo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("请输入一个星期数1-7：");
	int week = sc.nextInt();
	switch(week) {
		case 1 : 
			System.out.println("今天是周一！");
			break;
		case 2 : 
			System.out.println("今天是周二！");
			break;
		case 3 : 
			System.out.println("今天是周三！");
			break;
		case 4 : 
			System.out.println("今天是周四！");
			break;
		case 5 : 
			System.out.println("今天是周五！");
			break;
		case 6 : 
			System.out.println("今天是周六！");
			break;
		case 7 : 
			System.out.println("今天是周日！");
			break;
		default : 
			System.out.println("你输入的星期数有误！");
			break;
	}
	System.out.println("结束");	
}
}