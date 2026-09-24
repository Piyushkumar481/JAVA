package stringProgrammes;

import java.util.Scanner;

public class CheckDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		boolean isPresent=true;
		for(int i=0;i<=s.length()-1;i++)
		{
			
	
				char ch =s.charAt(i);
				if(!(ch>='0' && ch<='9'))
				{
					isPresent=false;
					break;
				}
			
		}
		if(isPresent)
		{
       System.out.println("String has only digits");
	 }
		else
		{
			System.out.println("String don't have only digits");
		}

}
}
