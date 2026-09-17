package arrayProgrammes;

import java.util.Scanner;
 

public class EvenNumber {
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
	for(int i=0;i<=a.length-1;i++)
	{
		if(i%2==0)
		{
			System.out.println(a[i]+ " ");
		}
	}
}
}



