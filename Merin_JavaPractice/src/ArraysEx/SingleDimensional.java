package ArraysEx;

import java.util.Scanner;

public class SingleDimensional {

	public static void main(String[] args) {
		
		int a [] =new int[5];
		System.out.println("Enter the array elements ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[ " + i + " ]  = " + a[i]);
		}
		
		System.out.println("------------------------------");
	}

}
