package stringProgrammes;

import java.util.Scanner;

public class CheckSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		System.out.println("enter the Sunstring: ");
		String sub=sc.nextLine();
		if(s.contains(sub))
		{
			System.out.println("Substring");
		}
		else
		{
			System.out.println("Not sub-string");
		}

	}

}
