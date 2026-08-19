package staticMethod;

import java.util.Scanner;

public class SumNumber {
	public static int calculateSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		return a+b;
		
	}

	public static void main(String[] args) {
		int sum=calculateSum();
		System.out.println(sum);

	}

}
