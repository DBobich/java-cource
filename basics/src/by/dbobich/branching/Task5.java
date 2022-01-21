package by.dbobich.branching;
import java.util.Scanner;
public class Task5 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		while (!sc.hasNextDouble()) {
			String str = sc.nextLine();
			System.out.println("Wrong x, please reenter");
		}
		double x = sc.nextDouble();
		double y;
		if (x<=3) {
		y =	x*x-3*x+9;	
		}
		else {
		y = 1/(Math.pow(x,3)+6);
		}
		System.out.println("F(x)=" + y);
	}
		
	
}
