package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;

public class ContainsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Enter the sequence to check:");
        String sequence = sc.nextLine();
        System.out.println("Does the string contain the sequence? " + input.contains(sequence));
        sc.close();
    }
}
