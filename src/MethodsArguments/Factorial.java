package MethodsArguments;

public class Factorial {

	public static void factorial(int a)
	{
		int fact=1;
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		factorial(5);
	}

}
