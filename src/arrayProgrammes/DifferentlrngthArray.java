package arrayProgrammes;


import java.util.Scanner;

public class DifferentlrngthArray {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter outer array Size");
    int outerSize=sc.nextInt();
    int a[][]=new int[outerSize][];
    System.out.println("Enter Array elements one by one: ");
    for(int i=0;i<=a.length-1;i++)
    {
    	System.out.println("Enter "+(i+1)+" inner array size");
    	int innerArraySize=sc.nextInt();
    	a[i]=new int[innerArraySize];
    	System.out.println("Enter "+(i+1)+" inner array elements one by one: ");
    	for(int j=0;j<=a[i].length-1;j++)
    	{
    		a[i][j]=sc.nextInt();
    	}
    	
    }
    System.out.println("Given Two directional jagged Array is: ");
    for(int i=0;i<=a.length-1;i++)
    {
    	for(int j=0;j<=a[i].length-1;j++)
    	{
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }

	}

}
