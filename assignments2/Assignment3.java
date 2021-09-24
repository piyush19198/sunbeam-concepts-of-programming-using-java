package assignments2;

/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		System.out.print("Enter Your Marks to get Grades:  ");
		Scanner sc = new Scanner(System.in);
		
		int marks= sc.nextInt();
		
		if(marks>=80 && marks<=100)
			System.out.println("Your Grade is A");
		
		if(marks>=60 && marks<80)
			System.out.println("Your Grade is B");
		
		if(marks>=50 && marks<60)
			System.out.println("Your Grade is C");
		
		if(marks>=45 && marks<50)
			System.out.println("Your Grade is D");
		
		if(marks>=25 && marks <45)
			System.out.println("Your Grade is E");
		
		else
			System.out.print("Your Grade is F");
	}

}
