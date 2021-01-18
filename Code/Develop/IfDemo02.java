import java.util.Scanner;

public class IfDemo02{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的考试分数：");
		int score = sc.nextInt();
		
		//数据测试：正确数据、边界数据、错误数据
		
		if(score > 100 || score < 0){
			System.out.println("你输入的分数有误!");
		}else if(score>=95){
			System.out.println("恭喜你！获得山地自行车作为奖励！");		
		}else if(score >= 90 && score <=94){
			System.out.println("恭喜你！游乐场游玩作为奖励！");
		}else if(score >= 80 && score <= 89){
			System.out.println("恭喜你！变形金刚作为奖励！");
		}else{
			System.out.println("准备回家胖揍");
		}
		
	}
	
}