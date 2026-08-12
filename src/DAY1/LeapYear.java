package DAY1;

public class LeapYear {

	public static void main(String[] args) {
		int year=2027;
		String leap = (year%4==0)? "Leap Year" : "Not leap Year";
		System.out.println(leap);

	}

}
