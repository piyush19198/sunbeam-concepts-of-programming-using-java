package assignments1;
/*
Write a Java program that reads an integer between 0 and 1000 and
adds all the digits in the integer.
*/
import java.util.*;

public class Assignment1 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Provide Integer between 0 and 1000: ");
        int num = input.nextInt();

        int D1 = num % 10;
        int TEMP = num / 10;
        int D2 = TEMP % 10;
        TEMP = TEMP / 10;
        int D3 = TEMP % 10;
        TEMP = TEMP / 10;
        int D4 = TEMP % 10;
        int sum = D3 + D2 + D1 + D4;
        System.out.println("Sum of all digits in "+num+" is "+sum);

    }
}