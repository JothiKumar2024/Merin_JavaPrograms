package OOPS;

import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Shape();
		int r;
		System.out.println("Enter the radious ");
		Scanner aa=new Scanner(System.in);
		r=aa.nextInt();
		obj.area(r);
		System.out.println("------------------------------------------");
		System.out.println("Enter the length and breadth ");
		double l=aa.nextDouble();
		double b=aa.nextDouble();
		obj.area(l, b);
		System.out.println("------------------------------------------");
		System.out.println("Enter the r and h ");
		int rad=aa.nextInt();
		int h=aa.nextInt();
		obj.area(rad,h);
	}

}

class Shape
{
	void area(int r)
	{
		System.out.println("Area of circle = "+(3.14*r*r));
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle "+(l*b));
	}
	void area(int r,int h)
	{
	System.out.println("Area of cylinder "+(2*3.14*r*h));	
	}
}