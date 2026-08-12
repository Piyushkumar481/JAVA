package pattern;

public class Pyramid {
	public static void main(String[]args) {
	int space=4;
	int star=1;
	
     for(int i=1;i<=5;i++)
     { 
    	  //take a loop to print space
    	 for(int a=1;a<=space;a++)
    	 {
    		 System.out.print("   ");
    	 }
    	 //take a loop to print star
    	 for(int b=1;b<=star;b++)
    	 {
    		 System.out.print(" * ");
    	 }
    	 space--;
    	 star+=2;
    	 System.out.println();
     }
}
}
