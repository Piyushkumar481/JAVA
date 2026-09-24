package stringProgrammes;

import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		String result="";
		System.out.print("Duplicate characters are");
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch =s.charAt(i);
			if(!result.contains(" "+ch))
			{
				result+=ch;
			}
			else
			{
				System.out.println(ch+" ");
			}
		}
	}

}
