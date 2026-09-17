package arrayProgrammes;

import java.util.Scanner;

public class Read2dArrrayFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter outer array Size");
		int size1=sc.nextInt();
		System.out.println("Enter inner array Size");
		int size2=sc.nextInt();
		int a[][]=new int[size1][size2];
		System.out.println("Enter 2-d Array element one by one: ");
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Given 2-d array is: ");
		
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
