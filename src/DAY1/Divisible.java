package DAY1;

public class Divisible {

	public static void main(String[] args) {
		int a= 56;
		String result = (a%5==0 && a%11==0)? "Divisible by 5 and 11" : "Not Divisible";
		System.out.println(result);

	}

}
