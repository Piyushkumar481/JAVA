package arrayProgrammes;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array Size");
	        int size = sc.nextInt();

	        int a[] = new int[size];

	        System.out.println("Enter array elements");

	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	            
	            
	        }
	        for(int i=0;i<a.length-1;i++)
	        {
	        	int count=0;
	        	for(int j=0;j<=a.length-1;j++)
	        	{
	        		if(a[i]==a[j])
	        		{
	        			count++;
	        			
	        		}
	        	
	        	}
	        	if(count >(a.length/2))
        		{
        			System.out.println(a[i]);
        			break;
        		}
        		else
        		{
        			System.out.println("No Majority element found");
        			break;
        		}
	        }
	}

}
