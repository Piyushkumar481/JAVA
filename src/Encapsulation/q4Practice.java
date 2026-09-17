package Encapsulation;

import java.util.Scanner;
class Student
{
private int rollNo;
private String name;
private int age;
private double marks;

public void setRollNo(int rollNo)

{
	if(rollNo>=0)
	{
		this.rollNo = rollNo;
	}
	
}
public int getRollNo()
{
	
	
	return rollNo;
}
public void setName(String name)
{
	this.name=name;
}
public String  getName()
{
return name;
}
public void setAge(int age)

{
	if(age>=15 && age<=60)
	{
	this.age=age;
	}
}
public int getAge()
{
	return age;
}
public void setMarks(double marks)
{
	if(marks>=0 && marks<=100)
	{
	this.marks=marks;
	}
}
public double getMarks()
{
	return marks;
}
}

public class q4Practice {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no:");
		int rollNo=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age= sc.nextInt();
		System.out.println("Enter marks");
		double marks =sc.nextDouble();
		 Student s = new Student();
		 s.setRollNo(rollNo);
		 
		 s.setName(name);
		 s.setAge(age);
		 s.setMarks(marks);
		 
		 System.out.println("rollNo = "+s.getRollNo());
		 System.out.println("name ="+s.getName());
		 System.out.println("age ="+s.getAge());
		 System.out.println("marks ="+s.getMarks());

	}

}
