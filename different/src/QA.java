public class QA {
	public static void main(String[] args){
	System.out.println(sum(sum(1,2),sum (3,sum(4,5))));	
	}
	public static int sum(int x,int y){
		System.out.println(x+"+"+y+"="+(x+y));
		return x + y;
		}
}
