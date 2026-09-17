package arrayProgrammes;

import java.util.Scanner;

public class SparseMatrix {

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
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
				count++;
				}
				
			}
			
		}
		if(count>(a.length * a.length)/2)
		{
			System.out.println("Sparse Matrix");
		}
			
		else
		{
			System.out.println("Not sparse Matrix");
		}
	
	

	}

}
