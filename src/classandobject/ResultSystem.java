package classandobject;

import java.util.Scanner;

class Students
{
	public String name;
	public int marks1;
	public int marks2;
	public int marks3;
	public Students(String name, int marks1, int marks2, int marks3) {
		
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public void calculateTotal()
	{
		int total=marks1 + marks2 +marks3;
		System.out.println("Total : "+total);
	}
	public void calculateAverage()
	{
		int average=(marks1 + marks2 +marks3)/3;
		System.out.println("Average: "+average);
	}
	public void displayResult()
	{
		System.out.println("Name : "+name);
		calculateTotal();
		calculateAverage();
	}
}




public class ResultSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter marks1");
		int marks1=sc.nextInt();
		System.out.println("Enter marks2");
		int marks2=sc.nextInt();
		System.out.println("Enter marks3");
		int marks3=sc.nextInt();
		
		Students s=new Students(name,marks1,marks2,marks3);
		s.displayResult();

	}

}
