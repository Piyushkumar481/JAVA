package abstraction;

interface Payment
{
	boolean pay(double amount);
	
}
class UPIPaymet implements Payment
{
	public boolean pay(double amount)
	{
		System.out.println("Payment of "+amount+" is done using UPI");
		return true;
	}
}
class CreditCardPayment implements Payment
{
	public boolean pay(double amount)
	{
		System.out.println("Payment of "+amount+" is done using creditCard");
		return true;
	}
}

class CryptoPayment implements Payment
{
	public boolean pay(double amount)
	{
		System.out.println("Payment of "+amount+" is done using crypto Currency");
		return true;
	}
}
class loanService
{
	public void clearLoan(Payment payment,double amount)
	{
		if(payment.pay(amount))
		{
			System.out.println("Loan Cleared Successfully");
			System.out.println("Loan clearance certificate generated");
			
		}
		else
		{
			System.out.println("Payment failed.Loan Not Cleared");
		}
	}
}
class PaymentFactory
{
	static Payment getPaymentObject(int choice)
	{
		switch(choice)
		{
		case 1 -> 
		{
			return new UPIPaymet();
		}
		case 2 ->
		{
			return new CreditCardPayment();
		}
		case 3 -> 
		{
			
			return new CryptoPayment();
		}
		default->
		{
			return null;
		}
		
		}
	}
}

public class loan {

	
	
	public static void main(String[] args) 
	{
		int choice =2;
		double amount = 10000;
		Payment payment = PaymentFactory.getPaymentObject(choice);
		loanService ls = new loanService();
		ls.clearLoan(payment,amount);
		
	 
	
	} 

}
