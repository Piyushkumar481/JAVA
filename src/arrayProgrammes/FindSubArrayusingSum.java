package arrayProgrammes;

import java.util.Scanner;

public class FindSubArrayusingSum {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i <= a.length-1; i++) {
	            a[i] = sc.nextInt();
	        }
	  
	        System.out.println("Enter Target");
	        int target =sc.nextInt();	
	        boolean result =false;
	        int minIndex=0;
	        int maxIndex=0;
	        outer:
	        	
	        for(int i=0;i<=a.length-1;i++)
		{
	        	
		inner:
			for(int j=i;j<=a.length-1;j++)
			{
				int sum =0 ;
				for(int m = i;m<=j;m++)
				{
					sum=sum+a[m];
				}
				if(sum==target)
				{
					result=true;
					minIndex=i;
					maxIndex=j;
					break outer;
				}
				
			}
		
				
	}
	        if(result==true)
	        {
	        	for(int x= minIndex;x<=maxIndex;x++)
	        	{
	        		System.out.println(a[x]+"  ");
	        	}
	        }
	        else
	        {
	        	System.out.println("There is no sub-array which gives sum of "+target);
	        }

}
	
}
