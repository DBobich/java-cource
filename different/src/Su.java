
public class Su {
	
	public static void main(String[] args) {
		String s = "1klmn489pjro635op5";
		;
		System.out.println(sumFromString(s));
		}
	public static int sumFromString(String s){
			int sum = 0;
	        for(int i = 0; i < s.length() ; i++){
	            if( Character.isDigit(s.charAt(i)) ){
	                sum = sum + Character.getNumericValue(s.charAt(i));
	            }
	        }
	        return sum;
	    } 
	
}