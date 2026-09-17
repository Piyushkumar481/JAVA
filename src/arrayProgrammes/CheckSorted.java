package arrayProgrammes;

import java.util.Scanner;

public class CheckSorted {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	      System.out.println("Enter array Size");
	      int size = sc.nextInt();

	      int a[] = new int[size];

	      System.out.println("Enter array elements");
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]= sc.nextInt();
		}
		boolean isArrayinAscendingOrder = true;
		for(int i=0;i<=a.length-2;i++)
		{
			if(a[i+1]<a[i])
			{
				isArrayinAscendingOrder = false;
				break;
			}
		}
		if(isArrayinAscendingOrder)
		{
			System.out.println("Array in ascending order");
		}
		else
		{
			System.out.println("Array is not in ascending order");
		}

	}

}
