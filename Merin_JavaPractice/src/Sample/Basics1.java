package Sample;

import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the values of a ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		System.out.println("Enter the values of b ");
		b=obj.nextInt();
		c=a+b;
		System.out.println("C value is "+c);
		System.out.println("--------------------------------------------------");
		float x,y,z;
		System.out.println("Enter the values of x and y ");
		x=obj.nextFloat();
		y=obj.nextFloat();
		z=x*y;
		System.out.println("Z value is "+z);

	}

}
