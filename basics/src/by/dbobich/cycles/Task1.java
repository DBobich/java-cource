package by.dbobich.cycles;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		System.out.println("enter integer");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			String st = sc.nextLine();
			System.out.println("Not integer, please reenter");
		}
		int x = sc.nextInt();
		int sum = 0;
		int y = 1;
		while (y<x){
			sum += y;
			y++;
		}
		System.out.println("sum = "+sum);
	}
	
}
