package assignments1;

import java.util.*;

/*
Write a program to calculate the sum of the first and the second last
digit of a 5 digit.
E.g.- NUMBER : 12345 OUTPUT : 1+4=5
*/

public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Provide a 5 digit integer: ");
        int num = input.nextInt();
        int temp = num;
        while (temp >= 10)
            temp /= 10;
        int d1 = temp;
        
        int d2 = num%10;
        //System.out.println("First Digit is: "+d1); 
        //System.out.println("Second Digit is: "+d2);
        System.out.print("Sum of first and last digit is: "+(d1+d2)); 
	}

}
