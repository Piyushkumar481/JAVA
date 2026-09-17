package arrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i <= a.length-1; i++) {
	            a[i] = sc.nextInt();
	        }
	        for(int k=0;k<=a.length;k++)
	        {
	        	for(int j=k+1;j<=a.length-1;j++)
	        	{
	        		if(a[k]<a[j])
	        		{
	        			int temp =a[k];
	        			a[k]=a[j];
	        			a[j]=temp;
	        		}
	        		
	        	}
	        	
	        }
	        System.out.println("Result is: "+Arrays.toString(a));
	        
				

	}

}
