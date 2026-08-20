package classandobject;

import java.util.Scanner;

class Book
	{
		
		public String bookName;
		public String authorName;
		public double price;
		public Book(String bookName, String authorName, double price) 
		{
		
			this.bookName = bookName;
			this.authorName = authorName;
			this.price = price;
		}
		public void displayBookInfo()
		{
			System.out.println("Book name "+bookName);
			System.out.println("Author name "+authorName);
			System.out.println("Price "+price);
		}
		public void issueBook()
		{
			System.out.println("Book issued successfully: "+bookName);
		}
	
		
	}
	public class BookClass {
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter bookName, authorname, and price");
			String bookName=sc.nextLine();
			String authorName=sc.nextLine();
			double price=sc.nextDouble();
			
			Book b1=new Book(bookName, authorName, price);
			b1.displayBookInfo();
			b1.issueBook();
			
			
			

		}
		}
	
	




