import java.util.Scanner;
public class SwitchDemo02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뵱ǰ�·ݣ� ");
		int month = sc.nextInt();
		/*
			ע�������Switch����У����case���Ƶ������治дbreak�������ִ�͸�����ڲ��ж���һ��caseֵ������£�
					�������У�ֱ������break���������switch��������
		
		*/
		switch(month){
			case 1:
			case 2:
			case 12:
				System.out.println("�������ڶ���");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("�������ڴ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("���������ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("���������＾");
				break;
				
			default :System.out.println("��������·�����");
		}
		
	}
	
}