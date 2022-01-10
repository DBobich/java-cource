package by.dbobich.linear;

public class Task3 {
	public static void main(String[] args) {
	double x = 3;
	double y = 4;
	double a = Math.sin(x);
	double b = Math.cos(y);
	double c = Math.cos(x);
	double d = Math.sin(y);
	double e = Math.tan(x*y);
	double f = (a+b)/(c+d)*e;
	System.out.println(f);		
	}
}
