package staticMethod;

import java.util.Scanner;

public class SameNumber {
	public static int getNumber()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		return n;
	}
		

	public static void main(String[] args) 
	{
	int result=getNumber();
	System.out.println(result);
	

	}

}
