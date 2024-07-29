package ArraysEx;

public class ArraysExample {

	public static void main(String[] args) {

//Single Dimensional array
		int a[]= {25,63,52,41,52,63};
		
		float x[]= {2.3f,6.3f,8.5f,9.3f};
		
		String name[]={"Raj","Lata","mani"};
		 
		System.out.println("Integer array ");
		System.out.println("a[2] = "+a[2]);
		
		System.out.println("float array ");
		System.out.println("x[3] = "+x[3]);
		
		System.out.println("string  array ");
		System.out.println("name[0] = "+name[0]);
		System.out.println("------------------------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[ " + i + " ]  = " + a[i]);
		}
		
		System.out.println("------------------------------");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x[ " + i + " ]  = " + x[i]);
		}
		System.out.println("------------------------------");
		for(int i=0;i<name.length;i++)
		{
			System.out.println("name[ " + i + " ]  = " + name[i]);
		}
	}

}
