package Encapsulation;

import java.util.Scanner;

class BankAccount
{
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	

public void deposit(double amount)
{
	if(amount>0)
	{
		balance+=amount;
		System.out.println("Amount of "+amount+" is been deposited.....!");
	}
	else
	{
		System.out.println("Invalid deposit amount");
	}
}
 public void withdraw(double amount)
 {
	 if(amount>0 && amount<=balance)
	 {
		 balance-=amount;
		 System.out.println("Withdrawl of "+amount+" is done successfully..!!");
	 }
	 else
	 {
		 System.out.println("Insufficient balance");
	 }
		 
 }
 public double getBalance()
 {
	 return balance;
 }
 public String getAccountNumber()
 {
	 return accountNumber;
 }
}

class Mobileapp extends BankAccount
{

	public Mobileapp(String accountNumber, double balance)
	{
		super(accountNumber, balance);
	}
	 public void withdraw(double amount)
	 {
		 if(amount>25000)
		 {
			 System.out.println("Daily limit is exceeded.!!");
		 }
		 else
		 {
			 super.withdraw(amount);
		 }
	 }
	
	
}
public class Practiceqno1 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter account number and balance");
		 String accountNumber=sc.nextLine();
		 double balance=sc.nextDouble();
		 System.out.println("Enter amount to deposit");
		 double deposit=sc.nextDouble();
		 System.out.println("Enter withdrawl amount");
		 double withdraw= sc.nextDouble();
		 Mobileapp acc= new Mobileapp(accountNumber, balance);

	}

}
