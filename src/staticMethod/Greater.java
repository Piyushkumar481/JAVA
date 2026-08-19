package staticMethod;

import java.util.Scanner;

public class Greater {
	public static int checkGreater(int a,int b)
	{
		if(a>b)
		{
			return a;
			
		}
		else
		{
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int large = checkGreater(a, b);
		System.out.println("Larger number is: "+large);

	}

}
