package by.dbobich.cycles;

import java.math.BigInteger;

public class Task4 {
	public static void main(String[] args) {
		int x = 1;
		BigInteger mult = BigInteger.valueOf(1);
		int y;
		while (x <= 200) {
			y = x * x;
			mult = mult.multiply(BigInteger.valueOf(y));
			x++;
		}
		System.out.println(mult);
	}
}
