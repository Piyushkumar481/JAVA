package arrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class PreviouslyPresented {

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
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
		if(isPreviouslyPresented(a,i)==false)
				{
			count++;
				}
		}
		int b[]=new int[count];
		int indexB = 0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(isPreviouslyPresented(a,i)==false)
			{
				b[indexB] = a[i];
				indexB++;
			}
		}
		System.out.println("Result = "+Arrays.toString(b));

	}
	public static boolean isPreviouslyPresented(int a[],int i)
	{
		boolean result=false;
		for(int j=0;j<=i-1;j++)
		{
			if(a[j]==a[i])
			{
				result=true;
				break;
			}
		}
		return result;
	}

}
