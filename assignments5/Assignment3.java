package assignments5;
import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    
		int num[] = {1, 2, 3, 4, 5};

	    System.out.println("Enter number to search: ");
	    int f=sc.nextInt();

	    boolean found = false;

	    for (int n : num) {
	      if (n == f) {
	        found = true;
	      }
	    }
	    
	    if(found)
	      System.out.println(f+" is in array.");
	    else
	      System.out.println(f+" is not in array.");
	  }
}
