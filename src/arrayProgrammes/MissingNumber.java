package arrayProgrammes;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args)
	{
		
			 Scanner sc = new Scanner(System.in);

		        System.out.println("Enter array Size");
		        int size = sc.nextInt();

		        int a[] = new int[size];

		        System.out.println("Enter array elements");

		        for (int i = 0; i < a.length; i++) {
		            a[i] = sc.nextInt();
		            
		            
		        }
		    
		        int n = a.length-1;
		        int total= n*(n+1)/2;
		        int currSum=0;
		        
		        for(int e:a)
		        {
		        	currSum=currSum+e;
		        }
		        int missing=total-currSum;
		        System.out.println("Missing: "+missing);
		        
		        
		        

	}

}
