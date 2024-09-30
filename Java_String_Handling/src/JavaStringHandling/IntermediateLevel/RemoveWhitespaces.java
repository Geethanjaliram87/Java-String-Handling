package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with whitespaces:");
        String str = sc.nextLine();

        String noWhitespaces = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                noWhitespaces += str.charAt(i);
            }
        }

        System.out.println("String without whitespaces: " + noWhitespaces);
        sc.close();
    }
}
