package arrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	            
	            
	        }
	       for(int i=1;i<=a.length-1;i++)
	       {
	    	   int currIndex=a[i];
	    	   int j=i-1;
	    	  while(j>=0 && a[j]>currIndex)
	    	  {
	    		a[j+1]=a[j];
	    		j--;
	    	  }
	    		  
	    	  a[j+1]=currIndex;
	    	  
	       }
	       System.out.println(Arrays.toString(a));
	      
	    	   
	      

	}

}
