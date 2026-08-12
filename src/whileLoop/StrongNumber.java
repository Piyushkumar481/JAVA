package whileLoop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp=num;
		int sum=0;
		
		while(temp!=0)
		{
			//take ld from temp
			int ld = temp%10;
			//find factorial of ld
			int factorial = 1;
			for(int i=ld; i>=1;i--)
			{
				factorial = factorial *i;
				
			}
			//add factorial to sum
			sum=sum+factorial;
			temp=temp/10;
			
			
		}
		if(sum==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}

	}

}
