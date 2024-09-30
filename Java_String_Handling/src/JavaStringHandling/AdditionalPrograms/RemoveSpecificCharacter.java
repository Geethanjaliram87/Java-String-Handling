package JavaStringHandling.AdditionalPrograms;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char ch = sc.nextLine().charAt(0);
        System.out.println("String after removal: " + removeCharacter(str, ch));
        sc.close();
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
