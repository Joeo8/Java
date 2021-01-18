import java.util.Scanner;
public class SwitchDemo02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入当前月份： ");
		int month = sc.nextInt();
		/*
			注意事项：在Switch语句中，如果case控制的语句后面不写break，将出现穿透现象：在不判断下一个case值的情况下，
					向下运行，直到遇到break，或者这个switch语句体结束
		
		*/
		switch(month){
			case 1:
			case 2:
			case 12:
				System.out.println("您正处于冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("您正处于春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("您正处于夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("您正处于秋季");
				break;
				
			default :System.out.println("你输入的月份有误！");
		}
		
	}
	
}