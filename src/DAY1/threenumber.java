package DAY1;

public class threenumber {

	public static void main(String[] args) {
		  int a=20;
	        int b=30;
	        int c=40;

	        int result = (a>b && a>c)? a :(b>c)? b:c;
	        System.out.println("Largest Element is:" +result);
	}

}
