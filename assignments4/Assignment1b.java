package assignments4;
import java.util.*;

class DateTest {
	void disp() {
		Date date=new Date(0,0,0);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Day ");
		int d=sc.nextInt();
		date.setD(d);
		
		System.out.println("Enter Month");
		int m=sc.nextInt();
		date.setM(m);

		System.out.println("Enter Year");
		int y=sc.nextInt();
		date.setY(y);

		date.disp();
	}	
}
public class Assignment1b {
	public static void main(String args[]){
		DateTest D=new DateTest();
		D.disp();
	}
}	