package assignments3;
import java.util.*;
/*
Create a class 'Student' with three data members which are name, age
and address. The constructor of the class assigns default values name
as "unknown", age as '0' and address as "not available". It has two
members with the same name 'setInfo'. First method has two
parameters for name and age and assigns the same whereas the
second method takes has three parameters which are assigned to
name, age and address respectively. Print the name, age and address
of 10 students.
 */
class Student{
	private String name;
	private int age;
	private String addr;
	
	Scanner sc= new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	Student(){
		this("unknown",0,"not available");
	}
	

	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Student(String name, int age, String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	
	void accept() {
		System.out.println("Enter Name: ");
		this.name=sc.next();
		System.out.println("Enter Age: ");
		this.age=sc.nextInt();
		System.out.println("Enter Adress: ");
		this.addr=sc.next();
	}
	
	void disp() {
		System.out.println("\nName: "+this.name+"\nAge: "+this.age+"\nAdress: "+this.addr);
	}
}

public class Assignment4 {
	public static void main(String[] args) {
		int i,count;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Students: ");
		count=sc.nextInt();
		System.out.println("-------------------------");
		
		Student e[]=new Student[count];
		
		for(i=0;i<count;i++){
			e[i]=new Student();
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
