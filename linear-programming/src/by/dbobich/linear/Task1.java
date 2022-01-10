package by.dbobich.linear;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter b");
		int b = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter c");
		int c = sc2.nextInt();
		double z = ((a - 3) * b / 2) + c;
		System.out.println("z=" + z);
	}
}
