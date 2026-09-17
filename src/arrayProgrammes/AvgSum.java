package arrayProgrammes;

import java.util.Scanner;

public class AvgSum {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        double sum = 0;
	        for(int e:a)
	        {
	        	sum+=e;
	        }

	        System.out.println("Average = "+(sum/a.length));
	}

}
