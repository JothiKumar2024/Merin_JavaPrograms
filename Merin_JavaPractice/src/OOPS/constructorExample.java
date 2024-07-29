package OOPS;

public class constructorExample {

	public static void main(String[] args) {
		Sum obj=new Sum();
		obj.calculate();
		
		Sum obj1=new Sum(25,63);
		obj1.calculate();
	}

}

class Sum
{
	int a,b;
	Sum()
	{
		a=10;
		b=20;
	}
	Sum(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void calculate()
	{
		System.out.println("Result = "+(a*b));
	}
}
