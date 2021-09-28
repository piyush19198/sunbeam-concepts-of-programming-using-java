package assignments4;
import java.util.*;
/*
Create a class Employee having name and id as fields. Declare static
variable with data type string as name of company assign name as
“Sunbeam” for all objects. Declare a two-parameter constructor with
parameters named n and i. Declare an instance method display and
print the output on the console. Create the first object of the class and
pass the two arguments with type string and int. all the display
method using reference variable e. Similarly create one more object
with different name and id and call display method.
*/
class Employee{
	private String name;
	private int id;
	
	static String nc="Sunbeam";
	
	Employee(){
	}
	
	Employee(int i, String n) {
		this.id = i;
		this.name = name;
	}
	
	void display() {
		System.out.println("\nName: "+name+"\nID: "+id+"\nCompany Name: "+nc);
	}
}

public class Assignment2 {
	public static void main(String[] args) {
		Employee e = new Employee(1,"one");
		e.display();
		Employee e2 = new Employee(2,"two");
		e2.display();
	}
}
