package stringProgrammes;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            boolean duplicate = false;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + ch;
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}