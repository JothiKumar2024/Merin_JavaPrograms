package FlowControls;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//biggest of 3 numbers
		
		if (a>b)
		{
			if (a>c)
				System.out.println("a is greater ");
			else
				System.out.println("c is greater ");
		}
		else
		{
			if (b>c)
				System.out.println("b is greater ");
			else
				System.out.println("c is greater ");
		}

	}

}
