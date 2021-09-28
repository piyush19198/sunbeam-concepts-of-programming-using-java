package assignments5;

import java.util.*;

//Write a Java program to check if two arrays are equal.
public class Assignment5 {
	public static void main(String[] args) {
		int a[] = { 30, 25, 40 };
		int b[] = { 30, 25, 40 };
		
		boolean result = Arrays.equals(a, b);
		
		if (result == true) {
            System.out.println("Both equal.");
        }
        else {
            System.out.println("Not equal.");
        }
	}
}
