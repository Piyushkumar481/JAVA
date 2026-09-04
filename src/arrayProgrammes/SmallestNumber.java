package arrayProgrammes;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        int smallest = a[0];
	        for(int e:a)
	        {
	        	if(e<smallest)
	        	{
	        		smallest=e;
	        	}
	        }
	        System.out.println("Smallest element is: "+smallest);
	        
	     
	        
	}
	
	

}
