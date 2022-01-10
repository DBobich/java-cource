package by.dbobich.linear;

public class Task6 {
	public static void main(String[] args) {
		double x = 1;
		double y = -7;
		if (x == 0 & y == -1) {
			System.out.println("false");
		} else {
			if ((-2 < x & x < 2) & (0 < y & y < 4)) {
				System.out.println("true");
			} else {
				if ((-4 < x & x < 4) & (-3 < y & y < 0)) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			}
		}

	}
}
