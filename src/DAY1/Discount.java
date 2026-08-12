package DAY1;

import java.util.Scanner;
public class Discount
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
      

        int amt = sc.nextInt();
        int newamt = sc.nextInt();
        double c = sc.nextDouble();

        if(amt>=2000)
        {
            System.out.println("Discount Applied");
            newamt= (amt * 15)/100;
            c=amt-newamt;
            System.out.println("Final Bill: " +c);
        }

    }
}
