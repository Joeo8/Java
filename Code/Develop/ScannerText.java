/*

��������������
	������ 1.���δ֪�����ü���¼�뷽ʽ�����ȵ�����Ȼ�󴴽�����
			$ import java.util.Scanner;
			$ Scanner sc = new Scanner(System.in);
		   2.����¼��������߷ֱ�ֵ������������
			$ int height1 = sc.nextInt();
			$ int height2 = sc.nextInt();
			$ int height3 = sc.nextInt();
		   3.����Ԫ�������ȡ�������еĽϸ����ֵ��������ʱ��߱�������������
			$ (height1 > height2 )? height1 : height2 ;
		   4.����Ԫ�������ȡ��ʱ���ֵ�͵�����������߽ϸ�ֵ������������ֵ�������档
			$ (tempHeight > height3 )? tempHeight ��height3;
		   5.��������

*/

import java.util.Scanner;

public class ScannerText{
	public static void main(String[ ] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ�����е���ߣ� ");
		int height1 = sc.nextInt();
		
		System.out.print("������ڶ������е���ߣ� ");
		int height2 = sc.nextInt();
		
		System.out.print("��������������е���ߣ� ");
		int height3 = sc.nextInt();
		
		int tempHeight = height1 > height2 ? height1 : height2;
		int maxHeigtht = tempHeight > height3 ? tempHeight : height3;

		System.out.println("maxHeigtht:  " + maxHeigtht );
	}
  

}