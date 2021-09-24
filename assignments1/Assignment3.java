package assignments1;

import java.util.*;

/*
Write a program which prints "ONE", "TWO",... , "NINE", "OTHER" if
the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a
"nested-if" statement; (b) a "switch-case-default" statement.
*/
public class Assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 to 9: ");
        int number = input.nextInt();  

	      System.out.println("By Nested if-else method");
	     
	      if (number == 1) {   
	         System.out.println("ONE");
	      } else if (number == 2) {
	    	  System.out.println("TWO");
	      } else if (number == 3) {
	    	  System.out.println("THREE");
	      } else if (number == 4) {
	    	  System.out.println("Four");
	      } else if (number == 5) {
	    	  System.out.println("FIVE");
	      } else if (number == 6) {
	    	  System.out.println("SIX");
	      } else if (number == 7) {
	    	  System.out.println("SEVEN");
	      } else if (number == 8) {
	    	  System.out.println("EIGHT");
	      } else if (number == 9) {
	    	  System.out.println("NINE");
	      } else {
	    	  System.out.println("OTHER");
	      }
	      
	      System.out.println("By Switch-case method");
	      
	      switch(number) {
	         case 1: 
	        	 	System.out.println("ONE"); break;  
	         case 2: 
		            System.out.println("TWO"); break;
	         case 3: 
		            System.out.println("THREE"); break;
	         case 4: 
		            System.out.println("FOUR"); break;
	         case 5: 
		            System.out.println("FIVE"); break;
	         case 6: 
		            System.out.println("SIX"); break;
	         case 7: 
		            System.out.println("SEVEN"); break;
	         case 8: 
		            System.out.println("EIGHT"); break;
	         case 9: 
		            System.out.println("NINE"); break;
		            
	         default: System.out.println("OTHER"); 
	      }
	}
}
