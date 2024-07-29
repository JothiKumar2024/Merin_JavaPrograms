package OOPS;

public class Number {
	int a,b,c;
	
	void getnumber(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	int findmaximum()
	{
		if((a>b)&&(a>c))
			return a;
		else if((b>a) && (b>c))
			return b;
		else
			return c;
	}
	

}
