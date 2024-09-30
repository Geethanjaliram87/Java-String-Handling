package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;

public class CustomTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();
        System.out.println("String after custom trim: '" + customTrim(input) + "'");
        sc.close();
    }

    public static String customTrim(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return str.substring(start, end + 1);
    }
}

