package Sample;

import java.util.Scanner;

public class Basics3 {

	public static void main(String[] args) {
		String name;
		char gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		name=sc.nextLine();
		System.out.println("My name is "+name);
		System.out.println("Enter the gender ");
		
		gender=sc.next().charAt(0);
		System.out.println("Gender is "+gender);
		
		

	}

}
