package Functions;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
	//passing arrays as a argument
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Sum of array " +calculate(a));
	}
	static int calculate(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
