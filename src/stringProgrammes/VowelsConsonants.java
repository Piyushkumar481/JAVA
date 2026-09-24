package stringProgrammes;

import java.util.Scanner;
 
public class VowelsConsonants {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String :");
	String s =sc.nextLine();
	
	int vowel=0;
	int consonant=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowel++;
		}
		else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		{
			consonant++;
		}
		
	}
	System.out.println("Vowels Count: "+vowel);
	System.out.println("Consonants Count: "+consonant);
}
}
