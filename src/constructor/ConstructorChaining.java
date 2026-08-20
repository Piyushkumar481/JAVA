package constructor;

public class ConstructorChaining {

	public static void main(String[] args) 
	{
		Student01 s1=new Student01("Abhi",501,21,98.34);
		Student01 s2=new Student01("Suma",505,20,64.55,"Hyderabad");
		s1.displayDetails();
		System.out.println("--------------");
		s2.displayDetails();
		
		

	}
}
	class Student01
	{
		public String name;
		public int StudentId;
		public int age;
		public double percentage;
		public String city;
		public Student01(String name, int StudentId,int age,double percentage)
		{
			this.name=name;
			this.StudentId=StudentId;
			this.age=age;
			this.percentage=percentage;
			
		}
		public Student01(String name, int StudentId,int age,double percentage,String city)
		{
			this(name,StudentId,age,percentage);
			this.city=city;
			
		}
		
		public void displayDetails()
		{
			System.out.println("name : "+name);
			System.out.println("Student id : "+StudentId);
			System.out.println("age : "+age);
			System.out.println("percentage : "+percentage);
			System.out.println("City : "+city);
		}
	}


