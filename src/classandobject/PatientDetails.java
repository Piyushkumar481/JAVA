package classandobject;

import java.util.Scanner;

class Patient
{
	public String name;
	public int age;
	public String disease;
	public Patient(String name, int age, String disease) {
		
		this.name = name;
		this.age = age;
		this.disease = disease;
		
		
	}
	public void displayPatientInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("disease: "+disease);
		
	}
	public void checkCritical()
	{
		if(age>60)
		{
			System.out.println("High Risk Patient");
		}
	}
	
	
}



public class PatientDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name= sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Disease Name: ");
		String disease=sc.nextLine();

		Patient p = new Patient(name,age,disease);
		p.displayPatientInfo();
		
		p.checkCritical();
		
	}

}
