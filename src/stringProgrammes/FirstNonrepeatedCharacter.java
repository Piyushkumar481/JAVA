package stringProgrammes;

import java.util.Scanner;

public class FirstNonrepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		
		boolean nonrepeated=false;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch =s.charAt(i);
			int count=0;
			for(int j=0;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				nonrepeated=true;
				System.out.println("First Non Repeated: "+ch);
				break;
			}
		}
		if(nonrepeated==false)
		{
			System.out.println("There is no non-repeated element");
		}


	}

}
