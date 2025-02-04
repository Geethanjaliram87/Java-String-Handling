package JavaStringHandling.AdditionalPrograms;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        System.out.println("Are they rotations? " + isRotation(str1, str2));
        sc.close();
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        String combined = str1 + str1;
        return combined.contains(str2);
    }
}

