package Encapsulation;

import java.util.Scanner;

class Product
{
	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId,String productName,double price)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=0;
	}
	public int getproductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		if(productId < 0)
		{
			System.out.println("Invalid ProductId");
		}
		else
		{
		this.productId=productId;
		}
	}
	public String getproductName()
	{
		return productName;
	}
	public void setName(String productName)
	{
		
		this.productName=productName;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		if(price<=0)
		{
			System.out.println("Invalid Price");
		}
		else
		{
			this.price=price;
		}
	}
	public void applyDiscount(double percentage)
	{
		double discountAmount = (price*percentage)/100;
		double newPrice = price-discountAmount;
		newPrice=price;
		
	}
}






public class q6Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductId");
		int productId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter ProductName");
		 String productName=sc.nextLine();
		 System.out.println("Enter Price");
		 double price=sc.nextDouble();
		 
		 System.out.println("Discount: ");
		 double percentage = sc.nextDouble();
		 
		 Product pd = new Product(productId,productName,price);
		 pd.setProductId(productId);
		 pd.setName(productName);
		 pd.setPrice(price);
		 pd.applyDiscount(percentage);
		
		 
		 System.out.println("Product ID: "+pd.getproductId());
		 System.out.println("Product Name: "+pd.getproductName());
		System.out.println("Discount: "+pd.getPrice());
		


	}

}
