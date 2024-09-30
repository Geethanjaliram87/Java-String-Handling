package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = sc.nextLine();

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversedStr);
        sc.close();
    }
}
