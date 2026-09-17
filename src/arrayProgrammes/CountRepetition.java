package arrayProgrammes;

import java.util.Scanner;

public class CountRepetition {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++)
	        {
	            a[i] = sc.nextInt();
	        }

	        System.out.println("Enter element to search");
	        int target=sc.nextInt();
	        int count =0;
	        
	        for(int e:a)
	        {
	        	if(e==target)	
	        		{
	        		count++;
	        		}
	}
	        System.out.println(target+" appeared " +count+ " times");

}
}
