package assignments1;

import java.util.*;

/*
Write a program to print absolute value of a number entered by user.
E.g.-
INPUT: 1 OUTPUT: 1
INPUT: -1 OUTPUT: 1
*/
public class Assignment6 {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Provide number to find its absolute value: ");
        int num = input.nextInt();
        if (num < 0)
        {
            num = (-1) * num;
        }
        System.out.println("Absolute value is:  "+num);
	}
}
