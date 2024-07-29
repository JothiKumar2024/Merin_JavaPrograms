package Functions;

import java.util.Scanner;

public class FunctionExample1 {
	
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the values of a and b ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Maximum number =" +findmaximum(a, b)); //calling function
		System.out.println("-------------------------------------------");
		System.out.println("Enter the username ");
		String username=sc.next();
		System.out.println("Enter the password ");
		String password=sc.next();
		Login(username, password);

	}
	
	//function with argument and return values
	static int findmaximum(int m,int n) //definition 
	{
		if (m>n)
			return m;
		else 
			return n;
		
	}
	//function with argument and  no return values
	static void Login(String user,String pass)
	{
		if (user.equals(pass))
			System.out.println("Login Success ");
		else
			System.out.println("Login Failure ");
	}

}
