package classandobject;

class MobilePhone
{
	public String brand;
	public int price;
	public int batteryPercentage;
	
	public MobilePhone(String brand,int price,int batteryPercentage)
	{
		this.brand=brand;
		this.price=price;
		this.batteryPercentage=batteryPercentage;
	}
	public void chargeBattery(int amount)
	{
		batteryPercentage=batteryPercentage+amount;
		  if (batteryPercentage > 100) {
	            batteryPercentage = 100;
	        }

     
		
		
	}
	public void useMobile(int amount)
	{
		batteryPercentage=batteryPercentage-amount;
		   if (batteryPercentage < 0) {
	            batteryPercentage = 0;
	            
	            
	        }
	}
	public void displayMobileInfo()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price: "+price);
		System.out.println("Battery Percentage: "+batteryPercentage+"%");
		
		
	}
}

public class Mobile {

	public static void main(String[] args) {
	MobilePhone m=new MobilePhone("Samsung", 12999, 70);
	   m.displayMobileInfo();

       m.chargeBattery(30);
       System.out.println("\nAfter charging:");
       m.displayMobileInfo();

       m.useMobile(40);
       System.out.println("\nAfter using mobile:");
       m.displayMobileInfo();
	}

}
