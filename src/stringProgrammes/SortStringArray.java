package stringProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Array size : ");
		 int size=sc.nextInt();
		 String[]a=new String[size];
		 sc.next();
		 System.out.println("Enter array elements one by one : ");
		 for(int i=0;i<=a.length-1;i++)
		 {
			 a[i]=sc.nextLine();
		 }

	      for(int k=0;k<=a.length-1;k++)
	      {
	    	  for(int j=k+1;j<=a.length-1;j++)
	    	  {
	    		  if(a[k].compareTo(a[j])>0)
	    		  {
	    			  String temp = a[j];
	    			  a[j]=a[k];
	    			  a[j]=temp;
	    		  }
	    	  }
	      }
	      System.out.println(Arrays.toString(a));

	}

}
