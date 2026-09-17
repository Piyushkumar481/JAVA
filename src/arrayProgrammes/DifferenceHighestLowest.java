package arrayProgrammes;

import java.util.Scanner;



public class DifferenceHighestLowest {
	public static void main(String[]args)
	{
		 Scanner sc = new Scanner(System.in);

	      System.out.println("Enter array Size");
	      int size = sc.nextInt();

	      int a[] = new int[size];

	      System.out.println("Enter array elements");
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]= sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int e:a)
		{
			if(e>max)
			{
				max=e;
			}
		
		if(e<min)
		{
			min=e;
			
		}
	}
	int diff= max-min;
	System.out.println("Largest= "+max);
	System.out.println("Smallest= "+min);
	System.out.println("Difference= "+diff);

}
}
