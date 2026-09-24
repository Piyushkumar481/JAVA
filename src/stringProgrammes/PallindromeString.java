package stringProgrammes;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}

}
