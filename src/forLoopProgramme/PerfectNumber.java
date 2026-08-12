package forLoopProgramme;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n =sc.nextInt();
		System.out.println("Enter number : "+n);
		
		int sum=0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of factor is : "+sum);
		if(sum==n)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a Perfect number");
		}
	}

}
