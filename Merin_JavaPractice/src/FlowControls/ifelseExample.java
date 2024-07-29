package FlowControls;

import java.util.Scanner;

public class ifelseExample {

	public static void main(String[] args) {
		
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username : ");
		username =sc.next();
		System.out.println("Enter the password : ");
		password =sc.next();
		
		if(username.equals("Admin") && (password.equals("Admin@123")))
		{
			System.out.println("Login Success ");
		}
		else
		{
			System.out.println("Login Failure");
		}
		

	}

}
