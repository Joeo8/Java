public class ForText0101{
	public static void main(String[] args){
		/*
			输出所有水仙花的必然要用到循环，遍历所有的三位数，三位数从100开始，到999结束
		*/
		
		int count = 0;
		for(int i = 100 ; i < 1000 ; i++ ){
			//在进行计算之前分别获取三位数中每个位上的数
			int ge  = i % 10 ;
			int shi = i /10 % 10;
			int bai = i /100 % 10;
			//根据水仙花规则，求出每个位上的数的立方和，判断是否满足条件
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				count ++ ;
				//System.out.println(i);
			}
		}
		System.out.println("水仙花的个数有：" + count + "个");
	}
	
}