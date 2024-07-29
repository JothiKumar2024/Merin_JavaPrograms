package Sample;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		a+=10; //a+=b
		b-=20;
		c*=30;
		System.out.println(" a = "+a);
		System.out.println(" b = "+b);
		System.out.println(" c = "+c);

	}

}
