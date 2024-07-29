package OOPS;

import java.util.Scanner;

public class ClassExample {

	public static void main(String[] args) {
	
		Employee obj=new Employee();
		obj.getdetails();
		obj.display();
		System.out.println("------------------------------------");
		Number aa=new Number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		aa.getnumber(a,b,c);
		System.out.println("Maximum number is "+aa.findmaximum());
		
	}


}

class Employee
{
	int no,salary;
	String name,dept;
	void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee no ");
		no=sc.nextInt();
		System.out.println("Enter the Employee name ");
		name=sc.next();
		System.out.println("Enter the Department ");
		dept=sc.next();
		System.out.println("Enter the Salary ");
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee no is "+no);
		System.out.println("Employee name is "+name);
		System.out.println("Employee department is "+dept);
		System.out.println("Employee salary "+salary);
	}
	
}


