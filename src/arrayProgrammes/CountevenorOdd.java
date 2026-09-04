package arrayProgrammes;

import java.util.Scanner;

public class CountevenorOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter array elements");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int e : a) {
            if (e % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);

        sc.close();
    }
}