package arrayProgrammes;

import java.util.Scanner;

public class nthSmallest {
	

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

	        System.out.println("Enter n value: ");
	       
	        int n = sc.nextInt();
	        

	        
	        for(int i=0;i<=a.length-1;i++)
	        {
	        	int count=0;
	        	for(int j=0;j<=a.length-1;j++)
	        	{
	        		if(a[j]<a[i]) 
	        		{
	        			count++;
	        		}
	        	}
	        	if(count==(n-1))
	        	{
	        		System.out.println("Result : "+a[i]);
	        		break;
	        	}
	        }
	        
	        
	        
	      

	}

}
