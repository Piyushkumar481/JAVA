package arrayProgrammes;

import java.util.Scanner;

public class MacmSubarray {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i <= a.length-1; i++) {
	            a[i] = sc.nextInt();
	        }
	        int maxSum=Integer.MIN_VALUE;
	     
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
				
			{
				int sum = 0;
				
				
				for(int m=i;m<=j;m++)
				{
					sum=sum +a[m];
				}
				if(sum>maxSum)
				{
					maxSum=sum;
					
			}
		}

	}
		System.out.println("Maximum sub-array sum is: "+maxSum);

}


	}


