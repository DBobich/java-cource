package by.dbobich.linear;
public class Task2 
{
	public static void main(String[] args) 
	{
	double a = 2;
	double b = 10; 
	double c = 5;
	double x = b*b+4*a*c;
	double y = Math.sqrt(x);
	double z = (b+y)/(2*a) - a*a*a*c + 1/(b*b);
	System.out.println("z=" + z);
	}
}