public class ForText0101{
	public static void main(String[] args){
		/*
			�������ˮ�ɻ��ı�ȻҪ�õ�ѭ�����������е���λ������λ����100��ʼ����999����
		*/
		
		int count = 0;
		for(int i = 100 ; i < 1000 ; i++ ){
			//�ڽ��м���֮ǰ�ֱ��ȡ��λ����ÿ��λ�ϵ���
			int ge  = i % 10 ;
			int shi = i /10 % 10;
			int bai = i /100 % 10;
			//����ˮ�ɻ��������ÿ��λ�ϵ����������ͣ��ж��Ƿ���������
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				count ++ ;
				//System.out.println(i);
			}
		}
		System.out.println("ˮ�ɻ��ĸ����У�" + count + "��");
	}
	
}