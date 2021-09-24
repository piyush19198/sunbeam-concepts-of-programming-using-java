package assignments3;

/*
Write a program that would print the information (name, year of
joining, salary, address) of three employees by creating a class named
'Employee'. The output should be as follows:
Name Year of joining  Address
EMP1 2000             Pune
EMP2 2002             Pune
EMP3 2008             Mumbai
*/
import java.util.*;

public class Assignment2 {
	public static void main(String[] args){
	    Employee e1 = new Employee("EMP1", 2000, 1200000, "Pune");
	    Employee e2 = new Employee("EMP2", 2002, 800000, "Pune");
	    Employee e3 = new Employee("EMP3", 2008, 600000, "Mumbai");
	    System.out.println("Name\tYear of joining\t\tAddress");
	    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getAddress());  
	    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getAddress());  
	    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getAddress());  
	  }
}

class Employee{
	  private String name, address;
	  private int year, salary;
	  public Employee(String n, int y, int sal, String add){
	    name = n;
	    year = y;
	    salary = sal;
	    address = add;
	  }
	  public String getName(){
	    return name;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getSalary(){
	    return salary;
	  }
	  public String getAddress(){
	    return address;
	  }
	}


	  
