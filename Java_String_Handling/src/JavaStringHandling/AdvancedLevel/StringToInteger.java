package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Not a valid integer.");
        }
        sc.close();
    }
}
