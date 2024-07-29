package Sample;

import java.util.Scanner;

public class relational {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("a is greater than b = "+(a>b));
		System.out.println("a is less than b = "+(a<b));
		System.out.println("a is greater than or equal to b = "+(a>=b));
		System.out.println("a is less than or equal  b = "+(a<=b));
		System.out.println("a is equal to b = "+(a==b));
		System.out.println("a is not equal to b = "+(a!=b));
		System.out.println("------------------------------------------------");
		//Logical operators
		boolean result1,result2,result3;
		result1=(a>b) && (a>c);
		result2=(a>b) || (a>c);
		result3=!(a>b) ;
		System.out.println("Result1 = "+result1);
		System.out.println("Result2 = "+result2);
		System.out.println("Result3 = "+result3);
		System.out.println("------------------------------------------------");
		//increment and decrement operator
		
		a++;
		--b;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		

	}

}
