package whileLoop;

import java.util.Scanner;

public class Sumdigits {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	
	System.out.println("Enter a number"  );
	int num=sc.nextInt();
	int sum=0;
	
	while(num!=0)
	{
		int n=num%10;
		sum=sum+n;
		num=num/10;
		
		
	
	}
	System.out.println("The sum is : "+sum);
}
}
