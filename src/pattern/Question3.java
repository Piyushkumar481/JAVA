package pattern;

public class Question3 {

	public static void main(String[] args) {
		int sum=-1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print(sum += 2);
					System.out.print("  ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			System.out.println();
		}

	}

}
