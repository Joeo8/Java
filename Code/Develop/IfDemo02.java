import java.util.Scanner;

public class IfDemo02{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ŀ��Է�����");
		int score = sc.nextInt();
		
		//���ݲ��ԣ���ȷ���ݡ��߽����ݡ���������
		
		if(score > 100 || score < 0){
			System.out.println("������ķ�������!");
		}else if(score>=95){
			System.out.println("��ϲ�㣡���ɽ�����г���Ϊ������");		
		}else if(score >= 90 && score <=94){
			System.out.println("��ϲ�㣡���ֳ�������Ϊ������");
		}else if(score >= 80 && score <= 89){
			System.out.println("��ϲ�㣡���ν����Ϊ������");
		}else{
			System.out.println("׼���ؼ�����");
		}
		
	}
	
}