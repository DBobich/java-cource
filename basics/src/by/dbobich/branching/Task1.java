package by.dbobich.branching;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the degrees of the first angle ");
		double angle_1 = sc1.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the degrees of the second angle ");
		double angle_2 = sc2.nextDouble();
		double angle_sum = angle_1 + angle_2;
		if (angle_sum <= 180) {
			System.out.println("Such triangle could exit");
			if (angle_sum == 90) {
				System.out.println("It could be rectangular");
			} else {
				System.out.println("It could NOT be rectangular");
			}
		} else {
			System.out.println("Such triangle could not exit");
		}
		sc1.close();
		sc2.close();
	}
}