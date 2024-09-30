package JavaStringHandling.AdvancedLevel;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
        sc.close();
    }

    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
