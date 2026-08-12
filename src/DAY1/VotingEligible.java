package DAY1;
import java.util.Scanner;

public class VotingEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age= sc.nextInt();
		
		if(age<=18)
		{
			System.out.println("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
			

	}

}
