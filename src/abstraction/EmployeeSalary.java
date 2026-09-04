package abstraction;

import java.util.Scanner;

abstract class  Employee
{
public abstract double calculateBonus(double salary);
}


class PermanentEmployee extends Employee
{
	public double calculateBonus(double salary)
	{
		return salary * 0.1;
	}
}

class COntractEmployee extends Employee
{
	public double calculateBonus(double salary)
	{
		return salary * 0.5;
	}
}
class FactoryClass
{
	public static Employee getImpletationObject(int choice)
	{
		Employee emp = null;
		switch(choice)
		{
		case 1-> emp = new PermanentEmployee();
		case 2-> emp = new COntractEmployee(); 
		}
		return emp;
	}
}




public class EmployeeSalary {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		Employee emp = FactoryClass.getImpletationObject(choice);
		System.out.println("Bonus : "+emp.calculateBonus(salary));
	}

}
