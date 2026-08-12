package forLoopProgramme;
import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
	   System.out.println("Enter min value : "+a);
		int b=sc.nextInt();
		System.out.println("Enter max value : "+b);
		
		for(int i=a; i<=b; i++)
		{
			System.out.println(i);
		}
		
		
	}

}
