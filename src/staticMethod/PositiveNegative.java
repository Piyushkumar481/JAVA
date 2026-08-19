package staticMethod;

import java.util.Scanner;

public class PositiveNegative {
	public static boolean isPositive()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if(a>0)
		{
			return true;
		}
		else
		{
		  return false;
		}
	}

	public static void main(String[] args) {
		boolean result= isPositive();
		System.out.println(result);

	}

}
