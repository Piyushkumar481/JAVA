package Encapsulation;

import java.util.Scanner;

class Employee
{
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getId()
	{
		return empId;
	}
	public String getName()
	{
		return empName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double newSalary)
	{
		if(newSalary<0)
		{
			System.out.println("Invalid Salary");
		}
		else
		{
			this.salary=newSalary;
			System.out.println("Salary Updated Successfully");
		}
	}
	public void displayDetails()
	{
		System.out.println("Employee id "+empId);	
		System.out.println("Name "+empName);	
		System.out.println("Salary "+salary);	
	}
}
class HRdepartment extends Employee
{
	public HRdepartment(int empId,String empName,double salary)
	{
		super(empId,empName,salary);
		
	}
	public void setSalary(double newSalary)
	{
		if(newSalary>1.5*getSalary())
		{
			System.out.println("Increment Limit Exceeded");
		}
		else
		{
			super.setSalary(newSalary);
		}
	}
}


public class q2Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id =sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		double salary =sc.nextDouble();
		double newSalary=sc.nextDouble();
		HRdepartment emp =new HRdepartment(id, name, newSalary);
		emp.setSalary(newSalary);
		System.out.println("Salary: "+emp.getSalary());
		

	}

}
