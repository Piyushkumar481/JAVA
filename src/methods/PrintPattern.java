package methods;

public class PrintPattern {

	public static void printPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
				 System.out.print(" * ");
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern();
	}
}
