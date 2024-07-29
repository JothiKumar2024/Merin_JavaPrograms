package Sample;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int a,b;
		String result;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		result=(a>b)?" A is greater than b ": " B is greater than a ";
		System.out.println(result);

	}

}
