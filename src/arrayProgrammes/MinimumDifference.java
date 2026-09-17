package arrayProgrammes;

import java.util.Scanner;



public class MinimumDifference {

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
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<=a.length-1;i++)
	        {
	        	for(int j=i+1;j<=a.length-1;j++)
	        	{
	        		if(a[i]>a[j] && a[i]-a[j]<min)
	        			
	        		{
	        			min=a[i]-a[j];
	        		}
	        		else if(a[i]<a[j] && a[j]-a[i]<min)
	        		{
	        			min=a[j]-a[i];
	        		}
	        		
	        		
	        	}
	        }
	        System.out.println("Minimum Difference = "+min);

	}

}
