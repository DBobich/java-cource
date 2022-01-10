package by.dbobich.branching;

//Find max {min(a,b)(min c,d)} instead of math.min + math.max?

public class FindMax {
	static double a = 5;
	static double b = 6;
	static double c = 3;
	static double d = 4;
	static double x;
	static double y;
	public static void main(String[] args) {
	x = a;
	y = b;
	double z = findMin(x, y);
	x = c;
	y = d;
	double q = findMin(x, y);
		if (z>=q){System.out.println(z);}
		else {System.out.println(q);};
	}

	public static double findMin(double x, double y){
		if (x<=y){return x;}
		else {return y;}
		}
}
