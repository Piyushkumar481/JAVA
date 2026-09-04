package arrayProgrammes;

import java.util.Scanner;

public class Largestelement {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        int largest = a[0];
	        for(int e:a)
	        {
	        	if(e>largest)
	        	largest=e;
	        }

	        System.out.println("Largest element is: "+largest);
	}

}
