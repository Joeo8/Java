import java.util.Scanner;
public class SwitchDemo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("������һ��������1-7��");
	int week = sc.nextInt();
	switch(week) {
		case 1 : 
			System.out.println("��������һ��");
			break;
		case 2 : 
			System.out.println("�������ܶ���");
			break;
		case 3 : 
			System.out.println("������������");
			break;
		case 4 : 
			System.out.println("���������ģ�");
			break;
		case 5 : 
			System.out.println("���������壡");
			break;
		case 6 : 
			System.out.println("������������");
			break;
		case 7 : 
			System.out.println("���������գ�");
			break;
		default : 
			System.out.println("�����������������");
			break;
	}
	System.out.println("����");	
}
}