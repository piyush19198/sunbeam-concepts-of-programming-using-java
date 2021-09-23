package assignments1;
/*
Print the area and circumference of a circle, given its radius.
*/
import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
	    double radius = sc.nextDouble();
	    
	    double area = Math.PI * (radius * radius);
	    System.out.println("Area of circle is: "+area);
	    
	    double circumference= Math.PI * 2 * radius;
	    System.out.println( "Circumference of the circle is: "+circumference) ;

	}

}
