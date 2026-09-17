package arrayProgrammes;

import java.util.Scanner;

public class intersection {
public static void main(String[]args)
{
	 Scanner sc = new Scanner(System.in);

     System.out.println("Enter first array Size");
     int size = sc.nextInt();

     int a[] = new int[size];

     System.out.println("Enter first array elements");
	
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]= sc.nextInt();
	}
	

     System.out.println("Enter second array Size");
     int size2 = sc.nextInt();

     int b[] = new int[size];

     System.out.println("Enter second array elements");
	
	for(int i=0;i<=a.length-1;i++)
	{
		b[i]= sc.nextInt();
	}
	for(int i=0;i<=a.length-1;i++)
	{
		boolean isPresent =false;
		for(int j=0;j<=b.length-1;j++)
		{
			if(b[j]==a[i])
			{
				isPresent = true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println(a[i]);
		}
	}
}
}
