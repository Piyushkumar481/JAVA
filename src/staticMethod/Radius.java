package staticMethod;
import java.util.Scanner;

public class Radius {
	public static double circleArea(int r)
	{
		return 3.14*r*r;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int r= sc.nextInt();
		
		double area=circleArea(r);
		System.out.println("Area of circle is: "+area);
		
		

	}

}
