package classandobject;

import java.util.Scanner;

class CircleArea
{
	public double radius;
    
	public CircleArea(double radius) {
		
		this.radius = radius;
	}
	public void calculateArea()
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle is: "+area);
		
	}
	public void calculateCircumference()
	{
		double Circumference=2*3.14*radius;
		System.out.println("Circumference of Circle is: "+Circumference);
		
		
	}
	public void displayCircleInfo()
	{
		calculateArea();
		calculateCircumference();
	}
	
}

public class Circle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		
		
		CircleArea r= new CircleArea(radius);
		r.displayCircleInfo();

	}

}

