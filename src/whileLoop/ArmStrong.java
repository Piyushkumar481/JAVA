package whileLoop;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int temp=num;
	//count the digit
	int count = 0;
	while(temp!=0)
	{
		count++;
		temp=temp/10;
	}
	temp=num;
	
	//find sum of the digit with power of count
	double sum=0;
	while(temp!=0)
	{
		int ld = temp%10;
	
	// find last digit to the power count.
		double power =Math.pow(ld, count);
	//add power to sum
		sum=sum+power;
		
		temp=temp/10;
	
	}
	if(sum==num)
	{
		System.out.println("Armstrong Number");
		
	}
	
	else
	{
		System.out.println("Not Armstrong Number");
	}

	}

}
