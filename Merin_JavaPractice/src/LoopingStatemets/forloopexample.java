package LoopingStatemets;

public class forloopexample {

	public static void main(String[] args) {
		int a;
		for(a=1;a<=5;a++)
		{
			System.out.println("a value is "+a);
			
		}
		System.out.println("-----------------------------------------------");
		for(a=2;a<=20;a+=2)
		{
			System.out.println("a value is "+a);
			
		}
		System.out.println("-----------------------------------------------");
		
		for(a=10;a>=1;a--)
		{
			System.out.println("a value is "+a);
			
		}
		System.out.println("-----------------------------------------------");
		//nested for 
		
		for(a=1;a<=3;a++) //1 2 3
		{ 
			for(int b=1;b<=3;b++) //1 2 3
			{
			System.out.print(a+" "+b+"\t");	
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		//Transfer Statement - break 
		
		for(a=1;a<=10;a++)
		{
			if(a==5)
			{
				break;
			}
			System.out.println("a value is "+a);
		}
		System.out.println("-----------------------------------------------");
		//Transfer Statement - continue 
		
		for(a=1;a<=10;a++)
		{
			if(a==5)
			{
				continue;
			}
			System.out.println("a value is "+a);
		}
		
	}

}
