package whileLoop;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int product =1;
		 while(num!=0)
		 {
			 int n = num%10;
			 product = product*n;
			 num = num/10;
			 
		 }
		if(product == 0)
		{
			
			System.out.println("Duck Number");
		}
		else
		{
			System.out.println("Not  duck number");
		}

	}

}
