/*
	求偶书和
	需求：
		求1-100之间的偶数和，并把求和的结果在控制台输出
*/
public class ForText{
	public static void main(String[]  args){
		int sum  =  0;
		for(int i = 1 ; i <= 100 ; i++){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("百以内偶数和为： " + sum );
	}
	
	
}