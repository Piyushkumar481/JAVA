package whileLoop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int n = num%10;
			sum= sum+n;
			product=product*n;
			num=num/10;
			
		}
		if(sum==product)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not Spy number");
		}

	}

}
