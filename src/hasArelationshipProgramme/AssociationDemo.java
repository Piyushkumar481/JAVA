package hasArelationshipProgramme;

class Pen
{
	String brand;
	String colour;
	String type;
	int price;
	public Pen(String brand, String colour, String type, int price) 
	{
	    this.brand = brand;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Colour : "+colour);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
	}
}
class Student
{
	String name;
	int age;
	int rollNumber;
	Pen pen;
	public Student(String name, int age, int rollNumber, Pen pen) {
		super();
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.pen = pen;
	}
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("Roll number : "+rollNumber);
		System.out.println("Pen Details: ");
		pen.displayDetails();
	}
	
}


public class AssociationDemo {

	public static void main(String[] args)
	{
		Pen p = new Pen("Reynold's","blue","Ball Point",10);
		Student s = new Student("Faruq",23,103,p);
		s.displayDetails();
		

	}

}
