package arrayProgrammes;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int columns=sc.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given Matrix is:");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
