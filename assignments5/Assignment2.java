package assignments5;
//Create a Java Program to Sort an Array of Numeric Data.
public class Assignment2 {
	public static void main(String[] args) {
		int arr[] = new int[] {10, 6, 8, 2, 4};     
	    int temp = 0;  
	    
	    System.out.println("Unsorted array: ");
	    
	    for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i]+" ");    
        } 
	    
	    for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
	    
	    System.out.println("\nSorted array : ");
	    
	    for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
	}
}
