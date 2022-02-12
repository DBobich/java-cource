package by.dbobich.cycles;

public class Task3 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		int y;
		while (x <= 100) {
			y = x * x;
			sum += y;
			x++;
		}
		System.out.println(sum);
	}
}
