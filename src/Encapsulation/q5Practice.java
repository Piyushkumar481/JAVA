package Encapsulation;

import java.util.Scanner;

class BankAccount01 
{
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount01(long accountNumber,String accountHolderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	public long getAccount()
	{
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber)
	{
		if(accountNumber<0)
		{
			System.out.println("Invalid Account Number");
		}
		else
		{
		this.accountNumber=accountNumber;
		}
		
	}
	public String getAccountHolder()
	{
		return accountHolderName;
		
	}
	public void setAccountHolder(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			
			
		}
		else
		{
			this.balance=amount;
			System.out.println("Balance: "+balance);
		}
	}
}



public class q5Practice {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Account Number: ");
	long accountNumber=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter name");
	String accountHolderName=sc.nextLine();
	System.out.println("Enter Balance");
	double balance=sc.nextDouble();
	
	System.out.println("Enter deposit ");
	double amount=sc.nextDouble();
	
	BankAccount01 ba = new BankAccount01(accountNumber,accountHolderName,balance);
	ba.setAccountNumber(accountNumber);
	System.out.println("Account Number: "+ba.getAccount());
   ba.setAccountHolder(accountHolderName);
   System.out.println("Account Holder: "+ba.getAccountHolder());
	ba.setBalance(amount);
System.out.println("Balance: "+ba.getBalance());	
	}

}
