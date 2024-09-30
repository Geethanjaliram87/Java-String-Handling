package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;

public class CheckDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Does the string contain only digits? " + input.matches("\\d+"));
        sc.close();
    }
}
