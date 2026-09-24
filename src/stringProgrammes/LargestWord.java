package stringProgrammes;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s =sc.nextLine();
		String[]a=s.split(" ");
		String result="";
		
		
			int maxLength=0;
			for(String e:a)
			{
				if(e.length()>maxLength)
				{
					maxLength=e.length();
				}
			}
			for(String e:a)
			{
				if(e.length()==maxLength)
				{
					System.out.println(e);
				}
			}
		}

	}


