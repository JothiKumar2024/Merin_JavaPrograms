package Sample;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {

		int a,b,c;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		System.out.println("--------------------------------------------");
		int m1,m2,m3;
		System.out.println("Enter the 3 marks ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println("Total = "+total +" Average = "+avg);
		
		
	}

}
