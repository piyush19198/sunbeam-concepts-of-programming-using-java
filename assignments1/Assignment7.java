package assignments1;
/*
A shop will give discount of 10% if the cost of purchased quantity is
more than 1000.Ask user for quantity and suppose, one unit will cost
100. Calculate and print total cost for user.
*/
import java.util.*;

public class Assignment7 {

	public static void main(String[] args) {
		int q,p=100;
		double fp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity :");
		q = sc.nextInt();
		
		if(q>1000) {
			fp=(q*p)*0.9;
			System.out.printf("Discount Applied. Final price is : %.2f",fp);
		}
		
		else
			System.out.println("Discount not applied. Final price is : " +(q*p));
			
	}

}