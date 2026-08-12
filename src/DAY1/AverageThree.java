package DAY1;
import java.util.Scanner;

public class AverageThree {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers one by one :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		double Average = (n1+n2+n3)/3.0;
		System.out.printf("The Average of three no. is: %.2f" ,Average);
		
	

	}

}
