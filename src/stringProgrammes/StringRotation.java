package stringProgrammes;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1 =sc.nextLine();
		System.out.println("Enter second String");
		String s2 =sc.nextLine();
		if(s1.length()==s2.length() && (s1+s1).contains(s2))
		{
			System.out.println("String rotated");
		}
		else
		{
			System.out.println("Not Rotated");
		}

	}

}
