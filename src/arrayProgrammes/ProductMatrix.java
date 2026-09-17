package arrayProgrammes;

import java.util.Scanner;

public class ProductMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of first matrix: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns of first matrix: ");
		int columns=sc.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter number of second rows: ");
		int rows2=sc.nextInt();
		System.out.println("Enter number of second columns: ");
		int columns2=sc.nextInt();
		int b[][] = new int[rows2][columns2];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int[][]c = new int[a.length][b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				int sum=0;
				for(int k=0;k<=a.length-1;k++)
				{
					sum=sum+a[i][k]*b[k][j];
					
				}
				c[i][j] = sum;
			}
		}
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();
		
	}

}
