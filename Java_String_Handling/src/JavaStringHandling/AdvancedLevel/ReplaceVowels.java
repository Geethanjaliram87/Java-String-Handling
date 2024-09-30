package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("String after replacing vowels: " + replaceVowels(input));
        sc.close();
    }

    public static String replaceVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]", "*");
    }
}
