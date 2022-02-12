package by.dbobich.cycles;

public class Task2 {

	public static void main(String[] args) {
		double a = 10;
		double b = -2;
		double h = 2;
		double x;
		double y;

		if (a < b) {
			x = a;
		} else {
			x = b;
		}

		while ((x >= a && x <= b) || (x <= a && x >= b)) {
			if (x>2) {
				y = x;
			}else {
				y = -x;
			}
			System.out.println(y);
			x += h;
		}
	}

}
