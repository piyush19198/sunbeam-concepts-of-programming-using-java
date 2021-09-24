package assignments2;

/*
Take integer inputs from user until he/she presses q ( Ask to press q
to quit after every integer input ). Print average and product of all
numbers.
*/

import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		int count = 0;
	    int product = 1;
		int i = 0;

	    while(ch != 'q') {
	    	System.out.println("Enter a number or press Q for results: ");
	    	String str = sc.next();
	    	
	    	if (str.charAt(0) == 'q') {
	    		ch = 'q';
	    	}
	    	else {
	    		int x = Integer.parseInt(str);
	    		count = count + x;
	    		product = product*x;
	    		i++;
			}
	    }
	    double avg = (double)count/(double)i;
	    
	    System.out.println("Sum is: " + count);
	    System.out.println("Average is: " + avg);
	    System.out.println("Prodcut is: " + product);
	}
}
