package inheritance;

import java.util.Scanner;


class product
{
	public String name;
	public double price;
	public double quantity;

	public product(String name, double price, double quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void displayDetails()
	{
		System.out.println("Product name: "+name);
		System.out.println("Price of the Product: "+price);
		System.out.println("Quantity of the product: "+quantity);
        System.out.println("Total : "+calculateTotal());
	}
	public double calculateTotal()
	{
		return price*quantity;
		
	}
}
	class DiscountProduct extends product 
	{

		public double discount;
		public DiscountProduct(String name, double price, double quantity,double discount) 
		{
			super(name, price, quantity);
			this.discount =discount;
			
		}
		public void displayDetails()
		{
			super.displayDetails();
		}
		public double calculateTotal()
		{
			double total =super.calculateTotal();
			System.out.println("Total Without discount:  "+total);
			return total-((total*discount)/100);
		}

		
		
	}
	
	
	
	





     public class SinglrLevelInheritanceq2 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name,price,quantity and disount");
    String name=sc.nextLine();
    double price=sc.nextDouble();
    double quantity=sc.nextDouble();
    double discount=sc.nextDouble();
    DiscountProduct d= new DiscountProduct(name,price,quantity,discount);
    d.displayDetails();
    
    


	}

}
