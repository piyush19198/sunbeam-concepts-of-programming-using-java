package assignments1;

import java.util.*;

/*
Write a program to perform arithmetic operations, by accepting
numbers from user and the choice from user. Write a menu driven
program to perform operations.
*/

public class Assignment5 
{
    	public static void main( String[] args ) 
    	{
		Scanner input = new Scanner(System.in);
	
		int a, b, choice;

		System.out.println("Enter A:");
		a = input.nextInt();

		System.out.println("Enter B:");
		b = input.nextInt();
	
		System.out.println("Choose Options To Perform : ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice:");
		choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition of A + B is : " + (a+b));
				break;
			case 2:
				System.out.println("Subtraction of A - B is : " + (a-b));
				break;
			case 3:
			
				System.out.println("Multiplication of A * B is : " + (a*b));
				break;
			case 4:
				if(b == 0)
				{
					System.out.println("Denominator cannot be 0(Zero) for Division operation");
					break;
				}
				else
				{			
					System.out.println("Division of A / B is : " + (a/b));
					break;
				}	
			default:
				System.out.println("Invalid Choice");
		}
    	}

}
