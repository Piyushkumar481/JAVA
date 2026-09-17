package Encapsulation;

import java.util.Scanner;

class Employee01
{
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee01(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=0;
		
		
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeId(int employeeId)
	{
		if(employeeId<0)
		{
			System.out.println("Invalid Id");
		}
		else
		{
		this.employeeId=employeeId;
		}
	}
	public String getEmployeeName()
	{
		return employeeName;
		
		
	}
	public void setemployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary>=0)
		{
			
			this.salary=salary;
		}
		
	}
	public void increaseSalary(double percentage)
	{
		if(percentage<0 || percentage>100)
		{
			System.out.println("Invalid");
		}
		else
		{
			double increaseAmount = (salary*percentage) / 100;
			double newSalary = salary + increaseAmount;
			salary = newSalary;
			
		}
	}
	
}




public class q7Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String employeeName=sc.nextLine();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter increase");
		double percentage=sc.nextDouble();
		
		Employee01 emp = new Employee01(employeeId,employeeName,salary);
		emp.setEmployeId(employeeId);
		emp.setemployeeName(employeeName);
		emp.setSalary(salary);
		emp.increaseSalary(percentage);
		System.out.println("Employee ID: "+emp.getEmployeeId());
		System.out.println("Employee Name: "+emp.getEmployeeName());
		System.out.println("Salary: "+emp.getSalary());
		
	
		
	

	}

}
