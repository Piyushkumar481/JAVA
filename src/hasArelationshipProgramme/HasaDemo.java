package hasArelationshipProgramme;

import javax.net.ssl.SSLEngineResult;

class Engine
{
	String fuelType;
	double cc;
	public Engine(String fuelType, double cc) {
		
		this.fuelType = fuelType;
		this.cc = cc;
	}
	public void displayDetails()
	{
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Engine capacity: "+cc);
	}
	
}
class car
{
	String company;
	String colour;
	double topSpeed;
	Engine engine;
	public car(String company, String colour, double topSpeed, Engine engine) {
		
		this.company = company;
		this.colour = colour;
		this.topSpeed = topSpeed;
		this.engine = engine;
	}
	
public void displayDetails()
{
	System.out.println("Company Name: "+company);
	System.out.println("Colour: "+colour);
	System.out.println("Top speed: "+topSpeed);
	System.out.println("Engine Details :");
	engine.displayDetails();
}
	
}

public class HasaDemo {
	public static void main(String[] args) {
		Engine eng = new Engine("Petrol",1.5);
		car c = new car("Honda","Black",150,eng);
		c.displayDetails();
		
	}

}
