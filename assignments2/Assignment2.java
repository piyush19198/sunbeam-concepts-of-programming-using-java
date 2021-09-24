package assignments2;

/*
Display sum of the odd numbers and the even numbers from a lower
bound to an upper bound.
*/

import java.util.*;

public class Assignment2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Lowerboound:");
		int lbound=sc.nextInt();
		
		System.out.println("Enter Upperbound:");
		int ubound=sc.nextInt();
		
		int even=0,odd=0;
		while(lbound<=ubound) {
			if(lbound%2==0) {
				even=even+lbound;
			}
			else {
				odd=odd+lbound;
			}
			lbound++;
		}
		System.out.println("Sum Of Even numbers : "+even);
		System.out.println("Sum Of Odd numbers : "+odd);
	}
}
