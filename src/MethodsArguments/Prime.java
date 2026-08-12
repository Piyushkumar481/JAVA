package MethodsArguments;

public class Prime {
	public static void checkPrime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		if(a%i==0)
		{
			count++;
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	

	public static void main(String[] args) {
		checkPrime(8);

	}

}
