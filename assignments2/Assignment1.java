package assignments2;

/*
Program to display addition of numbers from a lower bound to an
upper bound using a while-loop.
*/

import java.util.*;

public interface Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Lower bound Number:");
		int lbound=sc.nextInt();
		
		System.out.println("Enter The Upper bound Number:");
		int ubound=sc.nextInt();

		int temp=0;
		while(temp<=ubound) {
			temp= temp + lbound;
			lbound++;
		}
			System.out.println("Addition of numbers between Lowerbound and Upperbound: "+temp);
	}

}
