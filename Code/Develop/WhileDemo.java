public class WhileDemo{
	public static void main(String[] args){
		double paper = 0.1;
		int zf = 8844430;
		int  count = 0;
		while (paper <= zf){
			paper *= 2;
			count ++;
		}
		
	System.out.println("经计算，将一张厚度为0.1毫米的纸折叠 "+ count +"次，就可以达到珠峰的高度");
	}
	
}