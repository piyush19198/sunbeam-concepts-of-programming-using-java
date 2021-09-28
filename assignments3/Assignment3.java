package assignments3;
import java.util.*;
/*
Write a program to print the name, salary and date of joining of 10
employees in a company. Use array of objects.
*/
class Employee1{
	private String name;
	private int salary;
	private String doj;
	
	Scanner sc=new Scanner(System.in);
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public String getDoj() {
//		return doj;
//	}
//
//	public void setDoj(String doj) {
//		this.doj = doj;
//	}
//
//	Employee1(){
//
//		this("one",1,"one");
//	}
//
//	Employee1(String name, int salary, String doj){
//		this.name=name;
//		this.salary=salary;
//		this.doj=doj;
//	}
	
	void accept()
	{
		System.out.println("Enter Name: ");
		this.name=sc.next();
		System.out.println("Enter Salary: ");
		this.salary=sc.nextInt();
		System.out.println("\nDate of Joining ");
		this.doj=sc.next();
		
	}
	
	void disp()
	{
		System.out.println("\nName: "+this.name+"\nSalary: "+this.salary+"\nDate of Joining"+this.doj);
	}
}	

public class Assignment3 {
	public static void main(String[] args) {
		int i,count;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Employees: ");
		count=sc.nextInt();
		System.out.println("-------------------------");
		
		Employee1 e[]=new Employee1[count];
		
		for(i=0;i<count;i++){
			e[i]=new Employee1();
		}
		for(i=0;i<count;i++){
			e[i].accept();
		}
		System.out.println("-------------------------");
		for(i=0;i<count;i++){
			e[i].disp();
		}
	}
}
