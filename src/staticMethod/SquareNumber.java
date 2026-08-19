package staticMethod;

import java.util.Scanner;

public class SquareNumber {
	public static void printSquare(int num)
	{
		int square=num*num;
		System.out.println(square);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
		printSquare(number);

	}

}
