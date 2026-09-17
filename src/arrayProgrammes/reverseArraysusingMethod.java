package arrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArraysusingMethod {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	       System.out.println("result :" +Arrays.toString(reverseArray(a)));
	}
	public static int[] reverseArray(int a[])
	{
		 int x=0;
		    int y=a.length-1;
		    
		    while(x<y)
		    {
		    	int temp = a[x];
		    	a[x]=a[y];
		    	a[y]=temp;
		    	x++;
		    	y--;
		    }
		    return a;
	}

}
