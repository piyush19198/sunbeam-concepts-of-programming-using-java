package assignments4;
import java.util.*;
/*
Create a class called Date that includes three instance variables—a
month (type int), a day (type int) and a year (type int). Provide a
constructor that initializes the three instance variables and assumes
that the values provided are correct. Provide a set and a get method
for each instance variable. Provide a method displayDate that displays
the month, day and year separated by forward slashes (/).Write a test
application named DateTest that demonstrates class Date’s
capabilities.
*/
class Date{
	private int d;
	private int m;
	private int y;
	
	Scanner sc=new Scanner(System.in);	
	
	Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		if(d>=0 && d<=31) {
			this.d = d;
		}
		else { 
			this.d=0;
		}
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		if(m>=0 && m<=12) {
		this.m = m;
		}
		else { 
		this.m=0;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void accept() {
		System.out.println("Enter day : ");
		d = sc.nextInt();
		System.out.println("Enter month : ");
		m = sc.nextInt();
		System.out.println("Enter year : ");
		y = sc.nextInt();
	}
	
	void disp() {
		System.out.println(+getD()+"/"+getM()+"/"+getY());
	}
}

public class Assignment1a {
}
