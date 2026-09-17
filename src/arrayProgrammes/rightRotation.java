package arrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class rightRotation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	      System.out.println("Enter array Size");
	      int size = sc.nextInt();

	      int a[] = new int[size];

	      System.out.println("Enter array elements");
	    
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]= sc.nextInt();
		}
		  System.out.println("Enter k value");
	      int k =sc.nextInt();
	      
	      for(int j=1;j<=k;j++)
	      {
	    	  int temp=a[a.length-1];
	    	  for(int i=a.length-2;i>=0;i--)
	    	  {
	    		  a[i+1]=a[i];
	    	  }
	    	  a[0]=temp;
	      }
	      System.out.println("Array after " +k+ "right rotations: "+Arrays.toString(a));

	}

}
