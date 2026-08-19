package staticMethod;
import java.util.Scanner;

public class addNumbers {

	public static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		
		int b= sc.nextInt();
		
		int sum=add(a,b);
		System.out.println("Sum is: "+sum);
		
	}
}
