package by.dbobich.cycles;

/* Даны числовой ряд и некоторое число е. 
 * найти сумму тех членов ряда, модуль которых >= e.
 * Общий член ряда .
 */
public class Task5 {

	public static void main(String[] args) {
		double e = 0.03;
		double sum = 0;
		for (int n = 1; n < 10; n++) {
			double a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (a >= e) {
				sum += a;
			}
			System.out.println("+"+a+"="+sum);
		}

	}

}
