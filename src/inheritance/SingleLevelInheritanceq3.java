package inheritance;

import java.util.Scanner;

class Employee
{
	public String name;
	public int id;
	public double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
		System.out.println("salary: "+calculateSalary());
	}
	public double calculateSalary()
	{
		return salary;
	} 
}

   class BonusEmployee extends Employee
{
	public double bonus;
	

public BonusEmployee(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

public void displayDetails()
{ 
	super.displayDetails();
	
}
public double calculateSalary() 
{
	System.out.println("Basic Salary: "+super.calculateSalary());
	System.out.println("Bonus: "+bonus);
	return super.calculateSalary()+bonus;
}
}



public class SingleLevelInheritanceq3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,id,salary,bonus");
		String name=sc.nextLine();
		int id=sc.nextInt();
		double salary=sc.nextDouble();
		double bonus=sc.nextDouble();
		
		BonusEmployee b1= new BonusEmployee(name, id, salary, bonus);
		b1.displayDetails();
		
		
		

	}

}
