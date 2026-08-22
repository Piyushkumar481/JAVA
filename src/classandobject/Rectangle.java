package classandobject;

import java.util.Scanner;

class RectangleArea
{
	public double length;
	public double breadth;
	public RectangleArea(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	public void calculateArea()
	{
		double area = length*breadth;
		System.out.println("Area of Rectangle is: "+area);
		
	}
	public void calculatePerimeter()
	{
		double Perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle is: "+Perimeter);
		
		
	}
	public void displaydetails()
	{
		calculateArea();
		calculatePerimeter();
	}
	
}

public class Rectangle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth: ");
		double breadth=sc.nextDouble();
		
		RectangleArea r= new RectangleArea( length, breadth);
		r.displaydetails();

	}

}
