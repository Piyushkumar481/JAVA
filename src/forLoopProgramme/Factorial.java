package forLoopProgramme;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter a value :" +a);
		
		long factorial=1;
		
		for(int i=a;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+a+ " is :" +factorial);
	 }

}
