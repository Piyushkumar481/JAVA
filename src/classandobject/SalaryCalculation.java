package classandobject;

import java.util.Scanner;

class Employee
{
	public String name;
	public double basicSalary;
	
	public Employee(String name, double basicSalary)
	{
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public void calculateHRA()
	{
		double hra=basicSalary*0.10;
		System.out.println("HRA : "+hra);
	}
	public void calculateDA()
	{
		double da= basicSalary*0.20;
       System.out.println("DA : "+da);
	}
	public void calculateTotalSalary()
	{
		 double hra = this.basicSalary * 0.10;
		 double da= basicSalary*0.20;
		 double totalSalary = this.basicSalary + hra + da;
		 System.out.println("Total Salary : "+totalSalary);
		 
		 
		 
		 
	}
	public void displayDeatails()
	{
		System.out.println("Name: "+name);
		calculateHRA();
		calculateDA();
		calculateTotalSalary();
	}
}





public class SalaryCalculation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter Basic Salary:");
		double basicSalary=sc.nextDouble();
		
		Employee e= new Employee(name,basicSalary);
		e.displayDeatails();
		
		
		

	}

}
