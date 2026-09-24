package stringProgrammes;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First String :");
		String s1 =sc.nextLine();
		System.out.println("Enter a Second String :");
		String s2 =sc.nextLine();
		
		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		

		

	}

}
