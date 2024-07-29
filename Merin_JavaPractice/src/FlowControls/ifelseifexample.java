package FlowControls;

import java.util.Scanner;

public class ifelseifexample {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 marks ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		double avg=total/5;
		System.out.println("Total = "+total +" Average = "+avg);
		if (avg>=80)
			System.out.println("A grade ");
		else if(avg>=70)
			System.out.println("B Grade ");
		else if(avg>=50)
			System.out.println("c Grade ");
		else
			System.out.println("D grade ");

	}

}
