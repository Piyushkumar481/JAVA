package inheritance;

import java.util.Scanner;

class Animal
{
	 public String Name;
	 public int age;
	 public Animal(String name, int age) {
		
		Name = name;
		this.age = age;
	 }
	 public void displaydetails()
	 {
		 System.out.println("Name: " +Name);
		 System.out.println("Age: " +age);
	 }
	 public void eat()
	 {
		 System.out.println("Eating Food");
	 }
	 
	 
}
class dog extends Animal
{
	public String breed;

	public dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("Breed: "+breed);
	}
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}

public class SingleLevelInheritanceq1 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, age ,and breed of the Dog");
		String name =sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String breed=sc.nextLine();
		dog d = new dog(name,age,breed);
		d.displaydetails();
		d.eat();
		d.bark();
		
	}

}
