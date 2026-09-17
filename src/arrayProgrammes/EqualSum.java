package arrayProgrammes;

import java.util.Scanner;

public class EqualSum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	            
	            
	        }
	        System.out.println("Enter target Sum: ");
	        int target=sc.nextInt();
	        
	        for(int i=0;i<=a.length-1;i++)
	        {
	        	for(int j=i+1;j<=a.length-1;j++)
	        	{
	        		if(a[i]+a[j]==target)
	        		{
	        			System.out.println(a[i]+ " and " +a[j] +" are pairs ");
	        		}
	        	}
	        }

	}

}
