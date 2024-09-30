package JavaStringHandling.AdvancedLevel;

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Longest substring without repeating characters: " + longestSubstring(input));
        sc.close();
    }

    public static String longestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int substringStart = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, i);
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                substringStart = start;
            }
        }
        return str.substring(substringStart, substringStart + maxLength);
    }
}
