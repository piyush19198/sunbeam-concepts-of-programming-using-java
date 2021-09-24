package assignments2;

/*
Accept 20 integer inputs from user and print the following:
number of positive numbers , number of negative numbers
number of odd numbers , number of even numbers
number of 0s 
*/

import java.util.*;

public class Assugnment5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   
		int zero = 0;
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int num = 0;
	    
	    for (int i = 0; i<20; i++) {
	    	System.out.println("Enter number: ");
	    	num = sc.nextInt();
	 
	    		if (num == 0) {
	    			zero++;
	    		}
	    	
	    		if (num %2 == 1) {
	    			odd++;
	    		}
	    	
	    		if (num %2 == 0) {
	    			even++;
	    		}
	    	
	    		if (num > 0) {
	    			positive++;
	    		}
	    	
	    		if (num < 0) {
	    			negative++;
	    		}

	    }
	    
	    System.out.println("Number of zero is: " + zero);
	    System.out.println("Number of positive is: " + positive);
	    System.out.println("Number of negative is: " + negative);
	    System.out.println("Number of odd is: " + odd);
	    System.out.println("Number of even is: " + even);
	}

}
