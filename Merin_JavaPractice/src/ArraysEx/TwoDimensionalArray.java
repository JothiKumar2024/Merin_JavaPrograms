package ArraysEx;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String [][] name= new String[3][2];
		name[0][0]="Admin";
		name[0][1]="Admin123";
		
		name[1][0]="Hr";
		name[1][1]="Hr123";
		
		name[2][0]="Emp";
		name[2][1]="Emp123";
		
		int [][] arr= {{10,25,30},{25,36,65},{75,85,96}};
		
		char data[][]= {{'r','a','j','u'},{'k','a','n','i'}};
		System.out.println("Integer : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		System.out.println("String  : ");
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[i].length;j++)
			{
				System.out.print(name[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("charchter  : ");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
