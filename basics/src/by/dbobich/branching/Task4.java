package by.dbobich.branching;

import java.util.Scanner;
/*Заданы размеры A и B прямоугольного отверстия и размеры x,y,z кирпича. 
 * Определть, пройдет ли кирпич через отверстие*/

public class Task4 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A size");
		while (sc.hasNextDouble() == false) {
			sc.nextLine();
			System.out.println("Wrong size. Enter A size");
		}
		double a = sc.nextDouble();

		System.out.println("Enter B size");
		while (sc.hasNextDouble() == false) {
			sc.nextLine();
			System.out.println("Wrong size. Enter B size");
		}
		double b = sc.nextDouble();

		System.out.println("Enter x size");

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Wrong size. Enter x size");
		}
		double x = sc.nextDouble();

		System.out.println("Enter y size");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Wrong size. Enter x size");
		}
		double y = sc.nextDouble();

		System.out.println("Enter z size");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Wrong size. Enter x size");
		}
		double z = sc.nextDouble();

		double first_minimal;
		double second_minimal;
		if (x < y || x < z) {
			first_minimal = x;
			if (y < z) {
				second_minimal = y;
			} else {
				second_minimal = z;
			}
		}

		else {
			first_minimal = y;
			second_minimal = z;
		}

		if ((a > first_minimal) && (b > second_minimal)) {
			System.out.println("OK");
		} else if ((b > first_minimal) && (a > second_minimal)) {
			System.out.println("OK");
		} else {
			System.out.println("Can't");
		}
	}
}
