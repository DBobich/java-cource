package by.dbobich.branching;

/* Does the points A(x1,y1); B(x2,y2); C(x3,y3)
 * lying on the same line?  
 */
public class Task3 {

	public static void main(String[] args) {
		int x_a = -3;
		int x_b = -6;
		int x_c = 2;
		int y_a = -2;
		int y_b = -5;
		int y_c = 3;
		if ((x_b - x_a) / (y_b - y_a) == (x_c - x_a) / (y_c - y_a)) {
			System.out.println("Points are on the same line");
			}
		else {
			System.out.println("Points are NOT on the same line");
			}
	}
}
