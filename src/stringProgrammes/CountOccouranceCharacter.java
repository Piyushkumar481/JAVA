package stringProgrammes;

import java.util.Scanner;

public class CountOccouranceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		System.out.println("Enter a Character");
		char ch=sc.next().charAt(0);
	
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Count = "+count);

	}

}
