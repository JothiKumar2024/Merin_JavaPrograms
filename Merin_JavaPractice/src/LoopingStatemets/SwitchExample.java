package LoopingStatemets;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		int a,b;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice : ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			System.out.println("Add two numbers "+(a+b));
			break;
		case '-':
			System.out.println("subtracting two numbers "+(a-b));
			break;
		case '*':
			System.out.println("multiplying two numbers "+(a+b));
			break;
		case '/':
			System.out.println("divide two numbers "+(a/b));
			break;
		default:
			System.out.println("Invalid choice ");
			break;
			
		}
	}

}
