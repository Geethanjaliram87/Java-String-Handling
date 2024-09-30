package JavaStringHandling.AdditionalPrograms;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to compress:");
        String input = sc.nextLine();
        System.out.println("Compressed string: " + compress(input));
        sc.close();
    }

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
