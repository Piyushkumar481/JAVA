package arrayProgrammes;

import java.util.Scanner;

public class EqualMatrices {


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
			System.out.println("Enter number of second rows: ");
			int rows2=sc.nextInt();
			System.out.println("Enter number of second columns: ");
			int columns2=sc.nextInt();
			int b[][] = new int[rows2][columns2];
			System.out.println("Enter the matrix: ");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
		
			boolean equal=true;
			outer:
			for(int i=0;i<a.length;i++)
			{
				inner:
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						equal=false;
						break outer;
					}
				}
				 if(equal)
				 {
					 System.out.println("Matrices aree equal");
				 }
				 else
				 {
					 System.out.println("Matrices are not equal");
				 }
			}
			
			

		}

	}


