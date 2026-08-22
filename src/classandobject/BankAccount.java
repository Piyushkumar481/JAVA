package classandobject;

import java.util.Scanner;

class Bank
{
	public String accoutHolderName;
	public int accountNumber;
	public double balance;
	public Bank(String accoutHolderName, int accountNumber, double balance) {
		
		this.accoutHolderName = accoutHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
		public void deposit(double amount)
		{
			
			balance=balance+amount;
			System.out.println("Deposit of "+amount+" is done Successfully");
			
		}
		public void withdrawl(double amount)
		{
			
			if(balance>=amount)
			{
				balance=balance-amount;
				System.out.println("Amount of "+amount+"is deducted Successfully");
			
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
	    }
		public void DisplayBalance()
		{
			System.out.println("Current balance is : "+balance);
		}
	
	
	

}

public class BankAccount {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name , AccountNumber, Balance");
		String accoutHolderName=sc.nextLine();
		int accountNumber=sc.nextInt();
		double balance=sc.nextDouble();
		Bank acc1= new Bank(accoutHolderName, accountNumber, balance);
		
		acc1.deposit(500);
		acc1.withdrawl(1000);
		acc1.DisplayBalance();
		
		
		
		
		
		

	}

}
