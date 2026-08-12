package whileLoop;

import java.util.Scanner;

public class PallindromRange {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter min");
	int a = sc.nextInt();
	System.out.println("Enter max");;
	int b= sc.nextInt();
	
	for(int num =a; num<=b;num++)
	{
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		if(rev==num)
		
			System.out.println(num);
		}
			
	}
	
}

