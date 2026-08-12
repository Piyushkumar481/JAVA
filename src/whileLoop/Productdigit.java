package whileLoop;

import java.util.Scanner;

public class Productdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int product =1;
		
		while(num!=0)
		{
			int n=num%10;
			product=product*n;
			num=num/10;
		}
		System.out.println("The product is " +product);

	}

}
