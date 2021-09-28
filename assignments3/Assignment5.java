package assignments3;
import java.util.*;
/*
Create a class Vehicle. The class should have two fields-no_of_seats
and no_of_wheels. Create facilitator function to display number of
seats and number of wheels. Create two objects and initialize the
fields using constructor. 
*/

class Vehicle{
	private int nos;
	private int now;
	
	Scanner sc=new Scanner(System.in);
	
	Vehicle(){
		this(1,1);
	}
	
	Vehicle(int nos, int now){
		this.nos=nos;
		this.now=now;
	}
	
	void disp() {
		System.out.println("Number of Seats: "+this.nos);
		System.out.println("Number of Wheels: "+this.now);
		System.out.println("---------------------"+this.now);
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.disp();
		Vehicle v2=new Vehicle(2,2);
		v2.disp();
		Vehicle v3=new Vehicle(3,3);
		v3.disp();
		Vehicle v4=new Vehicle(4,4);
		v4.disp();
		Vehicle v5=new Vehicle(5,5);
		v5.disp();
	}
	
}
