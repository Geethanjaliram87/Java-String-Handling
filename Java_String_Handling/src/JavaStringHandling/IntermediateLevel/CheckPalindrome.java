package JavaStringHandling.IntermediateLevel;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome: " + isPalindrome);
        sc.close();
    }
}
