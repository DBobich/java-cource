package by.dbobich.linear;

public class Task5 {
	public static void main(String[] args) {
	double t=800000;
	double hour=t/3600;
	int clear_hour=(int)hour;
	double minutes=(t-clear_hour*3600)/60;
	int clear_minutes=(int)minutes;
	int sec=(int)(t-clear_hour*3600)-clear_minutes*60;
	System.out.println(clear_hour+"ч"+clear_minutes+"мин"+sec+"сек");
	}
}