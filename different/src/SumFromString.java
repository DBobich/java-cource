import java.util.Scanner;
public class SumFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine(); 
		System.out.println(sumFromString(s));;
		}
	public static int sumFromString(String s) {
		int sum = 0;
		for(int i = 0 ;i<s.length();i++){
			if (Character.isDigit(s.charAt(i))){
					sum = sum + Character.getNumericValue(s.charAt(i));
			}
		}
		return sum;
	}
}

