package arrayProgrammes;

import java.util.Scanner;

public class subArraySum {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i <= a.length-1; i++) {
	            a[i] = sc.nextInt();
	        }
	        System.out.println("Sub arrays are : ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i;j<=a.length-1;j++)
				
			{
				System.out.print(i+" , "+j+" = ");
				for(int m=i;m<=j;m++)
				{
					System.out.print(a[m]+" ");
				}
				System.out.println();
			}
		}

	}

}
