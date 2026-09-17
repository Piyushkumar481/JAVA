package arrayProgrammes;

import java.util.Scanner;

public class FrequencyOfOddandEvenInMatrix {
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
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]%2==0)
			{
				evenCount++;
			
				
			}
			else
			{
				oddCount++;
			}
				
			
		}
			
			
		}
	System.out.print("Frequency Of even Number "+evenCount);
	System.out.print("Frequency Of Odd Number "+oddCount);
		
}
}



