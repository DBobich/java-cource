package by.dbobich.cycles;

/*Даны два числа. Определить цифры, 
 * входящие в запись как одного так и другого числа* 
 */
public class Task8 {

	public static void main(String[] args) {

		int x = 137592;
		int y = 236597;
		int a = 11, b = 11, c = 11, d = 11, e = 11, f = 11, g = 11, h = 11, i = 11, j = 11;
		while (x > 0) {
			switch (x % 10) {
			case 0:
				a = x % 10;
				break;
			case 1:
				b = x % 10;
				break;
			case 2:
				c = x % 10;
				break;
			case 3:
				d = x % 10;
				break;
			case 4:
				e = x % 10;
				break;
			case 5:
				f = x % 10;
				break;
			case 6:
				g = x % 10;
				break;
			case 7:
				h = x % 10;
				break;
			case 8:
				i = x % 10;
				break;
			case 9:
				j = x % 10;
				break;
			default:
				System.out.println("Somesing went wrong");
			}
			x = (x - x % 10) / 10;
		}

		while (y > 0) {
			if (y % 10 == a || y % 10 == b || y % 10 == c || y % 10 == d || y % 10 == e || y % 10 == f || y % 10 == g
					|| y % 10 == h || y % 10 == i || y % 10 == j)
				System.out.println(y % 10);
			y = (y - y % 10) / 10;
			;
		}
	}
}
