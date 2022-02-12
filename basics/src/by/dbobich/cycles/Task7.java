package by.dbobich.cycles;

/*Для каждого натурального числа в промежутке от n до m
 * вывести все делители кроме 1 и самого числа. 
 * m и n вводятся с клавиатуры
 */
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n");
		while (!sc.hasNextInt()) {
			String st = sc.nextLine();
			System.out.println("Wrong n, please reenter");
		}
		int n = sc.nextInt();
		
			System.out.println("Enter m");
		while (!sc.hasNextInt()) {
			String st = sc.nextLine();
			System.out.println("Wrong m, please reenter");
		}
		int m = sc.nextInt();
		int div;
		int i = n;
		while (i <= m) {
			int x = 2;
			while (x < m) {
				if (i % x == 0 && x!=i) {
				div = x;
				System.out.println(i+"divider="+div);
				}
			x++;		
			}
		i++;
	}	
}

}
