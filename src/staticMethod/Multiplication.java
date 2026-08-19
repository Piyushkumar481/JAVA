package staticMethod;

import java.util.Scanner;

public class Multiplication {
	
	public static void printTable(int n)
	{
		
		for(int i=1;i<=10;i++)
		{
			int num=n*i;
			System.out.print(num + " ");
			
		}
		
	}

	
	public static void main(String[] args) 

	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		printTable(n);
		
		

	}

}
