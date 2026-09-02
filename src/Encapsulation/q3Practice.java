package Encapsulation;

import java.util.Scanner;

class StudentAccount
{
	private int studentId;
	private String studentName;
	private int marks;
	public StudentAccount(int studentId, String studentName, int marks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int newmarks)
	
	{
		if(newmarks<=0 && newmarks>=100)
		{
			System.out.println("Invalid Marks");
		}
		else
		{
			this.marks=newmarks;
			System.out.println("Maks updated Successfully ");
		}
		
	}
	public void displayResult()
	{
		System.out.println("Id "+studentId);
		System.out.println("Name "+studentName);
		System.out.println("Marks "+marks);
	}
}

class ExamPortal extends StudentAccount
{
	public ExamPortal(int studentId, String studentName, int marks)
	{
	super(studentId,studentName,marks);
	}
	public void setMarks(int newmarks)
	{
		if(newmarks>100)
		{
			System.out.println("Marks cannot Exceed 100");
		}
		else
		{
			super.setMarks(newmarks);
		}
	}
	
}
public class q3Practice {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int studentId=sc.nextInt();
	 sc.nextLine();
	 String name=sc.nextLine();
	 int marks=sc.nextInt();
	 int newmarks=sc.nextInt();
	 
	 ExamPortal exmport= new ExamPortal(studentId, name, newmarks);
	 exmport.setMarks(newmarks);
	 System.out.println("Marks: "+exmport.getMarks());
	 
	}

}
