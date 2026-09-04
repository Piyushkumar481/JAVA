package Polymorphism;

class SalaryCalculator
{
    public double calculateSalary(double monthlySalary)
    {
        return monthlySalary;
    }

    public double calculateSalary(int hours, double ratePerHour)
    {
        return hours * ratePerHour;
    }

    public double calculateSalary(double fixedAmount, double bonus)
    {
        return fixedAmount + bonus;
    }
}

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        SalaryCalculator c = new SalaryCalculator();

        double monthlySalary = c.calculateSalary(50000.0);
        double hourlySalary = c.calculateSalary(160, 250.0);
        double salaryWithBonus = c.calculateSalary(50000.0, 10000.0);

        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Hourly Salary: " + hourlySalary);
        System.out.println("Salary with Bonus: " + salaryWithBonus);
    }
}