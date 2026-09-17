package arrayProgrammes;

import java.util.Scanner;

public class SumOfRowsAndColumns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of first matrix: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns of first matrix: ");
		int columns=sc.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				
			}
			System.out.println("Sum of"+(i+1)+" row: "+sum);
		}
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[j][i];
				
			}
			System.out.println("Sum of"+(i+1)+" Column: "+sum);
		}
		

	}

}
