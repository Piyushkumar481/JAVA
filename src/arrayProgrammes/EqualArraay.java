package arrayProgrammes;

import java.util.Scanner;

public class EqualArraay {

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
	
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=b.length-1;j++)
		{
			if(a[i]!=a[j])
			{
				System.out.println("Array are not equal");
				break;
			}
			else
			{
				System.out.println("Array are equal");
			}
		}
	}
}
}
