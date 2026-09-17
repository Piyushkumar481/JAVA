package arrayProgrammes;

import java.util.Scanner;

public class Repeatingelement2 {

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
		boolean isPreviouslyPresent= false;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			boolean repeated = false;
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]==a[i])
				{
					isPreviouslyPresent = true;
					break;
					
				}
			}
			if(isPreviouslyPresent==true)
			{
				repeated = true;
				System.out.println("First Repeated element : "+a[i]);
				
			}
			if(repeated==false)
			{
				System.out.println("No array elements are repeated");
			}

		}
		
	}

}
