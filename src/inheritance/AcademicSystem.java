package inheritance;

import java.util.Scanner;

class student
{
	public String name;
	public int id;
	public student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	
	
}
class marks extends student
{
	public int marks;
	public marks(String name,int id,int marks)
	{
		super(name,id);
		this.marks=marks;
		
	}

	public char calculateGrade()
	{
		if(marks>=80)return 'A';
		else if(marks>=60)return 'B';
		else return 'C';
	}
}
class result extends marks
{
	public int attendance;
	public result(String name,int id,int marks,int attendance)
	{
		super(name,id,marks);
		this.attendance=attendance;
		
		
	}
	public void displayDetails()
	{
		super.displayDetails();
	}
	public String calculateResult()
	{
		if(attendance>=75)return "Pass";
		
		else return "Fail";
	}
}




public class AcademicSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,id,marks,attendance");
		String name=sc.nextLine();
		int id = sc.nextInt();
		int marks=sc.nextInt();
		int attendance=sc.nextInt();
		
		result r1=new result(name, id, marks, attendance);
		r1.displayDetails();
		System.out.println("Grade: "+r1.calculateGrade());
		System.out.println("Result: "+r1.calculateResult());
		
	
		
		
		
		

	}

}
