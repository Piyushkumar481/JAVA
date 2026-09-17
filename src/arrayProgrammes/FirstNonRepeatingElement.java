package arrayProgrammes;

import java.util.Scanner;

public class FirstNonRepeatingElement {

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
		boolean noRepeated = false;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			int count = 0;
		
			for(int j=0;j<=a.length-1;j++)
			
			{
				if(a[j]==a[i])
				{
				count++;
				}
			}
			if(count==1)
			{
				noRepeated = true;
				System.out.println("First non repeated: "+a[i]);
				break;
			}
		}
		if(noRepeated==false)
		{
			System.out.println("There is no non-repeated element");
		}

	}

}
