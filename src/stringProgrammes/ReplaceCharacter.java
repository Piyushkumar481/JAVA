package stringProgrammes;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		System.out.println("Enter which character should be replaced : ");
		char oldChar=sc.next().charAt(0);
		System.out.println("Enter by which character the another charater should be replace");
		char newChar=sc.next().charAt(0);
		s=s.replace(oldChar, newChar);
		System.out.println("Result = "+s);
		

	}
	

}
