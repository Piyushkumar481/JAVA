package arrayProgrammes;

import java.util.Scanner;

public class UnionArray {
	public static void main(String[] args) {
		
	

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

	int count=0;
	for(int i=0;i<=b.length-1;i++)
	{
		boolean isPresent=false;
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]==b[i])
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent==false)
		{
			count++;
		}
	}
	int []c=new int[a.length+count];
	for(int i=0;i<a.length-1;i++)
	{
		c[i] = a[i];
	}
	int index =a.length;
	for(int i=0;i<=b.length-1;i++)
	{
		boolean isPresent = false;
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]==b[i])
			{
				isPresent = true;
				break;
			}
		}
		if(isPresent==false)
		{
			c[index]=b[i];
			index++;
		}
	}
}
}
